package com.codingbat.warmup_1;

/** https://codingbat.com/prob/p165701
 * @author Adam Wandoch
 */
public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 99) || (b >= 13 && b <= 99)) {
            return (a >= 13 && a <= 19) != (b >= 13 && b <= 19);
        }
        return false;
    }
}
