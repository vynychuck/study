package edu.vinni.study;

/**
 * Created by serghii on 03.10.14.
 */
public class Task5Lab2 {
    public static int sign(int a) {
        if (Math.signum(a) == -1) {
            return a * a * a;
        } else if (Math.signum(a) == 1) {
            return a * a;
        } else {
            throw new IllegalArgumentException("Number is nor positive, neither negative ");
        }
    }
}
