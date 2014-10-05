package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serghii on 05.10.14.
 */
public class Task1Lab3Test {

    @Test
    public void testMainRightPath() {
        Assert.assertEquals(1, Task1Lab3.pow(3, 0));
        Assert.assertEquals(27, Task1Lab3.powWhile(3, 3));
    }
}
