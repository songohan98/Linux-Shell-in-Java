package uk.ac.ucl.jsh;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import uk.ac.ucl.jsh.application.Grep;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class GrepTest {
    public GrepTest() {

    }

//    String directory = Environment.getCurrentDirectory();
//    static File file = null, file1 = null;
//
//    @Before
//    public void setUp() throws IOException {
//        file = new File(directory + File.separator + "test1.txt");
//
//        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//
//        writer.write("Hello World \n");
//        writer.write("This is a test \n");
//        writer.write("Heo Test");
//        writer.flush();
//
//        file1 = new File(directory + File.separator + "test2.txt");
//
//        BufferedWriter writer1 = new BufferedWriter(new FileWriter(file1));
//
//        writer1.write("Hello World \n");
//        writer1.write("This is a test \n");
//        writer1.write("Heo Test");
//        writer1.flush();
//
//
//    }
//
//    @Test
//    public void testGrepwithFile() throws IOException {
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("He");
//        arr.add("test1.txt");
//
//        Grep grep = new Grep();
//        grep.exec(arr, out);
//        Scanner scan = new Scanner(in);
//
//        assertEquals(scan.nextLine(),"Hello World ");
//        assertEquals(scan.nextLine(),"Heo Test");
//    }
//
//    @Test
//    public void testGrepwithoutFile() throws IOException {
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//        String filename = "test1.txt";
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("He");
//
//
//        ByteArrayInputStream input = new ByteArrayInputStream(filename.getBytes());
//        System.setIn(input);
//
//        Scanner scan = new Scanner(in);
//
//        Grep grep = new Grep();
//        grep.exec(arr, out);
//
//        assertEquals(scan.nextLine(),"Please enter your file :Hello World ");
//        assertEquals(scan.nextLine(),"Heo Test");
//        return;
//    }
//
//    @Test
//    public void testGrepmultFiles() throws IOException {
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("He");
//        arr.add("test1.txt");
//        arr.add("test2.txt");
//
//        Grep grep = new Grep();
//        grep.exec(arr, out);
//        Scanner scan = new Scanner(in);
//
//        assertEquals(scan.nextLine(),"Hello World ");
//        assertEquals(scan.nextLine(),"Heo Test");
//        assertEquals(scan.nextLine(),"Hello World ");
//        assertEquals(scan.nextLine(),"Heo Test");
//    }
//
//    @AfterClass
//    public static void clearUp() {
//        file.delete();
//        file1.delete();
//
//
//    }
//
}