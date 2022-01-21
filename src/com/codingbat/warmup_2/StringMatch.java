package com.codingbat.warmup_2;

/**
 * @author Adam Wandoch
 */
public class StringMatch {
    public int stringMatch(String a, String b) {
        int count = 0;
        if (a.length() > 1 && b.length() > 1) {
            if (a.length() < b.length()) {
                String temp = a;
                a = b;
                b = temp;
            }
            for (int i = 0; i < b.length() - 1; i++) {
                if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                    count++;
                }
            }
        }
        return count;
    }
}
