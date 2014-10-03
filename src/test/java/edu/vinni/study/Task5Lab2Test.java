package edu.vinni.study;

import org.junit.Test;

/**
 * Created by serghii on 03.10.14.
 */
public class Task5Lab2Test {

    @Test(expected = IllegalArgumentException.class)
    public void testMainExceptionThrown() {
        final String[] strings = new String[]{};
        Task5Lab2.main(strings);
    }

    @Test
    public void testMainRightPath() {
        final String[] strings = new String[]{"-12"};
        Task5Lab2.main(strings);
    }

    @Test (expected = NumberFormatException.class)
    public void testMainNumberFormatException(){
        final String[] strings = new String[]{"23v"};
        Task5Lab2.main(strings);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMainZeroException(){
        final String[] strings = new String[]{"0"};
        Task5Lab2.main(strings);
    }
}
