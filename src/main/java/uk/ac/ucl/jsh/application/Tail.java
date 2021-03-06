package uk.ac.ucl.jsh.application;

import uk.ac.ucl.jsh.Environment;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Tail implements Application {

    @Override
    public void exec(ArrayList<String> appArgs, OutputStream output) {
        OutputStreamWriter writer = new OutputStreamWriter(output);
        Environment.setWriter(writer);
        if (appArgs.isEmpty()) {
            throw new RuntimeException("tail: missing arguments");
        }
        if (appArgs.size() != 1 && appArgs.size() != 3) {
            throw new RuntimeException("tail: wrong arguments");
        }
        if (appArgs.size() == 3 && !appArgs.get(0).equals("-n")) {
            throw new RuntimeException("tail: wrong argument " + appArgs.get(0));
        }
        int tailLines = 10;
        String tailArg;
        if (appArgs.size() == 3) {
            try {
                tailLines = Integer.parseInt(appArgs.get(1));
            } catch (Exception e) {
                throw new RuntimeException("tail: wrong argument " + appArgs.get(1));
            }
            tailArg = appArgs.get(2);
        } else {
            tailArg = appArgs.get(0);
        }
        File tailFile = new File(Environment.getCurrentDirectory() + File.separator + tailArg);
        if (tailFile.exists()) {
            Charset encoding = StandardCharsets.UTF_8;
            Path filePath = Paths.get((String) Environment.getCurrentDirectory() + File.separator + tailArg);
            ArrayList<String> storage = new ArrayList<>();
            try (BufferedReader reader = Files.newBufferedReader(filePath, encoding)) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    storage.add(line);
                }
                int index = 0;
                if (tailLines > storage.size()) {
                    index = 0;
                } else {
                    index = storage.size() - tailLines;
                }
                for (int i = index; i < storage.size(); i++) {
                    writer.write(storage.get(i) + System.getProperty("line.separator"));
                    writer.flush();
                }
            } catch (IOException e) {
                throw new RuntimeException("tail: cannot open " + tailArg);
            }
        } else {
            throw new RuntimeException("tail: " + tailArg + " does not exist");
        }
    }
}
