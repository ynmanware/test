package com.ynm.gms.anagram;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @auther Yogesh Manware
 */
public class AnagramFromList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("cat", "tac", "tic", "cit"));
        System.out.println(groupAnagrams(list));
    }

    public static Collection<List<String>> groupAnagrams(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(w -> {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        })).values();
    }
}
