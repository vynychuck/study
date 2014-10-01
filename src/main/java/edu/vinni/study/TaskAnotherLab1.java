package edu.vinni.study;

/**
 * Created by serghii on 01.10.14.
 */
public class TaskAnotherLab1 {    //task #10
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("More or less than 2 input sources ");
        }
        double x = Double.parseDouble(args[0]), a = Double.parseDouble(args[1]);
        double y;
        if (x != -2 && x != 0 && a != 0) {
            y = Math.sin(2 * Math.pow(x, 3)) / (x + 2) + Math.cos(x/2*a);
            System.out.println("Функція y = " + y);
        }
    }
}
