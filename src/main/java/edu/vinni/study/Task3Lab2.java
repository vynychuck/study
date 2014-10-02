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
        System.out.println("Min is " + min(k, n, m));
    }

    public static int min(int a, int b, int c) {
        int res = 0;
        if (a < b && a < c) {
            res = a;
        } else if (c < b && c < a) {
            res = c;
        } else if (b < c && b < a) {
            res = b;
        }
        return res;
    }
}

