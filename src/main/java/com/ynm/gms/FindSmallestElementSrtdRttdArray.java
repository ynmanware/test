package com.ynm.gms;

/**
 * @author Yogesh Manware
 *
 * find smallest number using binary search
 *
 */
public class FindSmallestElementSrtdRttdArray {


    //using binary search
    protected static int findSmallestNumber(int[] arr, int low, int high) {
        if (arr == null) {
            throw new RuntimeException("Please supply valid array.");
        }

        // just one element
        if (high == low) return arr[low];

        // determine mid
        int mid = low + (high - low)/2;

        // verify if the mid itself is the minimum element
        if (mid > low && arr[mid] < arr[mid - 1])
            return arr[mid];

        // when the array is not rotated
        if(mid == 0) {
            if(arr[mid] < arr[mid + 1]){
                return arr[mid];
            }
        }

        // If the rightmost element is greater than mid, go left, else right
        if (mid > low && arr[high] > arr[mid])
            return findSmallestNumber(arr, low, mid-1);
        return findSmallestNumber(arr, mid+1, high);
    }

}
