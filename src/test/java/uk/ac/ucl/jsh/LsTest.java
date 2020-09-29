package uk.ac.ucl.jsh;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import uk.ac.ucl.jsh.application.Ls;

import java.io.File;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class LsTest {
    public LsTest() {
    }
//    String directory;
//    @Rule
//    public TemporaryFolder tempFolder = new TemporaryFolder();
//
//    @Test
//    public void testLsFunctionality() throws Exception {
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//        tempFolder.newFolder("File1");
//        tempFolder.newFolder("File2");
//        tempFolder.newFile("text1.txt");
//        tempFolder.newFile("text2.txt");
//        tempFolder.newFile(".file.txt");
//
//        File file = tempFolder.getRoot();
//        directory = file.getCanonicalPath();
//
//        Environment.setCurrentDirectory(directory);
//        ArrayList<String> arr = new ArrayList<>();
//
//        Ls ls = new Ls();
//        ls.exec(arr,out);
//        Scanner scan = new Scanner(in);
//        String actual = scan.nextLine();
//        String tab = "\t";
//        String expected = "text1.txt"+tab+ "File2"+tab+"text2.txt"+tab+"File1";
//
//        assertEquals(actual,expected);
//    }
//
//    @Test
//    public void testLsWithAnArgument() throws Exception {
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
//
//
//        File file = tempFolder.getRoot();
//        directory = file.getCanonicalPath();
//
//        tempFolder.newFolder("tempFolder","File1");
//        tempFolder.newFolder("tempFolder","text1.txt");
//
//
//        Environment.setCurrentDirectory(directory);
//        ArrayList<String> arr = new ArrayList<>();
//       arr.add("tempFolder");
//        Ls ls = new Ls();
//        ls.exec(arr,out);
//        Scanner scan = new Scanner(in);
//        String expected = scan.nextLine();
//        String tab = "\t";
//        String actual = "text1.txt"+tab+"File1"+tab;
//
//        assertEquals(expected.trim(),actual.trim());
//    }

}
