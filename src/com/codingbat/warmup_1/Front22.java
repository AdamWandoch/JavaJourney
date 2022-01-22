package com.codingbat.warmup_1;

/** https://codingbat.com/prob/p183592
 * @author Adam Wandoch
 */
public class Front22 {
    public String front22(String str) {
        String letters;
        if (str.length() < 2) {
            letters = str;
        } else {
            letters = str.substring(0, 2);
        }
        return letters + str + letters;
    }
}
