package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serghii on 09.10.14.
 */
public class Task12Lab3Test {
    @Test
    public void testMainPath() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        Assert.assertEquals(list, Task12Lab3.showEven(1, 8));
    }
}
