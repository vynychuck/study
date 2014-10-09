package edu.vinni.study;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Created by serghii on 06.10.14.
 */
public class Task6Lab3Test {
    @Test
    public void testMainPath() {

        final int startPoint = 3;
        final int step = 2;
        final List<Integer> geoProgr = Task6Lab3.showGeoProgr(startPoint, step);
        assertEquals(10, geoProgr.size());

        int current = startPoint;
        for (Integer element : geoProgr) {
            assertEquals(current, element.intValue());
            current *= step;
        }

    }
}
