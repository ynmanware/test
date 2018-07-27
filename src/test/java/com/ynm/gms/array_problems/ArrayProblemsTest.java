package com.ynm.gms.array_problems;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @author Yogesh Manware
 */
public class ArrayProblemsTest {

    private ArrayProblems arrayProblems = new ArrayProblems();

    @Test
    public void testExecute() {
        Assert.assertEquals(Arrays.asList(4, 5), arrayProblems.findDuplicateNumber(new int[]{1, 2, 3, 4, 5, 4, 5, 4}));
    }

    @Test
    public void testFindMissingNumber() {
        Assert.assertEquals(5, arrayProblems.findMissingNumber(new int[]{1, 2, 3, 4, 6}));
    }

    @Test
    public void testSumOfRange() {
        Assert.assertEquals(15, arrayProblems.sumOfRange(5));
        Assert.assertEquals(5050, arrayProblems.sumOfRange(100));
    }
}
