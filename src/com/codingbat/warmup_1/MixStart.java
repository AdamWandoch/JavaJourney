package com.codingbat.warmup_1;

/**
 * @author Adam Wandoch
 */
public class MixStart {
    public boolean mixStart(String str) {
        if (str.length() > 2) {
            return str.substring(1, 3).equals("ix");
        }
        return false;
    }
}
