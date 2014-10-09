package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serghii on 09.10.14.
 */
public class Task9Lab3Test {
    @Test
    public void testMainPath(){
        Assert.assertEquals(120, Task9Lab3.getFact(5));
    }
}
