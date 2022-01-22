package com.codingbat.warmup_1;

/** https://codingbat.com/prob/p125268
 * @author Adam Wandoch
 */
public class EndUp {
    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
    }
}
