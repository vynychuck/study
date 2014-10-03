package edu.vinni.study;

/**
 * Created by serghii on 03.10.14.
 */
public class Task5Lab2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("More or less than 1 input sources ");
        }

        double a = Double.parseDouble(args[0]);
        if(Math.signum(a) == -1) {
                double result = a * a;
            System.out.println("If number is negative than a is equal " + result);
        }
        if(Math.signum(a) == 1) {
            double result = Math.pow(a, 3);
            System.out.println("If number is positive than a is equal " + result);
        }
        if(Math.signum(a) == 0) {
            throw new IllegalArgumentException("Number is nor positive, neither negative ");
        }
    }
}
