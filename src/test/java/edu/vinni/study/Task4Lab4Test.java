package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serghii on 10.10.14.
 */
public class Task4Lab4Test {
    @Test
    public void testMainPath(){
        Assert.assertEquals(0, Task4Lab4.getTenMembers(3, 2));
    }
}
