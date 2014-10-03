package edu.vinni.study;

import org.junit.Test;

/**
 * Created by serghii on 03.10.14.
 */
public class Task3Lab2Test {

    @Test    (expected = IllegalArgumentException.class)
    public void testMainExceptionThrown() {
        final String[] strings = new String[]{};
        Task3Lab2.main(strings);
    }

    @Test
    public void testMainRightPath() {
        final String[] strings = new String[]{"2", "23", "14"};
        Task3Lab2.main(strings);
    }

    @Test (expected = NumberFormatException.class)
    public void testMainNumberFormatException(){
        final String[] strings = new String[] {"3d", "5g", "6h"};
        Task3Lab2.main(strings);
    }
}
