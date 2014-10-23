package edu.vinni.study;

import javax.print.attribute.IntegerSyntax;
import java.util.Scanner;

/**
 * Created by serghii on 03.10.14.
 */
public class Task6Lab2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("More than 1 input source ");
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Select an option (1, 2, 3, 4) ");
        int choice = in.nextInt();
        double a = Double.parseDouble(args[0]);
        switch (choice) {
            case 1:
                a = Math.pow(a, 2);
                break;
            case 2:
                a = Math.pow(a, 3);
                break;
            case 3:
                a = Math.pow(a, 4);
                break;
        }
            System.out.println("Result: " + a);
    }
}
