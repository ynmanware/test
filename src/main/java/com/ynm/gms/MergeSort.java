package com.ynm.gms;

/**
 * @Auther Yogesh Manware
 */
public class MergeSort {

    protected static int[] sort(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int[] mergeSort(int[] arr, int low, int high) {
        if (high > low) {
            int mid = (high + low) / 2;

            //mergesort first half
            mergeSort(arr, low, mid);

            //mergesort second half
            mergeSort(arr, mid + 1, high);

            //merge the sorted halves
            merge(arr, low, mid, high);
        }
        return arr;
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        //create temp arrays
        int[] left = new int[mid - low + 1];
        int[] right = new int[high - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[low + i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + i + 1]; //add 1, it is necessary bcoz sometime low=mid=0.
        }

        //merge these temp arrays
        int i = 0, j = 0;
        //index of merge subarray
        int k = low;
        while (i < left.length && j < right.length) {
             if(left[i] <= right[j]) {
                 arr[k++] = left[i++];
             } else {
                 arr[k++] = right[j++];
             }
        }

        //copy remaining element
        while(i < left.length) {
            arr[k++] = left[i++];
        }

        while(i < left.length) {
            arr[k++] = left[i++];
        }
    }
}
