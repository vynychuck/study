package edu.vinni.study;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by serghii on 06.10.14.
 */
public class Task6Lab3Test {
    @Test
    public void testMainPath(){
        List<Integer> ts = new ArrayList<Integer>();
        for (int i = 3; i < 2000; i *= 2) {
            Assert.assertEquals(i, Task6Lab3.showGeoProgr(3, 2));
        }
    }
}
