package uk.ac.ucl.jsh.application;

import java.io.OutputStream;
import java.util.ArrayList;

public interface Application {
    void exec(ArrayList<String> appArgs, OutputStream output);
}

