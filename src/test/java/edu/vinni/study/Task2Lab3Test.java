package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serghii on 06.10.14.
 */
public class Task2Lab3Test {
    @Test
    public void testMainRightPath(){
        Assert.assertEquals(0, Task2Lab3.checkNumb(4));
    }
}
