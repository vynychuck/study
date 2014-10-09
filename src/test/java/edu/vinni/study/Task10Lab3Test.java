package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serghii on 09.10.14.
 */
public class Task10Lab3Test {
    @Test
    public void testMainPath(){
        Integer[] list = new Integer[]{185, 175, 180};
        Assert.assertEquals(180, Task10Lab3.getAverageHeight(list), 5);
    }
}
