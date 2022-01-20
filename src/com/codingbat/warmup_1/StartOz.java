package com.codingbat.warmup_1;

/**
 * @author Adam Wandoch
 */
public class StartOz {
    public String startOz(String str) {
        if (str == "") {
            return str;
        }
        String result = "";
        if (str.substring(0, 1).equals("o")) {
            result += "o";
            if (str.length() == 1) {
                return result;
            }
        }
        if (str.substring(1, 2).equals("z")) {
            result += "z";
        }
        return result;
    }
}
