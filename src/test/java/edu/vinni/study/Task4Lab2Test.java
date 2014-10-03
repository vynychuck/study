package edu.vinni.study;

import org.junit.Test;

/**
 * Created by serghii on 03.10.14.
 */
public class Task4Lab2Test {

    @Test (expected = IllegalArgumentException.class)
    public void testMainExceptionThrown() {
        final String[] strings = new String[]{};
        Task4Lab2.main(strings);
    }

    @Test
    public void testMainRighPath() {
        final String[] strings = new String[]{"23"};
        Task4Lab2.main(strings);
    }

    @Test (expected = NumberFormatException.class)
    public void testMainNumberFormatException() {
        final String[] strings = new String[]{"32n"};
        Task4Lab2.main(strings);
    }

}

