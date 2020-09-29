package uk.ac.ucl.jsh;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import uk.ac.ucl.jsh.application.Sed;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class SedTest {
    public SedTest() {

    }

//    static String directory = Environment.getCurrentDirectory();
//    static File file = null;
//
//    @Before
//    public  void setUp() throws IOException {
//        file = new File(directory + File.separator + "test1.txt");
//
//        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//
//        writer.write("First occurance of pattern : test Second occurance of pattern: test");
//
//        writer.flush();
//
//
//
//    }
//
//    @Test
//    public void testSedfirstSubstring() throws IOException {
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("s/test/complete");
//        arr.add("test1.txt");
//        Sed sed = new Sed();
//        sed.exec(arr,out);
//
//
//        BufferedReader objReader = new BufferedReader(new FileReader("test1.txt"));
//        assertEquals(objReader.readLine(),"First occurance of pattern : complete Second occurance of pattern: test");
//
//    }
//    @Test
//    public void testSedallSubstrings() throws IOException {
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("s/test/complete/g");
//        arr.add("test1.txt");
//        Sed sed = new Sed();
//        sed.exec(arr,out);
//
//        BufferedReader objReader = new BufferedReader(new FileReader("test1.txt"));
//        assertEquals(objReader.readLine(),"First occurance of pattern : complete Second occurance of pattern: complete");
//
//    }
//    @Test
//    public void testSednoFile() throws IOException {
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("s/test/complete/g");
//
//        ByteArrayInputStream input = new ByteArrayInputStream("test1.txt".getBytes());
//        System.setIn(input);
//
//
//        Sed sed = new Sed();
//        sed.exec(arr,out);
//
//
//        BufferedReader objReader = new BufferedReader(new FileReader("test1.txt"));
//        assertEquals(objReader.readLine(),"First occurance of pattern : complete Second occurance of pattern: complete");
//    }
//
//
//    @AfterClass
//    public static void clearUp() {
//
//        file.delete();
//
//
//
//    }

}