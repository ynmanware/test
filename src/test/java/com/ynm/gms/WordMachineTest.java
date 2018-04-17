package com.ynm.gms;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Auther Yogesh Manware
 */
public class WordMachineTest {


    @Test
    public void testProcess() throws Exception {
        WordMachine wm = new WordMachine();
        Assert.assertEquals("[13, 7]", wm.process("13 DUP 4 POP 5 DUP + DUP + -"));
    }
}