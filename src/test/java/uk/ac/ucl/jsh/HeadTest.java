package uk.ac.ucl.jsh;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.ucl.jsh.application.Head;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class HeadTest {
    public HeadTest() {

    }

//    String directory = Environment.getCurrentDirectory();
//    File file = null;
//
//    @Before
//    public void setUp() throws IOException {
//        file = new File(directory + File.separator + "test1.txt");
//        String word1 = "World";
//        String word2 = "Hello";
//        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//        for (int i = 0; i < 15; i++) {
//            writer.write(word1 + "\n");
//        }
//        for (int i = 0; i < 15; i++) {
//            writer.write(word2 + "\n");
//        }
//
//        writer.close();
//    }
//
//    @Test
//    public void testHeadwithArg() throws IOException {
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("-n");
//        arr.add("15");
//        arr.add("test1.txt");
//        Head head = new Head();
//        head.exec(arr, out);
//
//        Scanner scan = new Scanner(in);
//        for (int i = 0; i < 15; i++) {
//            assertEquals(scan.nextLine(), "World");
//        }
//    }
//
//    @Test
//    public void testHeadwithoutArg() throws IOException {
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        ArrayList<String> arr = new ArrayList<>();
//
//        arr.add("test1.txt");
//
//        Head head = new Head();
//        head.exec(arr, out);
//        Scanner scan = new Scanner(in);
//        for (int i = 0; i < 10; i++) {
//            assertEquals(scan.nextLine(), "World");
//        }
//    }
//
//    @After
//    public void clearUp() {
//        file.delete();
//
//    }

}