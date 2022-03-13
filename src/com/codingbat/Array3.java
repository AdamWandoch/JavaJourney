package com.codingbat;

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
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = 4;
                for (int j = (i + 2); j < nums.length; j++) {
                    if (nums[j] == 4) {
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    /** https://codingbat.com/prob/p125819 */
    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5) {
                        if (j > 0 && nums[j-1] != 4) {
                            int tmp = nums[i+1];
                            nums[i+1] = 5;
                            nums[j] = tmp;
                        }
                        else if (j == 0) {
                            int tmp = nums[i+1];
                            nums[i+1] = 5;
                            nums[j] = tmp;
                        }
                    }
                }
            }
        }
        return nums;
    }

    /** https://codingbat.com/prob/p158767 */
    public boolean canBalance(int[] nums) {


        return false;
    }









}
