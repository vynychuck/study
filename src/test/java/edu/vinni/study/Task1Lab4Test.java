package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serghii on 10.10.14.
 */
public class Task1Lab4Test {
    @Test
    public void testMainPath(){
        Assert.assertEquals(0, Task1Lab4.showPositive(5));
    }
}
