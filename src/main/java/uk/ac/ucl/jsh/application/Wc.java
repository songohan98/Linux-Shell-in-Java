package uk.ac.ucl.jsh.application;

import uk.ac.ucl.jsh.Environment;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Wc implements Application {
    private String currentDirectory = Environment.getCurrentDirectory();
    @Override
    public void exec(ArrayList<String> appArgs, OutputStream output) {
        OutputStreamWriter writer = new OutputStreamWriter(output);
        Environment.setWriter(writer);
        // function can have no arguments, but not more than 4
        String filepath;
        int flag = 0;
        ArrayList<String> newArray = new ArrayList<>();
        for (int n = 0; n < appArgs.size(); n++) {
            filepath = appArgs.get(n);
            File wc_filePath = new File(filepath);
            if (wc_filePath.exists()) {
                newArray.add(filepath);
                flag += 1;
            }}
            if (flag == 0) {
                Scanner input = new Scanner(System.in);
                try{
                writer.write("Please enter your file :");
                writer.flush();}
                catch (IOException e) {
                    throw new RuntimeException("Error writing to outputstream");
                }
                String filename = input.nextLine();
                String[] tempArray = filename.split(" ");
                for (int i = 0; i < tempArray.length; i++) {
                    newArray.add(tempArray[i]);
                }
            

        }

        int numOfFiles = newArray.size();

        Path filePath;
        Path[] filePathArray = new Path[numOfFiles];
        Path currentDir = Paths.get(currentDirectory);
        for (int i = 0; i < numOfFiles; i++) {
            filePath = currentDir.resolve(newArray.get(i));

            if (Files.notExists(filePath) || Files.isDirectory(filePath) || !Files.exists(filePath)
                    || !Files.isReadable(filePath)) {
                        
                throw new RuntimeException("wc: wrong file argument");
            }
            filePathArray[i] = filePath;
        }

        for (int j = 0; j < filePathArray.length; j++) {

            String wcPath = filePathArray[j].toString();

        File wc_filePath = new File(wcPath);

        // if none of the arguments are present, show all info
        if (!appArgs.contains("-w") && !appArgs.contains("-l") && !appArgs.contains("-m")) {
            try {
                Scanner sc = new Scanner(new FileReader(wc_filePath));
                int count = 0;
                while (sc.hasNext()) {
                    sc.next();
                    count++;
                }
                writer.write("Number of words:" + count + "\n");
                sc.close();
                LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(wc_filePath));
                int line0 = 0;
                while (lineNumberReader.skip(Long.MAX_VALUE) > 0) {
                    line0 = lineNumberReader.getLineNumber() + 1;

                }
                writer.write("Number of lines:" + line0 + "\n");
                writer.write("Number of bytes:" + wc_filePath.length() + "\n");
                lineNumberReader.close();
                writer.flush();
            } catch (FileNotFoundException e) {
                throw new RuntimeException("Error finding given file");
            } catch (IOException e) {
                throw new RuntimeException("Error writing to stream");
            }
        }
        // otherwise, show the info only if the corresponding argument is present
        else if (appArgs.contains("-w")) {
            try {
                Scanner sc = new Scanner(new FileReader(wc_filePath));
                int count = 0;
                while (sc.hasNext()) {
                    sc.next();
                    count++;
                }
                writer.write("Number of words:" + count + "\n");
                sc.close();
                writer.flush();
            } catch (FileNotFoundException e) {
                throw new RuntimeException("Error finding given file");
            } catch (IOException e) {
                throw new RuntimeException("Error writing to stream");
            }
        }
        if (appArgs.contains("-l")) {
            try {
                LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(wc_filePath));
                int line1 = 0;
                while (lineNumberReader.skip(Long.MAX_VALUE) > 0) {
                    line1 = lineNumberReader.getLineNumber() + 1;

                }
                writer.write("Number of lines:" + line1 + "\n");
                lineNumberReader.close();
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException("Error writing to stream");
            }
        }
        if (appArgs.contains("-m")) {
            try {
                writer.write("Number of bytes:" + wc_filePath.length() + "\n");
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException("Error writing to stream");
            }
        }
    }
}
}