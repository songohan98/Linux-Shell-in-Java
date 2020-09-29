package uk.ac.ucl.jsh.application;

import uk.ac.ucl.jsh.Environment;

import java.io.*;
import java.util.ArrayList;

import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.FileVisitResult.*;


public class Find implements Application{

    public static class Finder extends SimpleFileVisitor<Path> {

        private final PathMatcher matcher;
        private int numMatches = 0;
        OutputStream output;
        
        Finder(String pattern, OutputStream output) {
            matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
            this.output = output;
        }
        // Compares the glob pattern against
        // the file or directory name.
        void find(Path file) throws IOException {
            OutputStreamWriter writer = new OutputStreamWriter(output);
            Path name = file.getFileName();
            if (name != null && matcher.matches(name)) {
                numMatches++;
                writer.write(file.toString());
                writer.write(System.getProperty("line.separator"));
                writer.flush();
            }
        }


        // Prints the total number of
        // matches to standard out.
        void done() {
            System.out.println("Matched: "
                    + numMatches);
        }

        // Invoke the pattern matching
        // method on each file.
        @Override
        public FileVisitResult visitFile(Path file,
                                         BasicFileAttributes attrs) throws IOException {
            find(file);
            return CONTINUE;
        }

        // Invoke the pattern matching
        // method on each directory.
        @Override
        public FileVisitResult preVisitDirectory(Path dir,
                                                 BasicFileAttributes attrs) throws IOException {
            find(dir);
            return CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file,
                                               IOException exc) {
            System.err.println(exc);
            return CONTINUE;
        }
    }

    static void usage() {
        System.err.println(" Find <path>" +
                " -name \"<glob_pattern>\"");
        
    }


    @Override
    public void exec(ArrayList<String> appArgs, OutputStream output) {
        OutputStreamWriter writer = new OutputStreamWriter(output);
        Environment.setWriter(writer);
        Path startingDir;
        String pattern;
        if (appArgs.size() > 4 || !(appArgs.get(1).equals("-name") ||  appArgs.get(0).equals("-name"))){
            usage();}
        if(appArgs.get(0).equals("-name")){
            startingDir = Paths.get(Environment.getCurrentDirectory());
            pattern = appArgs.get(1);}
        else{
            startingDir = Paths.get(appArgs.get(0));
            pattern = appArgs.get(2);}

        try {
            Finder finder = new Finder(pattern,output);
            Files.walkFileTree(startingDir, finder);
            //finder.done();
        } catch (Exception e) {
            throw new RuntimeException("Error walking file tree");
        }
    }


}