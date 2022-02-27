package com.codingbat;

import java.util.Arrays;
import java.util.Collections;

/** https://codingbat.com/java/Array-3
 * @author of solutions Adam Wandoch
 */
public final class Array3 {

    private Array3() {}

    /** https://codingbat.com/prob/p189576 */
    public int maxSpan(int[] nums) {
        if (nums.length == 0) return 0;
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) { //?? >= or > ??
                if (nums[i] == nums[j] && (j + 1 - i) > result) {
                    result = j - i + 1;
                }
            }
        }
        return result;
    }

    /** https://codingbat.com/prob/p159339*/
    public int[] fix34(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = 4;
                nums.indexOf
            }
        }
    }




}
