package com.codingbat.warmup_2;

/** https://codingbat.com/prob/p117334
 * @author Adam Wandoch
 */
public class StringSplosion {
    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i + 1);
        }
        return result;
    }
}
