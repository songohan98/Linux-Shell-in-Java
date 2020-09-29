package uk.ac.ucl.jsh.application;

import uk.ac.ucl.jsh.Environment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grep implements Application {

    @Override
    public void exec(ArrayList<String> appArgs, OutputStream output) {
        OutputStreamWriter writer = new OutputStreamWriter(output);
        Environment.setWriter(writer);
        if (appArgs.size() == 0) {
            
            throw new RuntimeException("grep: wrong number of arguments");
        }
        Pattern grepPattern = Pattern.compile(appArgs.get(0));
        try{
        if (appArgs.size() == 1) {
            
            Scanner input = new Scanner(System.in);
            writer.write("Please enter your file :");
            writer.flush();
            String path = input.nextLine();
            String[] tempArray = path.split(" ");
            for (int i = 0; i < tempArray.length; i++) {
                appArgs.add(tempArray[i]);
            }}}
            catch (IOException e) {
                throw new RuntimeException("Error writing to outputstream");
            }

        
        
        int numOfFiles = appArgs.size() - 1;
        Path filePath;
        Path[] filePathArray = new Path[numOfFiles];
        Path currentDir = Paths.get(Environment.getCurrentDirectory());
        for (int i = 0; i < numOfFiles; i++) {
            filePath = currentDir.resolve(appArgs.get(i + 1));
            if (Files.notExists(filePath) || Files.isDirectory(filePath) ||
                    !Files.exists(filePath) || !Files.isReadable(filePath)) {
                throw new RuntimeException("grep: wrong file argument");
            }
            filePathArray[i] = filePath;
        }
        for (int j = 0; j < filePathArray.length; j++) {
            Charset encoding = StandardCharsets.UTF_8;
            try (BufferedReader reader = Files.newBufferedReader(filePathArray[j], encoding)) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    Matcher matcher = grepPattern.matcher(line);
                    if (matcher.find()) {
                        writer.write(line);
                        writer.write(System.getProperty("line.separator"));
                        writer.flush();
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException("grep: cannot open " + appArgs.get(j + 1));
            }
        }
    }
}
