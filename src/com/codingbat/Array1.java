package com.codingbat;

import java.util.Arrays;

/** https://codingbat.com/java/Array-1
 * @author of solutions Adam Wandoch
 */
public final class Array1 {

    private Array1() {}

    /** https://codingbat.com/prob/p185685 */
    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    /** https://codingbat.com/prob/p118976 */
    public boolean sameFirstLast(int[] nums) {
        return (nums.length > 0 && nums[0] == nums[nums.length - 1]);
    }

    /** https://codingbat.com/prob/p167011 */
    public int[] makePi() {
        return new int[]{3,1,4};
    }

    /** https://codingbat.com/prob/p191991 */
    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    /** https://codingbat.com/prob/p175763 */
    public int sum3(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    /** https://codingbat.com/prob/p185139 */
    public int[] rotateLeft3(int[] nums) {
        int last = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1] = last;
        return nums;
    }

    /** https://codingbat.com/prob/p112409 */
    public int[] reverse3(int[] nums) {
        return new int[]{nums[2],nums[1],nums[0]};
    }

    /** https://codingbat.com/prob/p146256 */
    public int[] maxEnd3(int[] nums) {
        int largest;
        if (nums[0] > nums[2]) {
            largest = nums[0];
        } else {
            largest = nums[2];
        }
        return new int[]{largest,largest,largest};
    }

    /** https://codingbat.com/prob/p190968 */
    public int sum2(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length < 3) return Arrays.stream(nums).sum();
        return nums[0] + nums[1];
    }

    /** https://codingbat.com/prob/p146449 */
    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1],b[1]};
    }

    /** https://codingbat.com/prob/p101230 */
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0],nums[nums.length - 1]};
    }

    /** https://codingbat.com/prob/p171022 */
    public boolean has23(int[] nums) {
        for (int value : nums) {
            if (value == 2 || value == 3) return true;
        }
        return false;
    }

    /** https://codingbat.com/prob/p175689 */
    public boolean no23(int[] nums) {
        for (int value : nums) {
            if (value == 2 || value == 3) return false;
        }
        return true;
    }

    /** https://codingbat.com/prob/p137188 */
    public int[] makeLast(int[] nums) {
        int[] array = new int[nums.length * 2];
        array[array.length - 1] = nums[nums.length - 1];
        return array;
    }

    /** https://codingbat.com/prob/p145365 */
    public boolean double23(int[] nums) {
        int count2 = 0, count3 = 0;
        for (int value : nums) {
            if (value == 2) count2++;
            if (value == 3) count3++;
            if (count2 == 2 || count3 == 2) return true;
        }
        return false;
    }

    /** https://codingbat.com/prob/p120347 */
    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) nums[i + 1] = 0;
        }
        return nums;
    }

    /** https://codingbat.com/prob/p109660 */
    public int start1(int[] a, int[] b) {
        int counter = 0;
        if (a.length > 0 && a[0] == 1) counter++;
        if (b.length > 0 && b[0] == 1) counter++;
        return counter;
    }

    /** https://codingbat.com/prob/p109537 */
    public int[] biggerTwo(int[] a, int[] b) {
        if (a[0] + a[1] < b[0] + b[1]) return b;
        return a;
    }

    /** https://codingbat.com/prob/p199519 */
    public int[] makeMiddle(int[] nums) {
        int index = nums.length / 2 - 1;
        return new int[]{nums[index], nums[index + 1]};
    }

    /** https://codingbat.com/prob/p180840 */
    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

     /** https://codingbat.com/prob/p118044 */
     public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
     }

     /** https://codingbat.com/prob/p155713 */
     public int[] midThree(int[] nums) {
        int index = nums.length / 2;
        return new int[]{nums[index - 1], nums[index], nums[index + 1]};
     }

     /** https://codingbat.com/prob/p185176 */
     public int maxTriple(int[] nums) {
        int max = nums[0];
        if (nums[nums.length - 1] > max) max = nums[nums.length - 1];
        if (nums.length > 2) {
            if (nums[nums.length / 2] > max) max = nums[nums.length / 2];
        }
        return max;
     }

    /** https://codingbat.com/prob/p142455 */
    public int[] frontPiece(int[] nums) {
        if (nums.length < 2) return nums;
        return new int[]{nums[0], nums[1]};
    }

    /** https://codingbat.com/prob/p197308 */
    public boolean unlucky1(int[] nums) {
        if (nums.length < 2) return false;
        if (nums.length > 2 && nums[1] == 1 && nums[2] == 3) return true;
        if ((nums[0] == 1 && nums[1] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)) return true;
        return false;
    }
    /** https://codingbat.com/prob/p143461 */
    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if (a.length > 1) {
            result[0] = a[0];
            result[1] = a[1];
        } else if (a.length == 1) {
            result[0] = a[0];
            result[1] = b[0];
        } else {
            result[0] = b[0];
            result[1] = b[1];
        }
        return result;
    }

    /** https://codingbat.com/prob/p128270 */
    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) return a;
        if (a.length == 0) return new int[]{b[0]};
        if (b.length == 0) return new int[]{a[0]};
        return new int[]{a[0], b[0]};
    }

}
