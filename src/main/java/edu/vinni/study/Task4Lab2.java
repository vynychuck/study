package edu.vinni.study;

/**
 * Created by serghii on 03.10.14.
 */
public class Task4Lab2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("More or less than 1 input source ");
        }

        double a = Double.parseDouble(args[0]);
        System.out.println("Absolute value of number " + Math.abs(a));
    }
}
