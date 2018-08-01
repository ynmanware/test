package com.ynm.gms.sorting;

/**
 * @author Yogesh Manware
 */
public class QuickSort {

    public void sort(int[] testArr2) {
        sort(testArr2, 0, testArr2.length - 1);
    }

    private void sort(int[] testArr2, int low, int hi) {
        if (low >= hi) {
            return;
        }
        //find a pivot index, putting an element in its right place
        int pivotIndex = partition(testArr2, low, hi);
        //now the number at pivot index is at the right place
        //repeat same step for the left side
        sort(testArr2, low, pivotIndex - 1);
        //repeat same step for the right side
        sort(testArr2, pivotIndex + 1, hi);
    }

    private int partition(int[] testArr2, int low, int hi) {
        //assume the last element to be pivot, we will put this number at the right position
        int pivot = testArr2[hi];
        //index to track all numbers smaller than pivot
        int i = low - 1;
        //iterate over the array and move all smaller number to the left side of the array
        for (int j = low; j < hi; j++) {
            if (pivot > testArr2[j]) {
                ++i;
                swap(testArr2, i, j);
            }
        }
        //finally, put the assumed pivot at the right place
        //after this point, all numbers that are smaller than pivot would be on its left and
        //bigger numbers would be on the right side of it
        swap(testArr2, ++i, hi);
        return i;
    }

    private void swap(int[] testArr2, int i, int j) {
        int temp = testArr2[i];
        testArr2[i] = testArr2[j];
        testArr2[j] = temp;
    }
}
