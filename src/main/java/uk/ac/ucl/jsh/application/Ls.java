package uk.ac.ucl.jsh.application;

import uk.ac.ucl.jsh.Environment;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ls implements Application{

    @Override
    public void exec(ArrayList<String> appArgs, OutputStream output) {
        OutputStreamWriter writer = new OutputStreamWriter(output);
        Environment.setWriter(writer);
        File currDir;
        if (appArgs.isEmpty()) {
            currDir = new File(Environment.getCurrentDirectory());
        } else if (appArgs.size() == 1) {
            currDir = new File(Environment.getCurrentDirectory()+File.separator+appArgs.get(0));
        } else {
            throw new RuntimeException("ls: too many arguments");
        }
        try {
            File[] listOfFiles = currDir.listFiles();
            boolean atLeastOnePrinted = false;
            if(listOfFiles.length!=0)
            for (File file : listOfFiles) {
                if (!file.getName().startsWith(".")) {
                    writer.write(file.getName());
                    writer.write("\t");
                    writer.flush();
                    atLeastOnePrinted = true;
                }
            }
            if (atLeastOnePrinted) {
                writer.write(System.getProperty("line.separator"));
                writer.flush();
            }
        } catch (NullPointerException e) {
            throw new RuntimeException("ls: no such directory");
        } catch (IOException e) {
            throw new RuntimeException("Error writing to outputstream");
        }
    }
}
