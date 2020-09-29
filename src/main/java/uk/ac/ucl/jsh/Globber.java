package uk.ac.ucl.jsh;

import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Globber {
    public static ArrayList<String> glob(String globpattern) {
        String location;
        if (globpattern.charAt(0) == '/') {
            location = "/";
            globpattern =  globpattern.substring(1);
        } else {
            location = Environment.getCurrentDirectory();
        }
        System.out.println(location);
        System.out.println(globpattern);
        final PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:" + globpattern);
        ArrayList<String> paths = new ArrayList<>();
        try {
            Files.walkFileTree(Paths.get(location), new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
                    if (pathMatcher.matches(path)) {
                        System.out.println(path.toString());
                        paths.add(path.toString());
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) {
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return paths;
    }
}
