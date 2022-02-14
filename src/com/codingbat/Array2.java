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
        int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int n : nums) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return (sum - min - max) / (nums.length - 2);
    }

    /** https://codingbat.com/prob/p127384 */
    public int sum13(int[] nums) {
        //return 0 if array empty
        //init sum
        //loop fori until i < arr.length
        //if value[i] is 13 i++
        //keep adding otherwise
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) i++;
            else {
                sum += nums[i];
            }
        }
        return sum;
    }

    /** https://codingbat.com/prob/p111327 */
    public int sum67(int[] nums) {
        int sum = 0;
        boolean count = true;
        for (int n : nums) {
            if (n == 6) count = false;
            if (count) sum += n;
            if (n == 7) count = true;
        }
        return sum;
    }

    /** https://codingbat.com/prob/p121853 */
    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) return true;
        }
        return false;
    }

    /** https://codingbat.com/prob/p194525 */
    public boolean lucky13(int[] nums) {
        for (int n : nums) {
            if (n == 1 || n == 3) return false;
        }
        return true;
    }

    /** https://codingbat.com/prob/p199612 */
    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            if (n == 2) sum += 2;
        }
        return (sum == 8);
    }

    /** https://codingbat.com/prob/p104627 */
    public boolean more14(int[] nums) {
        int countOne = 0, countFour = 0;
        for (int n : nums) {
            if (n == 1) countOne++;
            if (n == 4) countFour++;
        }
        return (countOne > countFour);
    }

    /** https://codingbat.com/prob/p180920 */
    public int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }

    /** https://codingbat.com/prob/p186672 */
    public boolean only14(int[] nums) {
        for (int n : nums) {
            if (n != 1 && n != 4) return false;
        }
        return true;
    }

    /** https://codingbat.com/prob/p178353 */
    public String[] fizzArray2(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = String.valueOf(i);
        }
        return result;
    }

    /** https://codingbat.com/prob/p136648 */
    public boolean no14(int[] nums) {
        if (nums.length < 2) return true;
        boolean one = false, four = false;
        for (int n : nums) {
            if (n == 1) one = true;
            if (n == 4) four = true;
        }
        return (one ^ four);
    }















}
