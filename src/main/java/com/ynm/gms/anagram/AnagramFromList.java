package com.ynm.gms.anagram;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @auther Yogesh Manware
 */
public class AnagramFromList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("eat", "tea", "pot", "top", "tie"));
        System.out.println(groupAnagrams(list));
        list.addAll(Arrays.asList("lol", "llo", "rat", "tar","art","kart"));
        System.out.println(groupAnagrams2(list));
    }

    //return collection of lists of strings
    public static Collection<List<String>> groupAnagrams(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(w -> {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        })).values();
    }

    //return sets of sets of strings
    public static Set<Set<String>> groupAnagrams2(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(w -> {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }, Collectors.toSet())).values().stream().collect(Collectors.toSet());
    }
}