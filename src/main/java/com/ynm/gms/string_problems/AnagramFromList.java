package com.ynm.gms.string_problems;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @auther Yogesh Manware
 */
public class AnagramFromList {
    private static Logger logger = LoggerFactory.getLogger(AnagramFromList.class);

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("eat", "tea", "pot", "top", "tie"));
        String resultList = groupAnagrams(list).toString();
        logger.info("List of words {} ", list);
        logger.info("Anagram View of the given list {}", resultList);
        list.clear();
        list.addAll(Arrays.asList("lol", "llo", "rat", "tar", "art", "kart"));
        String resultList2 = groupAnagrams2(list).toString();
        logger.info("List of words {} ", list);
        logger.info("Anagram View of the given list {}", resultList2);
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
    public static Collection<Set<String>> groupAnagrams2(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(w -> {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }, Collectors.toSet())).values();
    }
}