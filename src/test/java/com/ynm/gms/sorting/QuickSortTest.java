package com.ynm.gms.sorting;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;

public class QuickSortTest {

    QuickSort qs = new QuickSort();

    @Test
    public void testSort1() {
        int[] testArr = {4, 5, 6, 1, 3, 2};
        int[] testArr2 = {4, 5, 6, 1, 3, 2};

        qs.sort(testArr2);

        Arrays.sort(testArr);
        Assert.assertTrue(Arrays.equals(testArr, testArr2));
    }


    @Test
    public void testSort2() {
        int[] testArr = {4, 5};
        int[] testArr2 = {4, 5};

        qs.sort(testArr2);

        Arrays.sort(testArr);
        Assert.assertTrue(Arrays.equals(testArr, testArr2));
    }

}
