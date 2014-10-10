package edu.vinni.study;

/**
 * Created by serghii on 10.10.14.
 */
public class Task14Lab3 {
    public static int getNumbers(int a) {
        int start = 1, end = 1000;
        while (start <= end) {
            if (start % 10 == a) {
                System.out.println(start);
            }
            start++;
        }
        return 0;
    }
}
