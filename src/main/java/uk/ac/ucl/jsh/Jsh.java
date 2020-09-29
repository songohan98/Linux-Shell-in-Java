package uk.ac.ucl.jsh;

import java.io.StringReader;
import java.util.Scanner;

public class Jsh {

    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            if (args.length != 2) {
                System.out.println("jsh: wrong number of arguments");
                return;
            }
            if (!args[0].equals("-c")) {
                System.out.println("jsh: " + args[0] + ": unexpected argument");
                return;
            }
            Parser parser = new Parser(new Lexer(new StringReader(args[1])));
            parser.parse();
        } else {
            try (Scanner input = new Scanner(System.in)) {
                while (true) {
                    String prompt = Environment.getCurrentDirectory() + "> ";
                    System.out.print(prompt);
                    String cmdline = input.nextLine();
                    Parser parser = new Parser(new Lexer(new StringReader(cmdline)));
                    parser.parse();
                }
            }
        }
    }
}
