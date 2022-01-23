package com.codingbat;

/**
 * https://codingbat.com/java/Warmup-2
 * @author of solutions Adam Wandoch
 */
public final class WarmUp2 {

    private WarmUp2() {
    }

    /** https://codingbat.com/prob/p121596
     * @author Adam Wandoch
     */
    public static String altPairs(String str) {
        if (str != null) {
            if (str.length() > 2) {
                String result = "";
                for (int i = 0; i < str.length()-1; i += 4) {
                    result += str.substring(i, i + 1);
                    result += str.substring(i + 1, i + 2);
                }
                if (str.length() % 2 != 0 && str.length() > 3) {
                    result += str.substring(str.length() - 1);
                }
                return result;
            }
            return str;
        }
        return "NullPointerException";
    }

    /** https://codingbat.com/prob/p136041
     * @author Adam Wandoch
     */
    public static boolean array123(int[] nums) {
        if (nums.length > 2) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    /** https://codingbat.com/prob/p110019
     * @author Adam Wandoch
     */
    public static int array667(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                counter++;
            }
        }
        return counter;
    }

    /** https://codingbat.com/prob/p184031
     * @author Adam Wandoch
     */
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    /** https://codingbat.com/prob/p186031
     * @author Adam Wandoch
     */
    public static boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i < 4 && nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    /** https://codingbat.com/prob/p194667
     * @author Adam Wandoch
     */
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i,i+2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    /** https://codingbat.com/prob/p186759
     * @author Adam Wandoch
     */
    boolean doubleX(String str) {
        if (str.length() > 1) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == 'x') {
                    if (str.charAt(i + 1) == 'x') {
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }

    /** https://codingbat.com/prob/p101475
     * @author Adam Wandoch
     */
    public static String frontTimes(String str, int n) {
        if (str.length() > 3) {
            str = str.substring(0, 3);
        }
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

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

    /** https://codingbat.com/prob/p178318
     * @author Adam Wandoch
     */
    public static int last2(String str) {
        if (str.length() >= 2) {
            int count = 0;
            String target = str.substring(str.length() - 2);
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(target)) {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }

    /** https://codingbat.com/prob/p170221
     * @author Adam Wandoch
     */
    public static boolean noTriples(int[] nums) {
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

    /** https://codingbat.com/prob/p165666
     * @author Adam Wandoch
     */
    public static String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }

    /** https://codingbat.com/prob/p198640
     * @author Adam Wandoch
     */
    public static int stringMatch(String a, String b) {
        int count = 0;
        if (a.length() > 1 && b.length() > 1) {
            if (a.length() < b.length()) {
                String temp = a;
                a = b;
                b = temp;
            }
            for (int i = 0; i < b.length() - 1; i++) {
                if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                    count++;
                }
            }
        }
        return count;
    }

    /** https://codingbat.com/prob/p117334
     * @author Adam Wandoch
     */
    public static String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i + 1);
        }
        return result;
    }

    /** https://codingbat.com/prob/p142270
     * @author Adam Wandoch
     */
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    /** https://codingbat.com/prob/p171260
     * @author Adam Wandoch
     */
    public static String stringX(String str) {
        if (str != null) {
            if (str.length() < 3) {
                return str;
            }
            String front = str.substring(0, 1);
            String end = str.substring(str.length() - 1, str.length());
            String middle = str.substring(1, str.length() - 1).replaceAll("x", "");
            return front + middle + end;
        }
        return "NullPointerException";
    }

    /** https://codingbat.com/prob/p126212
     * @author Adam Wandoch
     */
    public static String stringYak(String str) {
        if (str != null && str.length() >= 3) {
            char[] letters = str.toCharArray();
            String result = "";
            for (int i = 0; i < str.length() - 2; i++) {
                if ((letters[i] == 'y')) {
                    if (i + 2 < str.length()) {
                        if (letters[i + 2] != 'k') {
                            result += String.valueOf(letters[i]);
                        } else {
                            i += 2;
                        }
                    }
                } else {
                    result += String.valueOf(letters[i]);
                }
            }
            if (letters[letters.length - 3] != 'y' || letters[letters.length - 1] != 'k') {
                result += str.substring(str.length() - 2);
            }
            return result;
        }
        return str;
    }
}
