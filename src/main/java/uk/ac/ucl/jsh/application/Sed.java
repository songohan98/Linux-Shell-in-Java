package uk.ac.ucl.jsh.application;

import uk.ac.ucl.jsh.Environment;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Sed implements Application {

    public String[] tokenChecker(ArrayList<String> appArgs){
        //checks whether the s/regex/replacement is present
        String argumentTokens[];
        String args = appArgs.get(0);
        argumentTokens = args.split("/|\\|");
//        for( String s:argumentTokens){
//            System.out.println(s);
//        }
//        System.out.println(argumentTokens.length);
        if (argumentTokens.length<3 || argumentTokens.length>4 || !argumentTokens[0].equals("s")){
            return null;
        }
        return argumentTokens;
    }


    public void execute(String[] tokens,File file) throws IOException {
        String regexp = tokens[1];
        String replacement = tokens[2];

        String g = null;
        if(tokens.length==4){
            g  = tokens[3];
        }

        Path path = Paths.get(file.toString());
        Charset charset = StandardCharsets.UTF_8;

        if(g!=null){
            if(!g.equals("g")){
                throw new RuntimeException("sed: wrong arguments");
            }
            else{
                String content = new String(Files.readAllBytes(path), charset);
                content = content.replaceAll(regexp, replacement);
                Files.write(path, content.getBytes(charset));
            }
        }
        else{
            String content;
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line;
            while((line=br.readLine())!=null){
                line = line.replaceFirst(regexp,replacement);
                sb.append(line);
                sb.append("\n");
            }
            fr.close();//need to close other resources as well
            content = sb.toString();
            Files.write(path, content.getBytes(charset));
        }


//        System.out.println(regexp);
//        System.out.println(replacement);
//        System.out.println(g);

    }
    @Override
    public void exec(ArrayList<String> appArgs, OutputStream output) {
        OutputStreamWriter writer = new OutputStreamWriter(output);
        Environment.setWriter(writer);
//        System.out.println(appArgs);
//        this method mostly handles errors
        String fileName;
        String argumentTokens[];
        if(appArgs.isEmpty()){
            throw new RuntimeException("sed: missing arguments");
        }
        else if(appArgs.size()>2){
            throw new RuntimeException("sed: too many arguments");
        }
        else if(appArgs.size()==1){
            argumentTokens = tokenChecker(appArgs);
            if(argumentTokens==null){
                throw new RuntimeException("sed: wrong arguments");
            }
            Scanner input = new Scanner(System.in);
            try {
                writer.write("Please enter your file :");
                writer.flush();

            } catch (IOException e) {
                throw new RuntimeException("Error writing to outputstream");
            }
            fileName = input.nextLine();
            try {
                File file = new File(Environment.getCurrentDirectory() + File.separator + fileName);
                execute(argumentTokens, file);
            } catch (IOException e) {
                throw new RuntimeException("sed: " + fileName + " does not exist");
            }
        }
        else{
            argumentTokens = tokenChecker(appArgs);
            if(argumentTokens==null){
                throw new RuntimeException("sed: wrong arguments");
            }
            fileName = appArgs.get(1);
            File file = new File(Environment.getCurrentDirectory() + File.separator + fileName);
            try {
                execute(argumentTokens, file);
            } catch (IOException e) {
                throw new RuntimeException("sed: " + fileName + " does not exist");
            }
        }
    }
}
