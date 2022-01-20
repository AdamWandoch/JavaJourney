package com.codingbat.warmup_2;

/**
 * @author Adam Wandoch
 */
public class AltPairs {
    public static String altPairs(String str) {
        if (str != null) {
            if (str.length() > 2) {
                String result = "";
                for (int i = 0; i < str.length()-1; i += 4) {
                    result += str.substring(i, i + 1);
                    result += str.substring(i + 1, i + 2);
                }
                if (str.length() % 2 != 0 && str.length() > 3) {
                    result += str.substring(str.length() - 1);
                }
                return result;
            }
            return str;
        }
        return "NullPointerException";
    }
}
