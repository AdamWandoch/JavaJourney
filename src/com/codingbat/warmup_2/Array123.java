package com.codingbat.warmup_2;

/**
 * @author Adam Wandoch
 */
public class Array123 {
    public boolean array123(int[] nums) {
        if (nums.length > 2) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
