package com.ynm.gms.sorting;

import com.ynm.gms.sorting.InsertionSort;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author Yogesh Manware
 */
public class InsertionSortTest {


    @Test
    public void testSort1() {
        int[] arr1 = {2, 3, 1, 4, 5};
        arr1 = InsertionSort.sort(arr1);

        int[] arr2 = {1, 2, 3, 4, 5};
        Assert.assertTrue(Arrays.equals(arr1, arr2));
    }

    @Test
    public void testSort2() {
        int[] arr1 = {2};
        arr1 = InsertionSort.sort(arr1);

        int[] arr2 = {2};
        Assert.assertTrue(Arrays.equals(arr1, arr2));
    }

    @Test
    public void testSort3() {
        int[] arr1 = {2, 1};
        arr1 = InsertionSort.sort(arr1);

        int[] arr2 = {1, 2};
        Assert.assertTrue(Arrays.equals(arr1, arr2));
    }


    @Test
    public void testSort4() {
        int[] arr1 = {1, 2, 3};
        arr1 = InsertionSort.sort(arr1);

        int[] arr2 = {1, 2, 3};
        Assert.assertTrue(Arrays.equals(arr1, arr2));
    }

    @Test
    public void testSort5() {
        int[] arr1 = {1, 2, 3, 4, 9, 6, 7};
        arr1 = InsertionSort.sort(arr1);

        int[] arr2 = {1, 2, 3, 4, 6, 7, 9};
        Assert.assertTrue(Arrays.equals(arr1, arr2));
    }
}
