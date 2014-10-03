package edu.vinni.study;

import org.junit.Test;

import static edu.vinni.study.Task3Lab2.min;
import static org.junit.Assert.assertEquals;

/**
 * Created by serghii on 03.10.14.
 */
public class Task3Lab2Test {

    @Test
    public void testMainRightPath() {
        assertEquals(10, min(10, 12, 23));
        assertEquals(12, min(114, 12, 223));
        assertEquals(-12, min(10, 12, -12));

    }
}
