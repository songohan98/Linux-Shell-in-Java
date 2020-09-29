package uk.ac.ucl.jsh;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Environment {
    private static String currentDirectory = System.getProperty("user.dir");

    private static OutputStream output = System.out;

    private static OutputStreamWriter writer;


    public static String getCurrentDirectory() {
        return currentDirectory;
    }

    public static void setCurrentDirectory(String currentDirectory) {
        Environment.currentDirectory = currentDirectory;
    }

    public static OutputStreamWriter getWriter() {
        return writer;
    }

    public static void setWriter(OutputStreamWriter writer) {
        Environment.writer = writer;
    }

    public static OutputStream getOutput() {
        return output;
    }

    public static void setOutput(OutputStream output) {
        Environment.output = output;
    }
}
