package uk.ac.ucl.jsh.application;

import uk.ac.ucl.jsh.Environment;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Cat implements Application{

    
    @Override
    public void exec(ArrayList<String> appArgs, OutputStream output) {
        OutputStreamWriter writer = new OutputStreamWriter(output);
        Environment.setWriter(writer);
        if (appArgs.isEmpty()) {
            throw new RuntimeException("cat: missing arguments");
        } else {
            for (String arg : appArgs) {
                Charset encoding = StandardCharsets.UTF_8;
                File currFile = new File(Environment.getCurrentDirectory() + File.separator + arg);
                if (currFile.exists()) {
                    Path filePath = Paths.get(Environment.getCurrentDirectory() + File.separator + arg);
                    try (BufferedReader reader = Files.newBufferedReader(filePath, encoding)) {
                        String line = null;
                        while ((line = reader.readLine()) != null) {
                            writer.write(String.valueOf(line));
                            writer.write(System.getProperty("line.separator"));
                            writer.flush();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException("cat: cannot open " + arg);
                    }
                } else {
                    throw new RuntimeException("cat: file does not exist");
                }
            }
        }
    }
}
