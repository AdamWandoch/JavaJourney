package com.codingbat.warmup_1;

/**
 * @author Adam Wandoch
 */
public class Max1020 {
    public int max1020(int a, int b) {
        boolean aIS = (a >= 10 && a <= 20);
        boolean bIS = (b >= 10 && b <= 20);
        if (aIS) {
            if (bIS) {
                return Math.max(a, b);
            }
            return a;
        } else if (bIS) {
            return b;
        }
        return 0;
    }
}
