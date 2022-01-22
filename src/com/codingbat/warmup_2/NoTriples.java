package com.codingbat.warmup_2;

/** https://codingbat.com/prob/p170221
 * @author Adam Wandoch
 */
public class NoTriples {
    public boolean noTriples(int[] nums) {
        if (nums.length > 2) {
            //int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (nums[i] == nums[j] && nums[i] == nums[j + 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
