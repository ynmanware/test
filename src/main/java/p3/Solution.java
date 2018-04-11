package p3;

import java.util.Arrays;

public class Solution {

    int solution(int n) {
        int o = n;
        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }

        System.out.println("binary: " + Arrays.toString(d));
        System.out.println("binary: " + Integer.toBinaryString(o));

        for (p = 1; p < l; ++p) {
            int i;
            boolean ok = true;
            for (i = 0; i < l - p; ++i) {
                if (d[i] != d[i + p]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return p;
            }
        }
        return -1;
    }
}