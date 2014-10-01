package edu.vinni.study;

/**
 * Created by serghii on 30.09.14.
 */
public class Task6Lab1 {
    public static void main(String args[]) {
        double y;
        int a = 3;
        double x = 2;
        if (x > 10) {
            y = 1 / x;
        } else if (x <= 10 && x >= -10) {
            y = a * (x * x);
        } else {
            y = Math.sin(x);
        }
        System.out.println("Значення y дорівнює " + y);
    }
}
