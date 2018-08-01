package com.ynm.gms.string_problems;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        process("abcde fz !");
        process("ABCD");
        process("Lotus");
    }

    public static String process(String input) {
        String result = "";
        char c2;

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');


        for (char c : input.toCharArray()) {
            //to mark upper case letters
            boolean makeLowerCase = false;

            // check if it is alphabetñ
            if (Character.isAlphabetic(c)) { //copy the code int the notepad //upperca //where is error?


                //check if it is upper case
                if (Character.isUpperCase(c)) {
                    //convert to lower case //
                    makeLowerCase = true;
                }

                if (c == 'Z') {
                    c2 = 'A';
                } else if (c == 'z') {
                    c2 = 'a';
                } else {
                    c2 = (char) ((int) c + 1);
                }

                if (!vowels.contains(c)) {
                    if (makeLowerCase) {
                        c2 = Character.toLowerCase(c2);
                    } else {
                        c2 = Character.toUpperCase(c2);
                    }
                }

            } else {
                // all non alphabetic char should pass as is
                c2 = c;
            }

            //just concatinate now
            result += c2;
        }
        System.out.println("input string:" + input);
        System.out.println("Result: " + result);

        return result;
    }


}

