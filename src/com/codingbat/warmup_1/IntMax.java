package com.codingbat.warmup_1;

/** https://codingbat.com/prob/p101887
 * @author Adam Wandoch
 */
public class IntMax {
    public int intMax(int a, int b, int c) {
        int max = Math.max(a, b);
        return Math.max(max, c);
    }
}
