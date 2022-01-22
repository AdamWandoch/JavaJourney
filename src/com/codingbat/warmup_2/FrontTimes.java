package com.codingbat.warmup_2;

/** https://codingbat.com/prob/p101475
 * @author Adam Wandoch
 */
public class FrontTimes {
    public String frontTimes(String str, int n) {
        if (str.length() > 3) {
            str = str.substring(0, 3);
        }
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }
}
