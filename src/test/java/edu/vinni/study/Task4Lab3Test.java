package edu.vinni.study;


import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by serghii on 06.10.14.
 */
public class Task4Lab3Test {

    @Test
    public void testMainPath() {
        ArrayList<Integer> hs = new ArrayList<Integer>();
        hs.add(21);
        hs.add(3);
        hs.add(7);
        hs.add(9);
        hs.add(11);
        hs.add(13);
        hs.add(19);
        hs.add(15);
        hs.add(17);
        hs.add(5);
        Assert.assertEquals(hs, Task4Lab3.showAriphNumb(3, 2));
    }
}
