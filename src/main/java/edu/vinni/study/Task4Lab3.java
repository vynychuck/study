package edu.vinni.study;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by serghii on 06.10.14.
 */
public class Task4Lab3 {
    public static TreeSet<Integer> showAriphNumb(int a, int b) {
        int x = 0;
        TreeSet<Integer> hs = new TreeSet<Integer>();
        while (x < 10) {
            hs.add(a);
            a += b;
            x++;
        }
        return hs;
    }
}
