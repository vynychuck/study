package edu.vinni.study;

/**
 * Created by serghii on 10.10.14.
 */
public class Task2Lab4 {
    public static void getNumbers(int a){
        int x = 300;
        for(int i = a; i < 300; i+=a){
            if (i % a == 0){
                System.out.println(i);
            }
        }
    }
}
