package com.ynm.gms.array_problems;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Yogesh Manware
 */
public class ArrayProblems {

    public int findMissingNumber(int[] series) {
        long expectionSum = sumOfRange(series[series.length - 1]);
        //calc sum
        long actualSum = Arrays.stream(series).reduce(0, Integer::sum);
        return (int) (expectionSum - actualSum);
    }

    public long sumOfRange(int lastnumber) {
        return lastnumber * (lastnumber + 1) / 2;
    }

    public Set<Integer> findDuplicateNumber(int[] ints) {
        Arrays.sort(ints);
        int[] prevNumber = {ints[0]};
        return Arrays.stream(ints).filter((int value) -> {
            if (prevNumber[0] != ints[0] && prevNumber[0] == value) {
                return true;
            }
            prevNumber[0] = value;
            return false;
        }).boxed().collect(Collectors.toSet());
    }
}
