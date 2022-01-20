package com.codingbat.warmup_1;

/**
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
