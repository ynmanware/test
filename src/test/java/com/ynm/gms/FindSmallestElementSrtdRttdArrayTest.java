package com.ynm.gms;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Auther Yogesh Manware
 */
public class FindSmallestElementSrtdRttdArrayTest {

    @Test
    public void testFindSmallestNumber1() {
        int[] arr = {6, 1, 2, 3, 4, 5};
        Assert.assertEquals(1, FindSmallestElementSrtdRttdArray.findSmallestNumber(arr, 0, arr.length - 1));
    }

    @Test
    public void testFindSmallestNumber2() {
        int[] arr = {6, 7, 8, 2, 3, 4, 5};
        Assert.assertEquals(2, FindSmallestElementSrtdRttdArray.findSmallestNumber(arr, 0, arr.length - 1));
    }

    @Test
    public void testFindSmallestNumber3() {
        int[] arr = {6, 7, 1, 2, 3, 4, 5};
        Assert.assertEquals(1, FindSmallestElementSrtdRttdArray.findSmallestNumber(arr, 0, arr.length - 1));
    }

    @Test
    public void testFindSmallestNumber4() {
        int[] arr = {5, 1, 2, 3, 4};
        Assert.assertEquals(1, FindSmallestElementSrtdRttdArray.findSmallestNumber(arr, 0, arr.length - 1));
    }

    @Test
    public void testFindSmallestNumber6() {
        int[] arr = {2, 3, 4, 5, 1};
        Assert.assertEquals(1, FindSmallestElementSrtdRttdArray.findSmallestNumber(arr, 0, arr.length - 1));
    }

    @Test
    public void testFindSmallestNumber61() {
        int[] arr = {4, 5, 1, 2, 3};
        Assert.assertEquals(1, FindSmallestElementSrtdRttdArray.findSmallestNumber(arr, 0, arr.length - 1));
    }


    @Test
    public void testFindSmallestNumber7() {
        int[] arr = {1, 2, 3, 4, 5};
        Assert.assertEquals(1, FindSmallestElementSrtdRttdArray.findSmallestNumber(arr, 0, arr.length - 1));
    }

    @Test
    public void testFindSmallestNumber8() {
        int[] arr = {1, 2};
        Assert.assertEquals(1, FindSmallestElementSrtdRttdArray.findSmallestNumber(arr, 0, arr.length - 1));
    }

    @Test
    public void testFindSmallestNumber9() {
        int[] arr = {2, 1};
        Assert.assertEquals(1, FindSmallestElementSrtdRttdArray.findSmallestNumber(arr, 0, arr.length - 1));
    }

    @Test
    public void testFindSmallestNumber10() {
        int[] arr = {1};
        Assert.assertEquals(1, FindSmallestElementSrtdRttdArray.findSmallestNumber(arr, 0, arr.length - 1));
    }
}