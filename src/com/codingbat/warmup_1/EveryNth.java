package com.codingbat.warmup_1;

/** https://codingbat.com/prob/p196441
 * @author Adam Wandoch
 */
public class EveryNth {
    public String everyNth(String str, int n) {
        String s = "";
        for (int i = 0; i < str.length(); i += n) {
            s += str.charAt(i);
        }
        return s;
    }
}
