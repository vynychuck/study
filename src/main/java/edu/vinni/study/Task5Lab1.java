package edu.vinni.study;

/**
 * Created by serghii on 30.09.14.
 */
public class Task5Lab1 {
    public static void main(String args[]) {
        double x = Double.parseDouble(args[0]), y = Double.parseDouble(args[1]);
        int length = Integer.parseInt(args[2]);
        final double radius = length * Math.sqrt(2) / 2;
        if (x * x + y * y == radius * radius) {
            System.out.println("TRUE");
        }
    }
}
