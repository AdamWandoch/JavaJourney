package com.codingbat.warmup_1;

/**
 * @author Adam Wandoch
 */
public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }
}
