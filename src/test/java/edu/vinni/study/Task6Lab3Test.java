package edu.vinni.study;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;


/**
 * Created by serghii on 06.10.14.
 */
public class Task6Lab3Test {
    @Test
    public void testMainPath(){
        ArrayList<Integer> ts = new ArrayList<Integer>();
        for (int i = 3; i < 2000; i *= 2) {
            ts.add(i);
        }
        Assert.assertEquals(ts, Task6Lab3.showGeoProgr(3, 2));
    }
}
