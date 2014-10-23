package edu.vinni.study;

/**
 * Created by serghii on 09.10.14.
 */
public class Task10Lab3 {
    public static float getAverageHeight(Integer[] list) {
        int n = 0;
        float average, S = 0;
        while (n != list.length) {
            S += list[n];
            n++;
        }
        average = S / n;
        return average;
    }

}
