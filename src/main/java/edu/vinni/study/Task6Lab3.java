package edu.vinni.study;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by serghii on 06.10.14.
 */
public class Task6Lab3 {
    public static List<Integer> showGeoProgr(int a, int b) {
        List<Integer> list = new ArrayList<Integer>();
        int x = 0;
        while (x < 10){
            list.add(a);
            a *= b;
            x++;
        }
        return list;
    }
}
