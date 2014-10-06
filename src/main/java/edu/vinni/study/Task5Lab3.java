package edu.vinni.study;

import java.util.TreeSet;

/**
 * Created by serghii on 06.10.14.
 */
public class Task5Lab3 {
    public static TreeSet<Integer> showGeomtrProgr(int a, int b) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        do {
            ts.add(a);
            a *= b;
        } while (a < 100);
        return ts;
    }
}
