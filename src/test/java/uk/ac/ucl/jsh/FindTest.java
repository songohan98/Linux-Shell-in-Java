package uk.ac.ucl.jsh;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import uk.ac.ucl.jsh.application.Find;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class FindTest {
  
	public FindTest() {

    }

//     String directory = Environment.getCurrentDirectory();
//     static File file = null, file1 = null;

//     @Before
//     public void setUp() throws IOException {
//         file = new File(directory + File.separator + "test1.txt");
//         file1 = new File(directory + File.separator + "test2.txt");
//         BufferedWriter writer = new BufferedWriter(new FileWriter(file));
//         writer.write("test1");
//         writer.flush();
//         BufferedWriter writer1 = new BufferedWriter(new FileWriter(file1));
//         writer1.write("test2");
//         writer1.flush();
//     }
    
//     @Test
//     public void testFind() throws IOException {
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);   
       
//         ArrayList<String> arr = new ArrayList<>();
//         arr.add(directory);
//         arr.add("-name");
//         arr.add("test1.txt");        
        

//        Scanner scan = new Scanner(in);
//         Find find = new Find();
//         find.exec(arr, out);   
        
//         assertEquals(scan.nextLine(), directory + File.separator + "test1.txt");
        
//     }

// //    @Test
// //    public void testFindkleenStar() throws IOException {
// //       PipedInputStream in = new PipedInputStream();
// //       PipedOutputStream out = new PipedOutputStream(in);
// //
// //        ArrayList<String> arr = new ArrayList<>();
// //        arr.add(directory);
// //        arr.add("-name");
// //        arr.add("test*.txt");
// //
// //
// //
// //       Scanner scan = new Scanner(in);
// //
// //       Find find = new Find();
// //       find.exec(arr, out);
// //
// //        assertEquals(scan.nextLine(), directory + File.separator + "test1.txt");
// //        assertEquals(scan.nextLine(), directory + File.separator + "test2.txt");
// //
// //    }

//     @Test
//     public void testFindnoFile() throws IOException {
//        PipedInputStream in = new PipedInputStream();
//        PipedOutputStream out = new PipedOutputStream(in);
       
//         ArrayList<String> arr = new ArrayList<>();
//         arr.add("-name");
//         arr.add("test1.txt");          
        

//        Scanner scan = new Scanner(in);
        
//        Find find = new Find();
//        find.exec(arr, out);    
        
//         assertEquals(scan.nextLine(), directory + File.separator + "test1.txt");
        
//     }
//     @AfterClass
//     public static void clearUp() {
//         file.delete();
//         file1.delete();

//     }

}