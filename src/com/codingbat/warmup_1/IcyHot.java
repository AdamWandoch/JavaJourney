package com.codingbat.warmup_1;

/**
 * @author Adam Wandoch
 */
public class IcyHot {
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }
}
