package com.codingbat.warmup_2;

/** https://codingbat.com/prob/p110019
 * @author Adam Wandoch
 */
public class Array667 {
    public int array667(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                counter++;
            }
        }
        return counter;
    }
}
