package com.codingbat.warmup_1;

/** https://codingbat.com/prob/p190570
 * @author Adam Wandoch
 */
public class MissingChar {
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
}
