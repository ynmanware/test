package com.ynm.gms;

/**
 * @author Yogesh Manware
 */
public class Fibonacci {

    public static void main(String[] args) {
        fibonacci(6, true);
        System.out.println("\n=====================");
        easyFibonacci(6);
    }

    public static int fibonacci(int n, boolean print) {
        if (n == 0 || n == 1) {
            if (print)
                System.out.print(n);
            return n;
        } else {
            int value = fibonacci(n - 1, print) + fibonacci(n - 2, false);
            if (print) {
                System.out.print(" " + value);
            }
            return value;
        }
    }

    public static void easyFibonacci(int n) {
        int f1 = 0, f2 = 1, i;

        if (n < 1)
            return;

        for (i = 1; i <= n; i++) {
            System.out.print(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }
}

