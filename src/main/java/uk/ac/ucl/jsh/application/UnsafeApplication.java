package uk.ac.ucl.jsh.application;

import java.io.OutputStream;
import java.util.ArrayList;

public class UnsafeApplication implements Application {
    private Application application;

    public UnsafeApplication(Application application) {
        this.application = application;
    }

    @Override
    public void exec(ArrayList<String> appArgs, OutputStream output) {
        try {
            application.exec(appArgs, output);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
