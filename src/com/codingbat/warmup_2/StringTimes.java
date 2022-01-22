package com.codingbat.warmup_2;

/** https://codingbat.com/prob/p142270
 * @author Adam Wandoch
 */
public class StringTimes {
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }
}
