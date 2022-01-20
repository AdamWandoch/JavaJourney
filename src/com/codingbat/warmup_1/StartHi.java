package com.codingbat.warmup_1;

/**
 * @author Adam Wandoch
 */
public class StartHi {
    public boolean startHi(String str) {
        if (str.length() > 1) {
            return (str.substring(0, 2).equals("hi"));
        }
        return false;
    }
}
