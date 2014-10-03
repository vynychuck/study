package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

import static edu.vinni.study.Task4Lab2.*;

/**
 * Created by serghii on 03.10.14.
 */
public class Task4Lab2Test {

    @Test
    public void testMainRightPath() {
        Assert.assertEquals(2, abs(2));
        Assert.assertEquals(2, abs(-2));
    }
}

