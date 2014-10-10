package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serghii on 10.10.14.
 */
public class Task2Lab4Test {
    @Test
    public void testMainPath(){
        Assert.assertEquals(0, Task2Lab4.getNumbers(5));
    }
}
