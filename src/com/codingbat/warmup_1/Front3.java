package com.codingbat.warmup_1;

/** https://codingbat.com/prob/p136351
 * @author Adam Wandoch
 */
public class Front3 {
    public String front3(String str) {
        if (str.length() <= 3) {
            return str + str + str;
        }
        String front = str.substring(0, 3);
        return front + front + front;
    }
}
