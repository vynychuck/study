package edu.vinni.study;

/**
 * Created by serghii on 02.10.14.
 */
public class Task3Lab2 {
    public static void main(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException("More than 3 input sources ");
        }
        int k = Integer.parseInt(args[0]), n = Integer.parseInt(args[1]), m = Integer.parseInt(args[2]);
        int minimal = Math.min(k, Math.min(n,m));
        System.out.println("Min is " + minimal);
    }
}

