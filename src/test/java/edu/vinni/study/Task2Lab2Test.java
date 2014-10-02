package edu.vinni.study;

import org.junit.Test;

/**
 * Created by serghii on 02.10.14.
 */

public class Task2Lab2Test {

    @Test(expected = IllegalArgumentException.class)
    public void testMainExceptionThrown() {
        final String[] strings = new String[]{};
        Task2Lab2.main(strings);
    }

    @Test
    public void testMainRightPath() {
        final String[] strings = new String[]{"2", "3"};
        Task2Lab2.main(strings);
    }

    @Test(expected = NumberFormatException.class)
    public void testMainNumberFormatException() {
        final String[] strings = new String[]{"5a", "3g"};
        Task2Lab2.main(strings);
    }


}
