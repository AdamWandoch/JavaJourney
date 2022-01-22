package com.codingbat.warmup_2;

/** https://codingbat.com/prob/p186759
 * @author Adam Wandoch
 */
public class DoubleX {
    boolean doubleX(String str) {
        if (str.length() > 1) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'x') {
                    if (str.charAt(i + 1) == 'x') {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
}
