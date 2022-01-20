package com.codingbat.warmup_1;

/**
 * @author Adam Wandoch
 */
public class Diff21 {
    public int diff21(int n) {
        if (n < 0) {
            return -n + 21;
        }

        if (n <= 21) {
            return 21 - n;
        }
        return 2 * (n - 21);
    }
}
