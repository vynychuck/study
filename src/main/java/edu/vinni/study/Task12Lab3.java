package edu.vinni.study;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serghii on 09.10.14.
 */
public class Task12Lab3 {
    public static List<Integer> showEven(int n, int m){
        List<Integer> list = new ArrayList<Integer>();
        while (n <= m){
            if(n % 2 == 0){
                list.add(n);
            }
            n++;
        }
        return list;
    }
}
