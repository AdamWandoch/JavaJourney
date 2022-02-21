package com.codingbat;

import java.util.Arrays;

/** https://codingbat.com/java/Array-2
 * @author of solutions Adam Wandoch
 */
public final class Array2 {

    private Array2() {}

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

    /** https://codingbat.com/prob/p110222 */
    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) return false;
        }
        return true;
    }

    /** https://codingbat.com/prob/p191878 */
    public boolean either24(int[] nums) {
        boolean twoPaired = false, fourPair = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) twoPaired = true;
            if (nums[i] == 4 && nums[i + 1] == 4) fourPair = true;
        }
        return (twoPaired ^ fourPair);
    }

    /** https://codingbat.com/prob/p136254 */
    public int matchUp(int[] nums1, int[] nums2) {
        int counter = 0;
        for (int i = 0; i < nums1.length; i++) {
            if ((Math.abs(nums1[i] - nums2[i]) < 3) && nums1[i] != nums2[i]) counter++;
        }
        return counter;
    }

    /** https://codingbat.com/prob/p168357 */
    public boolean has77(int[] nums) {
        if (nums.length < 2) return false;
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] == 7 && nums[i + 1] == 7) || (nums[i] == 7 && nums[i + 2] == 7)) return true;
        }
        return (nums[nums.length - 1] == 7 && nums[nums.length - 2] == 7);
    }

    /** https://codingbat.com/prob/p169260 */
    public boolean has12(int[] nums) {
        boolean hasOne = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) hasOne = true;
            if (hasOne) {
                if (nums[i] == 2) return true;
            }
        }
        return false;
    }

    /** https://codingbat.com/prob/p159979 */
    public boolean modThree(int[] nums) {
        if (nums.length < 3) return false;
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0) ||
                (nums[i] % 2 != 0 && nums[i+1] % 2 != 0 && nums[i+2] % 2 != 0))
                return true;
        }
        return false;
    }

    /** https://codingbat.com/prob/p109783 */
    public boolean haveThree(int[] nums) {
        if (nums.length < 3) return false;
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (counter > 3) return false;
            if (nums[i] == 3) counter++;
            if (nums[i] == 3 && nums[i + 1] == 3) return false;
        }
        if (nums[nums.length - 1] == 3) counter++;
        return (counter == 3);
    }

    /** https://codingbat.com/prob/p102145 */
    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                i++;
                if (!(i < (nums.length)) || nums[i] != 2) return false;
                while (i < nums.length && nums[i] == 2) i++;
            }
        }
        return true;
    }

    /** https://codingbat.com/prob/p134300 */
    public boolean sameEnds(int[] nums, int len) {
        if (len > nums.length) return false;
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) return false;
        }
        return true;
    }

    /** https://codingbat.com/prob/p137874 */
    public boolean tripleUp(int[] nums) {
        if (nums.length < 4) return false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] - 1 && nums[i] == nums[i + 2] - 2) return true;
        }
        return false;
    }

    /** https://codingbat.com/prob/p142539 */
    public int[] fizzArray3(int start, int end) {
        int[] result = new int[end - start];
        for (int i = 0; i < result.length; i++) {
            result[i] = start + i;
        }
        return result;
    }

    /** https://codingbat.com/prob/p105031 */
    public int[] shiftLeft(int[] nums) {
        if (nums.length < 2) return nums;
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }

    /** https://codingbat.com/prob/p199484 */
    public int[] tenRun(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 10 == 0) {
                temp = nums[i];
                if (nums[i + 1] % 10 != 0) nums[i + 1] = temp;
            }
        }
        return nums;
    }

    /** https://codingbat.com/prob/p100246 */
    public int[] pre4(int[] nums) {
        if (nums.length < 2) return new int[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) return Arrays.copyOf(nums, i);
        }
        return nums;
    }

    /** https://codingbat.com/prob/p164144 */
    public int[] post4(int[] nums) {
        if (nums.length < 2) return new int[0];
        for (int i = (nums.length - 1); i >= 0; i--) {
            if (nums[i] == 4) return Arrays.copyOfRange(nums, i + 1, nums.length);
        }
        return nums;
    }

    /** https://codingbat.com/prob/p169506 */
    public int[] notAlone(int[] nums, int val) {
        if (nums.length < 3) return nums;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
        }
        return nums;
    }

    /** https://codingbat.com/prob/p193753*/
    public int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int frontIndex = 0, backIndex = result.length - 1;
        for (int n : nums) {
            if (n == 0)
                result[frontIndex++] = n;
            else result[backIndex--] = n;
        }
        return result;
    }

    /** https://codingbat.com/prob/p196976 */
    public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int frontIndex = 0, backIndex = result.length - 1;
        for (int n : nums) {
            if (n != 10)
                result[frontIndex++] = n;
            else result[backIndex--] = 0;
        }
        return result;
    }

    /** https://codingbat.com/prob/p187050 */
    public int[] zeroMax(int[] nums) {
        int largestOdd = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) nums[i] = largestOdd;
            if (nums[i] % 2 != 0 && nums[i] > largestOdd) largestOdd = nums[i];
        }
        return nums;
    }

    /** https://codingbat.com/prob/p105771 */
    public int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int frontIndex = 0, backIndex = result.length - 1;
        for (int n : nums) {
            if (n % 2 == 0)
                result[frontIndex++] = n;
            else result[backIndex--] = n;
        }
        return result;
    }

    /** https://codingbat.com/prob/p153059 */
    public String[] fizzBuzz(int start, int end) {
        String[] result = new String[end - start];
        for (int i = 0; i < result.length; i++) {
            if ((i + start) % 3 == 0) result[i] = "Fizz";
            if ((i + start) % 5 == 0) result[i] = "Buzz";
            if ((i + start) % 15 == 0) result[i] = "FizzBuzz";
            if (result[i] == null) result[i] = String.valueOf(i + start);
        }
        return result;
    }
}
