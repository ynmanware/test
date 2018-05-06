package com.ynm.gms;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @auther Yogesh Manware
 */
public class Test {

    public static void main(String[] args) {
        //find hidden files
        Arrays.stream(new File("../").listFiles(File::canRead)).collect(Collectors.toList()).forEach(file -> System.out.println(file.getName()));
    }
}
