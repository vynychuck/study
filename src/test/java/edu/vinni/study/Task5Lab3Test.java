package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by serghii on 06.10.14.
 */
public class Task5Lab3Test {
    @Test
    public void testMainPath() {
        final ArrayList<Integer> ts = new ArrayList<Integer>();
        for (int i = 2; i < 100; i *= 2) {
            ts.add(i);
        }
        Assert.assertEquals(ts, Task5Lab3.showGeomtrProgr(2, 2));
    }
}
