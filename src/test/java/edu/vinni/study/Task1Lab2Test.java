package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

public class Task1Lab2Test {

    @Test
    public void testSum() throws Exception {
        final Task1Lab2 task1Lab2 = new Task1Lab2();
        final int sum = task1Lab2.sum(7, 13);
        Assert.assertEquals("Sum of 7 and 13 must be 20", 20, sum);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMainExceptionThrown() {
        final String[] strings = new String[2];
        Task1Lab2.main(strings);
    }

    @Test
    public void testMainHappyPath() {
        final String[] strings = new String[]{"10"};
        Task1Lab2.main(strings);
    }

    @Test(expected = NumberFormatException.class)
    public void testMainNumberFormatException() {
        final String[] strings = new String[]{"10s"};
        Task1Lab2.main(strings);
    }
}