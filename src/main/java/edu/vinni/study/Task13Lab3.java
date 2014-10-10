package edu.vinni.study;

/**
 * Created by serghii on 10.10.14.
 */
public class Task13Lab3 {
    public static int getFunction(int a, int b) {
        int y = 0;
        while (b <= a) {
            y += b * b;
            b++;
        }
        return y;
    }
}
