package com.codingbat.warmup_1;

/**
 * @author Adam Wandoch
 */
public class LastDigit {
    public boolean lastDigit(int a, int b) {
        if (a > 9) {
            a = a % 10;
        }
        if (b > 9) {
            b = b % 10;
        }
        return (a == b);
    }
}
