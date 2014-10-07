package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serghii on 07.10.14.
 */
public class Task8Lab3Test {
    @Test
    public void testMainPath(){
        Integer[] list = new Integer[]{3, 6, 8, 5};
        Assert.assertEquals(18, Task8Lab3.getProduct(list));

    }

}
