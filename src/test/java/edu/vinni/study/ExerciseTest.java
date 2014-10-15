package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by serghii on 15.10.14.
 */
public class ExerciseTest {
    @Test
    public void testCheckPassFail() {
        Assert.assertEquals("FAIL", Exercise.CheckPassFail(49));
        Assert.assertEquals("PASS", Exercise.CheckPassFail(135));
    }

    @Test
    public void testOddEven() {
        Assert.assertEquals("Even Number", Exercise.CheckOddEven(18));
        Assert.assertEquals("Odd Number", Exercise.CheckOddEven(13));
    }

    @Test
    public void testPrintNumberInWord() {
        Assert.assertEquals("THREE", Exercise.PrintNumberInWord(3));
        Assert.assertEquals("OTHER", Exercise.PrintNumberInWord(235));
    }

    @Test
    public void testPrintDayInWord() {
        Assert.assertEquals("Monday", Exercise.PrintDayInWord(1));
        Assert.assertEquals("Thursday", Exercise.PrintDayInWord(4));
        Assert.assertEquals("Not a valid day", Exercise.PrintDayInWord(13));
    }

    @Test
    public void testSumAndAverage() {
        ArrayList<Double> list = new ArrayList<Double>() {
        };
        list.add(5050.0);
        list.add(50.5);
        Assert.assertEquals(list, Exercise.SumAndAverage(1, 100));
    }

    @Test
    public void testSumAndAverage2variant() {
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(3.9594445E7);
        list.add(4449.313967861557);
        list.add(8789.0);
        Assert.assertEquals(list, Exercise.sumAndAverage(111, 8899));
    }

    @Test
    public void testSumAndAverageOdd() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2500);
        list.add(25);
        Assert.assertEquals(list, Exercise.sumAndAverageOdd(1, 100));
    }

    @Test
    public void testSumAndAverageOdd7() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(735);
        list.add(7);
        Assert.assertEquals(list, Exercise.sumAndAverageOdd7(1, 100));
    }

    @Test
    public void testSumAndAverageSquares() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(338350);
        list.add(3383);
        Assert.assertEquals(list, Exercise.sumAndAverageSquares(1, 100));
    }

    @Test
    public void testGetProduct() {
        Assert.assertEquals(3628800, Exercise.getProduct(10));
    }
}

