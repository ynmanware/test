package com.ynm.gms.string_problems;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Yogesh Manware
 */
public class PalindromeTest {

    private PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    public void testExecute() {
        Assert.assertTrue(palindromeChecker.execute("abba"));
        Assert.assertTrue(palindromeChecker.execute("aba"));
        Assert.assertFalse(palindromeChecker.execute("abbc"));
    }
}
