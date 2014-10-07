package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by serghii on 06.10.14.
 */
public class Task2Lab3Test {
    @Test
    public void testMainRightPath(){
        ArrayList<Integer> ts = new ArrayList<Integer>();
        for (int i = 4; i <= 300; i += 4 ) {
            ts.add(i);
        }
        Assert.assertEquals(ts, Task2Lab3.checkNumb(4));
    }
}
