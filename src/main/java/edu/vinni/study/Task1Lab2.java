package edu.vinni.study;

/**
 * Created by serghii on 01.10.14.
 */
public class Task1Lab2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("More or less input sources than 1");
        }
        double a = Double.parseDouble(args[0]);
        System.out.println(Math.signum(a));
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
