package edu.vinni.study;

/**
 * Created by serghii on 06.10.14.
 */
public class Task5Lab3 {
    public static int showGeomtrProgr(int a, int b) {
        do {
            System.out.println(a);
            a *= b;
        } while (a < 100);
        return 0;
    }
}
