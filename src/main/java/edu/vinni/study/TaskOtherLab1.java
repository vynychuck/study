package edu.vinni.study;

/**
 * Created by serghii on 30.09.14.
 */
public class TaskOtherLab1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Input sources more than 2 ");
        }
        double x = Double.parseDouble(args[0]), a = Double.parseDouble(args[1]);
        if (a != 0 && x >= 0) {
            double y = Math.sqrt(x - 4) / Math.sqrt(3 * Math.pow(a, 3));
            System.out.println(y);
        }
    }
}

