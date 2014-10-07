package edu.vinni.study;

import java.util.ArrayList;


/**
 * Created by serghii on 06.10.14.
 */
public class Task5Lab3 {
    public static ArrayList<Integer> showGeomtrProgr(int a, int b) {
        ArrayList<Integer> ts = new ArrayList<Integer>();
        do {
            ts.add(a);
            a *= b;
        } while (a < 100);
        return ts;
    }
}
