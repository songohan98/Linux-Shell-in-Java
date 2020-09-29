package uk.ac.ucl.jsh;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import uk.ac.ucl.jsh.application.Cat;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class CatTest {
    public CatTest() {
    }

    //  String directory = Environment.getCurrentDirectory();
    //  File file = null, file1 = null ;

    // private void setUp() throws IOException {
    //     file = new File(directory+File.separator+"test1.txt");
    //     String word1 = "Hello";
    //     BufferedWriter writer = new BufferedWriter(new FileWriter(file));
    //     writer.write(word1);
    //     writer.close();

    //     file1 = new File(directory+File.separator+"test2.txt");
    //     String word2 = "World";
    //     BufferedWriter writer2 = new BufferedWriter(new FileWriter(file1));
    //     writer2.write(word2);
    //     writer2.close();
    // }

    // @Test
    // public void testCatOnOneFile() throws Exception {
    //     setUp();
    //     PipedInputStream in = new PipedInputStream();
    //     PipedOutputStream out = new PipedOutputStream(in);

    //     ArrayList<String> arr = new ArrayList<>();
    //     arr.add("test1.txt");
    //     Cat cat = new Cat();
    //     cat.exec(arr, out);

    //     Scanner scan = new Scanner(in);

    //     assertEquals(scan.next(),"Hello");
    //     clearUp();
    // }

    // @Test
    // public void testCatOnTwoFiles() throws Exception {
    //     setUp();
    //     PipedInputStream in = new PipedInputStream();
    //     PipedOutputStream out = new PipedOutputStream(in);

    //     ArrayList<String> arr = new ArrayList<>();
    //     arr.add("test1.txt");
    //     arr.add("test2.txt");
    //     Cat cat = new Cat();
    //     cat.exec(arr, out);

    //     Scanner scan = new Scanner(in);

    //     //prints on a new line
    //     assertEquals(scan.next(),"Hello");
    //     assertEquals(scan.next(),"World");
    //     clearUp();
    // }

    // @Test(expected = RuntimeException.class)
    // public void testCatOnWrongFile() throws Exception {
    //     setUp();
    //     PipedInputStream in = new PipedInputStream();
    //     PipedOutputStream out = new PipedOutputStream(in);

    //     ArrayList<String> arr = new ArrayList<>();
    //     arr.add("notToBeFoundFile.txt");

    //     Cat cat = new Cat();
    //     cat.exec(arr, out);

    //     Scanner scan = new Scanner(in);

    //     //prints on a new line
    //     assertEquals(scan.next(),RuntimeException.class);
    //     clearUp();
    // }
    // 
    // @Test(expected = RuntimeException.class)
    // public void testCatnoArgs() throws Exception {
    //     setUp();
    //     PipedInputStream in = new PipedInputStream();
    //     PipedOutputStream out = new PipedOutputStream(in);

    //     ArrayList<String> arr = new ArrayList<>();
            

    //     Cat cat = new Cat();
    //     cat.exec(arr, out);


    //     Scanner scan = new Scanner(in);

    //     //prints on a new line
    //     assertEquals(scan.next(),RuntimeException.class);
    //     clearUp();
    // }
    // @Test(expected = NullPointerException.class)
    // public void testCatOnNull() throws Exception {
    //     setUp();
    //     PipedInputStream in = new PipedInputStream();
    //     PipedOutputStream out = new PipedOutputStream(in);

    //     Cat cat = new Cat();
    //     cat.exec(null, out);


    //     Scanner scan = new Scanner(in);

    //     //prints on a new line
    //     assertEquals(scan.next(),NullPointerException.class);
    //     clearUp();
    // }

    // private void clearUp(){
    //     file.delete();
    //     file1.delete();
    // }
}
