package edu.vinni.study;

/**
 * Created by serghii on 09.10.14.
 */
public class Task9Lab3 {
    public static int getFact(int n) {
        int fact = 1, i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
