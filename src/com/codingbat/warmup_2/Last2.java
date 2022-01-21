package com.codingbat.warmup_2;

/**
 * @author Adam Wandoch
 */
public class Last2 {
    public int last2(String str) {
        if (str.length() >= 2) {
            int count = 0;
            String target = str.substring(str.length() - 2);
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(target)) {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }
}
