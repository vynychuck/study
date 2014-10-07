package edu.vinni.study;

/**
 * Created by serghii on 07.10.14.
 */
public class Task7Lab3 {
    public static int getMaxValue(Integer[] list) {
        int i = 0;
        int max = list[0];
        while (i != list.length) {
            if (list[i] > 0 && max < list[i]) {
                max = list[i];
            }
            i++;
        }
        return max;
    }
}

