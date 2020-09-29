package uk.ac.ucl.jsh;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Scanner;

public class JshTest {
    public JshTest() {
    }

    @Test
    public void testPassingCorrectNumberOfCmdlineArgs() {
        try {
            PipedInputStream in = new PipedInputStream();
            PipedOutputStream out = new PipedOutputStream(in);
            Environment.setOutput(out);
            String options = "-c";
            String command = "echo foo";
            String[] args = new String [2];
            args[0] = options;
            args[1] = command;
            Jsh.main(args);
            Scanner scn = new Scanner(in);
            assertEquals(scn.next(),"foo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
