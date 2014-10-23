package edu.vinni.study;

/**
 * Created by serghii on 09.10.14.
 */
public class Task11Lab3 {
    public static int pow(int a, int n){
        int result = 1;
        while (n > 0){
            result *= a;
            n--;
        }
        return result;
    }
}
