package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serghii on 03.10.14.
 */
public class Task5Lab2Test {


    @Test
    public void testMainRightPath() {
        Assert.assertEquals(4, Task5Lab2.sign(2));
        Assert.assertEquals(-8, Task5Lab2.sign(-2));
    }
}


