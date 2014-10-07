package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serghii on 07.10.14.
 */
public class Task7Lab3Test {
    @Test
    public void testMainPath(){
        Integer[] list = new Integer[]{5, 3, 33, 567, 2342, 4, 6, 7, 364};
        Assert.assertEquals(2342, Task7Lab3.getMaxValue(list));
    }
}
