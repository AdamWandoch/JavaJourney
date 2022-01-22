package com.codingbat.warmup_1;

/** https://codingbat.com/prob/p187868
 * @author Adam Wandoch
 */
public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!vacation) {
            if (weekday) {
                return false;
            }
        }
        return true;
    }
}
