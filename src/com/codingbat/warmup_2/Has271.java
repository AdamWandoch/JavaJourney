package com.codingbat.warmup_2;

/** https://codingbat.com/prob/p167430
 * @author Adam Wandoch
 */

public class Has271 {
    public static boolean has271(int[] nums) {
        if (nums.length > 2) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i + 1] == nums[i] + 5 && (nums[i + 2] >= nums[i] - 3) && (nums[i + 2] <= nums[i] + 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
