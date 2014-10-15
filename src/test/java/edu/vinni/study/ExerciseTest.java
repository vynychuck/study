package edu.vinni.study;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serghii on 15.10.14.
 */
public class ExerciseTest {
    @Test
    public void testCheckPassFail(){
        Assert.assertEquals("FAIL", Exercise.CheckPassFail(49));
        Assert.assertEquals("PASS", Exercise.CheckPassFail(135));
    }
}
