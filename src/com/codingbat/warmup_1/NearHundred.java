package com.codingbat.warmup_1;

/** https://codingbat.com/prob/p184004
 * @author Adam Wandoch
 */
public class NearHundred {
    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }
}
