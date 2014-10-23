package edu.vinni.study;

import java.util.ArrayList;


/**
 * Created by serghii on 06.10.14.
 */
public class Task2Lab3 {
    public static ArrayList<Integer> checkNumb(int a) {
        int b = 0;
        ArrayList<Integer> ts = new ArrayList<Integer>();
        while (b <= 300) {
            b++;
            if (b % a == 0) {
                ts.add(b);
            }
        }
        return ts;
    }
}
