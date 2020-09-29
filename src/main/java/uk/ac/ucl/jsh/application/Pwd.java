package uk.ac.ucl.jsh.application;

import uk.ac.ucl.jsh.Environment;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Pwd implements Application{

    @Override
    public void exec(ArrayList<String> appArgs, OutputStream output) {
        try {
            OutputStreamWriter writer = new OutputStreamWriter(output);
            Environment.setWriter(writer);
            writer.write(Environment.getCurrentDirectory());
            writer.write(System.getProperty("line.separator"));
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException("Error writing to outputstream");
        }
    }
}
