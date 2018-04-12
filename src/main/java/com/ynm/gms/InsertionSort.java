package com.ynm.gms;

/**
 * @Auther Yogesh Manware
 */
public class InsertionSort {

    protected static int[] sort(int[] arr) {

        // it's like playing cards, insert the element at the right spot starting from the 1st position
        for (int i = 1; i < arr.length; i++) {

            //sort the list on left side
            for (int j = i; j > 0; j--) {
                //swap if the previous element greater than current, this indirectly shift all necessary cards to right if required
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }


        return arr;
    }


}
