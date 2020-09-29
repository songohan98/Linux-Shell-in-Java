package uk.ac.ucl.jsh;

import org.junit.Test;

import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import static org.junit.Assert.assertEquals;

public class EnvironmentTest {
    public EnvironmentTest() {
    }

    @Test
    public void testGettingAndSettingCurrentDirectoryEnvVeriable() throws Exception {
        String filePath = System.getProperty("user.home");
        Environment.setCurrentDirectory(filePath);
        assertEquals(Environment.getCurrentDirectory(), filePath);
    }

    @Test
    public void testGettingAndSettingOutputVeriable() throws Exception {
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream(in);
        Environment.setOutput(out);
        assertEquals(Environment.getOutput(), out);
    }

    @Test
    public void testGettingAndSettingCallWriterVeriable() throws Exception {
        PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream(in);
        OutputStreamWriter writer = new OutputStreamWriter(out);
        Environment.setWriter(writer);
        assertEquals(Environment.getWriter(), writer);
    }
}
