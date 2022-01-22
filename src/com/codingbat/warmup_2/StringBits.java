package com.codingbat.warmup_2;

/** https://codingbat.com/prob/p165666
 * @author Adam Wandoch
 */
public class StringBits {
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }
}
