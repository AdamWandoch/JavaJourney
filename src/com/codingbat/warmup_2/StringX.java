package com.codingbat.warmup_2;

/**
 * @author Adam Wandoch
 */
public class StringX {
    public static String stringX(String str) {
        if (str != null) {
            if (str.length() < 3) {
                return str;
            }
            String front = str.substring(0, 1);
            String end = str.substring(str.length() - 1, str.length());
            String middle = str.substring(1, str.length() - 1).replaceAll("x", "");
            return front + middle + end;
        }
        return "NullPointerException";
    }
}
