package com.codingbat.warmup_1;

/** https://codingbat.com/prob/p172021
 * @author Adam Wandoch
 */
public class Close10 {
    public int close10(int a, int b) {
        int aD = Math.abs(a - 10);
        int bD = Math.abs(b - 10);
        if (aD < bD) {
            return a;
        }
        if (aD > bD) {
            return b;
        }
        return 0;
    }
}
