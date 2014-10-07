package edu.vinni.study;

import java.util.ArrayList;


/**
 * Created by serghii on 06.10.14.
 */
public class Task6Lab3 {
    public static ArrayList<Integer> showGeoProgr(int a, int b) {
        ArrayList<Integer> ts = new ArrayList<Integer>();
        int x = 0;
        while (x < 10){
            ts.add(a);
            a *= b;
            x++;
        }
        return ts;
    }
}
