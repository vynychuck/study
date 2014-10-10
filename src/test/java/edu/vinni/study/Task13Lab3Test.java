package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serghii on 10.10.14.
 */
public class Task13Lab3Test {
    @Test
    public void testMainPath(){
        Assert.assertEquals(55, Task13Lab3.getFunction(5, 1));
    }
}
