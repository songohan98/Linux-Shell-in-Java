package uk.ac.ucl.jsh;

import uk.ac.ucl.jsh.application.*;

public class AppFactory {
    private static AppFactory factory = null;

    public static AppFactory getInstance() {
        if (factory == null) {
            factory = new AppFactory();
        }
        return factory;
    }

    private AppFactory() {

    }

    public Application getApp(String arg) {
        if (arg.charAt(0) == '_') {
            return new UnsafeApplication(parseAppName(arg.substring(1)));
        } else {
            return parseAppName(arg);
        }
    }

    private Application parseAppName(String appName) {
        switch (appName) {
            case "wc":
                return new Wc();
            case "cd":
                return new Cd();
            case "pwd":
                return new Pwd();
            case "ls":
                return new Ls();
            case "cat":
                return new Cat();
            case "echo":
                return new Echo();
            case "head":
                return new Head();
            case "tail":
                return new Tail();
            case "grep":
                return new Grep();
            case "sed":
                return new Sed();
            case "find":
                return new Find();
            default:
                throw new RuntimeException(appName + ": unknown application");
        }
    }
}
