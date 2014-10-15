package edu.vinni.study;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serghii on 15.10.14.
 */
public class Exercise {
    public static String CheckPassFail(int mark) {
        String positive = "PASS", negative = "FAIL";
        if (mark >= 50) {
            return positive;
        } else return negative;
    }

    public static String CheckOddEven(int mark) {
        String odd = "Odd Number", even = "Even Number";
        if (mark % 2 == 0) {
            return even;
        } else return odd;
    }

    public static String PrintNumberInWord(int mark) {
        String one = "ONE", two = "TWO", three = "THREE", other = "OTHER";
        switch (mark) {
            case 1:
                return one;
            case 2:
                return two;
            case 3:
                return three;
            default:
                return other;
        }
    }

    public static String PrintDayInWord(int mark) {
        String mon = "Monday", tue = "Tuesday", wed = "Wednesday", thur = "Thursday", fri = "Friday", sat = "Saturday",
                sun = "Sunday", not = "Not a valid day";
        switch (mark) {
            case 1:
                return mon;
            case 2:
                return tue;
            case 3:
                return wed;
            case 4:
                return thur;
            case 5:
                return fri;
            case 6:
                return sat;
            case 7:
                return sun;
            default:
                return not;
        }
    }

    public static List<Double> SumAndAverage(int lowerbound, int upperbound) {
        List<Double> list = new ArrayList<Double>();
        double sum = 0;
        double average;
        for (int i = lowerbound; i <= upperbound; ++i) {
            sum += i;
        }
        list.add(sum);
        average = sum / upperbound;
        list.add(average);
        return list;
    }

}
