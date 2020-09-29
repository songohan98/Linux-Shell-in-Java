package uk.ac.ucl.jsh;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.ucl.jsh.application.Wc;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class WcTest {
    public WcTest() {

    }
   

//    String directory = Environment.getCurrentDirectory();
//    File file = null, file1 = null;
//
//    private void setUp() throws IOException {
//        file = new File(directory + File.separator + "test1.txt");
//        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//        String word1 = "Hello World";
//        //Print 6 words on 3 lines to check wc
//        writer.write(word1);
//        writer.newLine();
//        writer.write(word1);
//        writer.newLine();
//        writer.write(word1);
//        writer.newLine();
//        writer.close();
//
//        file1 = new File(directory + File.separator + "test2.txt");
//
//        BufferedWriter writer1 = new BufferedWriter(new FileWriter(file1));
//        writer1.write(word1);
//        writer1.newLine();
//        writer1.write(word1);
//        writer1.newLine();
//        writer1.write(word1);
//        writer1.newLine();
//        writer1.close();
//    }
//
//    @Test
//    public void testWcwithArg_l() throws IOException {
//        setUp();
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("-l");
//        arr.add("test1.txt");
//
//        Wc wc = new Wc();
//        wc.exec(arr,out);
//        Scanner scan = new Scanner(in);
//        // file naturally has a line break that counts as line
//        assertEquals(scan.nextLine(), "Number of lines:4");
//        clearUp();
//    }
//
//    @Test
//    public void testWcwithArg_w() throws IOException {
//        setUp();
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("-w");
//        arr.add("test1.txt");
//
//        Wc wc = new Wc();
//        wc.exec(arr,out);
//        Scanner scan = new Scanner(in);
//
//        assertEquals(scan.nextLine(), "Number of words:6");
//        clearUp();
//    }
//    @Test
//    public void testWcwithArg_m() throws IOException {
//        setUp();
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("-m");
//        arr.add("test1.txt");
//
//        Wc wc = new Wc();
//        wc.exec(arr,out);
//        Scanner scan = new Scanner(in);
//        long expected = file.length();
//        assertEquals(scan.nextLine(), "Number of bytes:" + expected);
//        clearUp();
//    }
//    @Test
//    public void testWcwithTwoArgs() throws IOException {
//        setUp();
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("-w");
//        arr.add("-m");
//        arr.add("test1.txt");
//
//        Wc wc = new Wc();
//        wc.exec(arr,out);
//        Scanner scan = new Scanner(in);
//        long expected = file.length();
//        assertEquals(scan.nextLine(), "Number of words:6");
//        assertEquals(scan.nextLine(), "Number of bytes:" + expected);
//        clearUp();
//    }
//    @Test
//    public void testWcwithNoOptions() throws IOException {
//        setUp();
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("test1.txt");
//
//        Wc wc = new Wc();
//        wc.exec(arr,out);
//        Scanner scan = new Scanner(in);
//        long expected = file.length();
//
//        assertEquals(scan.nextLine(), "Number of words:6");
//        assertEquals(scan.nextLine(), "Number of lines:4");
//        assertEquals(scan.nextLine(), "Number of bytes:" + expected);
//        clearUp();
//    }
//    @Test
//    public void testWcwithNoArgs() throws IOException {
//        setUp();
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        String filename = "test1.txt";
//        long expected = file.length();
//
//        ArrayList<String> arr = new ArrayList<>();
//
//        ByteArrayInputStream input = new ByteArrayInputStream(filename.getBytes());
//        System.setIn(input);
//
//        Scanner scan = new Scanner(in);
//
//        Wc wc = new Wc();
//        wc.exec(arr,out);
//
//        assertEquals(scan.nextLine(),"Please enter your file :Number of words:6");
//        assertEquals(scan.nextLine(), "Number of lines:4");
//        assertEquals(scan.nextLine(), "Number of bytes:" + expected);
//        clearUp();
//    }
//    @Test
//    public void testWcwithNoArgswithOptions() throws IOException {
//        setUp();
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        String filename = "test1.txt";
//        long expected = file.length();
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("-w");
//        ByteArrayInputStream input = new ByteArrayInputStream(filename.getBytes());
//        System.setIn(input);
//
//        Scanner scan = new Scanner(in);
//
//        Wc wc = new Wc();
//        wc.exec(arr,out);
//
//        assertEquals(scan.nextLine(),"Please enter your file :Number of words:6");
//        clearUp();
//    }
//    @Test
//    public void testWctwoFiles() throws IOException {
//        setUp();
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("test1.txt");
//        arr.add("test2.txt");
//        Wc wc = new Wc();
//        wc.exec(arr,out);
//        Scanner scan = new Scanner(in);
//        long expected = file.length();
//
//        assertEquals(scan.nextLine(), "Number of words:6");
//        assertEquals(scan.nextLine(), "Number of lines:4");
//        assertEquals(scan.nextLine(), "Number of bytes:" + expected);
//        assertEquals(scan.nextLine(), "Number of words:6");
//        assertEquals(scan.nextLine(), "Number of lines:4");
//        assertEquals(scan.nextLine(), "Number of bytes:" + expected);
//        clearUp();
//    }
//
//    private void clearUp() {
//       file.delete();
//       file1.delete();
//
//    }

}