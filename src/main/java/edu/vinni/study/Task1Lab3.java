package edu.vinni.study;

/**
 * Created by serghii on 05.10.14.
 */
public class Task1Lab3 {
    public static int showAriphProgr(int a) {
        int n = 0;
        while (a < 100) {
            a += n;
            System.out.println(a);
        }
        return a;
    }
}
