package com.codingbat.warmup_1;

/**
 * @author Adam Wandoch
 */
public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;
    }
}
