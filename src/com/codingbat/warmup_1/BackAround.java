package com.codingbat.warmup_1;

/**
 * @author Adam Wandoch
 */
public class BackAround {
    public String backAround(String str) {
        String letter = str.substring(str.length() - 1);
        return letter + str + letter;
    }
}
