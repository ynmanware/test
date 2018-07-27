package com.ynm.gms.string_problems;

/**
 * @author Yogesh Manware
 */
public class PalindromeChecker {
    public boolean execute(String inputStr) {

        //reverse the string
        String reverseStr = "";
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reverseStr += inputStr.charAt(i);
        }
        return inputStr.equals(reverseStr);
    }
}
