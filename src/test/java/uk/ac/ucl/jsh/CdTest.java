package uk.ac.ucl.jsh;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import uk.ac.ucl.jsh.application.Cd;
import uk.ac.ucl.jsh.application.Pwd;

import java.io.File;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class CdTest {
    public CdTest() {
    }
    String directory;
    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testCd() throws Exception {
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream(in);

        tempFolder.newFolder("tempFolder");

        File file = tempFolder.getRoot();
        directory = file.getCanonicalPath();

        ArrayList<String> arr = new ArrayList<>();
        arr.add("tempFolder");

        Environment.setCurrentDirectory(directory);
        Cd cd = new Cd();
        Pwd pwd = new Pwd();
        cd.exec(arr,out);
        pwd.exec(null,out);

        Scanner scan = new Scanner(in);
        String expected = scan.nextLine();
        String actual = directory + File.separator +"tempFolder";

        assertEquals(expected,actual);
    }
}
