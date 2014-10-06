package edu.vinni.study;

import java.util.TreeSet;

/**
 * Created by serghii on 06.10.14.
 */
public class Task2Lab3 {
    public static TreeSet<Integer> checkNumb(int a) {
        int b = 0;
        TreeSet<Integer> ts = new TreeSet<Integer>();
        while (b <= 300) {
            b++;
            if (b % a == 0) {
                ts.add(b);
            }
        }
        return ts;
    }
}
