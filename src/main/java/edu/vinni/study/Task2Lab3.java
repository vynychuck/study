package edu.vinni.study;

/**
 * Created by serghii on 06.10.14.
 */
public class Task2Lab3 {
    public static int checkNumb(int a) {
        int b = 0;
        while (b <= 300) {
            b++;
            if (b % a == 0) {
                System.out.println(b);
            }
        }
        return 0;
    }
}
