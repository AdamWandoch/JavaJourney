package com.codingbat.warmup_1;

/** https://codingbat.com/prob/p182873
 * @author Adam Wandoch
 */
public class Makes10 {
    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || (a + b) == 10) {
            return true;
        }
        return false;
    }
}
