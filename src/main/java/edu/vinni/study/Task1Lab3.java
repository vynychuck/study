package edu.vinni.study;

/**
 * Created by serghii on 05.10.14.
 */
public class Task1Lab3 {
    public static int pow(int n, int a) {
        if (a == 0) {
            return 1;
        }
        return pow(n, a - 1) * n;
    }

    public static int powWhile(int n, int a) {
        int result = 1;
        for (int i = a; i > 0; i--) {
            result *= n;
        }
        return result;
    }
}
