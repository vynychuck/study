package edu.vinni.study;

/**
 * Created by serghii on 15.10.14.
 */
public class Exercise {
    public static String CheckPassFail(int mark){
        String positive = "PASS", negative = "FAIL";
        if (mark >= 50){
            return positive;
        } else return negative;
    }
}
