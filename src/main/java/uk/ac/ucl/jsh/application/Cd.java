package uk.ac.ucl.jsh.application;

import uk.ac.ucl.jsh.Environment;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Cd implements Application {

    @Override
    public void exec(ArrayList<String> appArgs, OutputStream output) {
        OutputStreamWriter writer = new OutputStreamWriter(output);
        Environment.setWriter(writer);
        if (appArgs.isEmpty()) {
            throw new RuntimeException("cd: missing argument");
        } else if (appArgs.size() > 1) {
            throw new RuntimeException("cd: too many arguments");
        }
        String dirString = appArgs.get(0);
        File dir = new File(Environment.getCurrentDirectory(), dirString);
        if (!dir.exists() || !dir.isDirectory()) {
            throw new RuntimeException("cd: " + dirString + " is not an existing directory");
        }
        try {
            String currentDirectory = dir.getCanonicalPath();
            Environment.setCurrentDirectory(currentDirectory);
        } catch (Exception e) {
            throw new RuntimeException("cd: can't find given directory");
        }
    }
}
