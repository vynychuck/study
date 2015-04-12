package edu.vinni.study;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serghii on 10.10.14.
 */
public class Task14Lab3 {
    public static List<Integer> getNumbers(int a) {
        List<Integer> list = new ArrayList<Integer>();
        int start = 1, end = 1000;
        while (start <= end) {
            if (start % 10 == a) {
                list.add(start);
            }
            start+=10;
        }
        return list;
    }
}
