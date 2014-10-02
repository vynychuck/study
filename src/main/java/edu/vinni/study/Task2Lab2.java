package edu.vinni.study;

/**
 * Created by serghii on 02.10.14.
 */
public class Task2Lab2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("More than 2 input sources");
        }
        double a = Double.parseDouble(args[0]), b = Double.parseDouble(args[1]);
        System.out.println("Minimum of 2 numbers a and b is " + Math.min(a,b));
    }
}
