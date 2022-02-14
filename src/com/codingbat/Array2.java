package com.codingbat;

/** https://codingbat.com/java/Array-2
 * @author of solutions Adam Wandoch
 */
public class Array2 {

    /** https://codingbat.com/prob/p162010 */
    public int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) count++;
        }
        return count;
    }

    /** https://codingbat.com/prob/p196640 */
    public int bigDiff(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return max - min;
    }

    /** https://codingbat.com/prob/p136585 */
    public int centeredAverage(int[] nums) {
        //
    }


}
