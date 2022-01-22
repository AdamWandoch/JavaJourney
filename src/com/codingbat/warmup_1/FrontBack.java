package com.codingbat.warmup_1;

/** https://codingbat.com/prob/p123384
 * @author Adam Wandoch
 */
public class FrontBack {
    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }
}
