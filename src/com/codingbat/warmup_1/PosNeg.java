package com.codingbat.warmup_1;

/**
 * @author Adam Wandoch
 */
public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (!negative) {
            if ((a > 0 && b < 0) || (b > 0 && a < 0)) {
                return true;
            }
            return false;
        }
        return (a < 0) && (b < 0);
    }
}
