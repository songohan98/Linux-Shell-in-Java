package uk.ac.ucl.jsh;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppFactoryTest {

    public AppFactoryTest() {
    }

    @Test
    public void testSingletonDesignPattern() {
        AppFactory factory1 = AppFactory.getInstance();
        AppFactory factory2 = AppFactory.getInstance();
        assertEquals(factory1, factory2);
    }
}
