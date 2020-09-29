package uk.ac.ucl.jsh;

import org.junit.Test;
import uk.ac.ucl.jsh.application.Echo;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class EchoTest {
    public EchoTest() {
    }
    @Test
    public void testEcho() throws Exception {
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream(in);

        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello     world");
        
        Echo echo = new Echo();
        echo.exec(arr,out);
        Scanner scan = new Scanner(in);
        String expected = scan.nextLine();
        String actual = "hello     world";
        assertEquals(expected,actual);
    }

}
