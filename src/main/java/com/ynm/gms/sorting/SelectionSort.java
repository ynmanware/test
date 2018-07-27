package com.ynm.gms.sorting;

/**
 * @author Yogesh Manware
 */
public class SelectionSort {

    protected static int[] sort(int[] arr) {

        // To order a given list using selection sort,
        // we repeatedly select the smallest element from the unsorted list on the right side and
        // move it to the end of a growing sorted list on the left side.
        for (int i = 0; i < arr.length; i++) {

            //initial index of min
            int min = i;

            //find min index in the unsorted list
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            //swap, bring the smallest number to the current index
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }


        return arr;
    }


}
