package com.codingbat;

/**
 * https://codingbat.com/java/Warmup-1
 * @author of solutions Adam Wandoch
 */
public final class WarmUp1 {

    private WarmUp1() {
    }

    /**
     * https://codingbat.com/prob/p161642
     * @author Adam Wandoch
     */
    public static String backAround(String str) {
        String letter = str.substring(str.length() - 1);
        return letter + str + letter;
    }

    /** https://codingbat.com/prob/p172021
     * @author Adam Wandoch
     */
    public static int close10(int a, int b) {
        int aD = Math.abs(a - 10);
        int bD = Math.abs(b - 10);
        if (aD < bD) {
            return a;
        }
        if (aD > bD) {
            return b;
        }
        return 0;
    }

    /** https://codingbat.com/prob/p100905
     * @author Adam Wandoch
     */
    public static String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    /** https://codingbat.com/prob/p116624
     * @author Adam Wandoch
     */
    public static int diff21(int n) {
        if (n < 0) {
            return -n + 21;
        }

        if (n <= 21) {
            return 21 - n;
        }
        return 2 * (n - 21);
    }

    /** https://codingbat.com/prob/p125268
     * @author Adam Wandoch
     */
    public static String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
    }

    /** https://codingbat.com/prob/p196441
     * @author Adam Wandoch
     */
    public static String everyNth(String str, int n) {
        String s = "";
        for (int i = 0; i < str.length(); i += n) {
            s += str.charAt(i);
        }
        return s;
    }

    /** https://codingbat.com/prob/p136351
     * @author Adam Wandoch
     */
    public static String front3(String str) {
        if (str.length() <= 3) {
            return str + str + str;
        }
        String front = str.substring(0, 3);
        return front + front + front;
    }

    /** https://codingbat.com/prob/p183592
     * @author Adam Wandoch
     */
    public static String front22(String str) {
        String letters;
        if (str.length() < 2) {
            letters = str;
        } else {
            letters = str.substring(0, 2);
        }
        return letters + str + letters;
    }

    /** https://codingbat.com/prob/p123384
     * @author Adam Wandoch
     */
    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    /** https://codingbat.com/prob/p178986
     * @author Adam Wandoch
     */
    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    /** https://codingbat.com/prob/p192082
     * @author Adam Wandoch
     */
    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    /** https://codingbat.com/prob/p144535
     * @author Adam Wandoch
     */
    public static  boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    /** https://codingbat.com/prob/p132134
     * @author Adam Wandoch
     */
    public static boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40 && b >= 30 && b <= 40) ||
                (a >= 40 && a <= 50 && b >= 40 && b <= 50);
    }

    /** https://codingbat.com/prob/p101887
     * @author Adam Wandoch
     */
    public static int intMax(int a, int b, int c) {
        int max = Math.max(a, b);
        return Math.max(max, c);
    }

    /** https://codingbat.com/prob/p125339
     * @author Adam Wandoch
     */
    public static boolean lastDigit(int a, int b) {
        if (a > 9) {
            a = a % 10;
        }
        if (b > 9) {
            b = b % 10;
        }
        return (a == b);
    }

    /** https://codingbat.com/prob/p165701
     * @author Adam Wandoch
     */
    public static boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 99) || (b >= 13 && b <= 99)) {
            return (a >= 13 && a <= 19) != (b >= 13 && b <= 19);
        }
        return false;
    }

    /** https://codingbat.com/prob/p182873
     * @author Adam Wandoch
     */
    public static boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || (a + b) == 10) {
            return true;
        }
        return false;
    }

    /** https://codingbat.com/prob/p177372
     * @author Adam Wandoch
     */
    public static int max1020(int a, int b) {
        boolean aIS = (a >= 10 && a <= 20);
        boolean bIS = (b >= 10 && b <= 20);
        if (aIS) {
            if (bIS) {
                return Math.max(a, b);
            }
            return a;
        } else if (bIS) {
            return b;
        }
        return 0;
    }

    /** https://codingbat.com/prob/p190570
     * @author Adam Wandoch
     */
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    /** https://codingbat.com/prob/p151713
     * @author Adam Wandoch
     */
    public static boolean mixStart(String str) {
        if (str.length() > 2) {
            return str.substring(1, 3).equals("ix");
        }
        return false;
    }

    /** https://codingbat.com/prob/p181646
     * @author Adam Wandoch
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile) {
            return true;
        }
        return false;
    }

    /** https://codingbat.com/prob/p184004
     * @author Adam Wandoch
     */
    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    /** https://codingbat.com/prob/p191914
     * @author Adam Wandoch
     */
    public static String notString(String str) {
        if (str.length() >= 3) {
            if (str.substring(0, 3).equals("not")) {
                return str;
            }
        }
        return "not " + str;
    }

    /** https://codingbat.com/prob/p112564
     * @author Adam Wandoch
     */
    public static boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }

    /** https://codingbat.com/prob/p140449
     * @author Adam Wandoch
     */
    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;
    }

    /** https://codingbat.com/prob/p159227
     * @author Adam Wandoch
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        if (!negative) {
            if ((a > 0 && b < 0) || (b > 0 && a < 0)) {
                return true;
            }
            return false;
        }
        return (a < 0) && (b < 0);
    }

    /** https://codingbat.com/prob/p187868
     * @author Adam Wandoch
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!vacation) {
            if (weekday) {
                return false;
            }
        }
        return true;
    }

    /** https://codingbat.com/prob/p191022
     * @author Adam Wandoch
     */
    public static boolean startHi(String str) {
        if (str.length() > 1) {
            return (str.substring(0, 2).equals("hi"));
        }
        return false;
    }

    /** https://codingbat.com/prob/p199720
     * @author Adam Wandoch
     */
    public static String startOz(String str) {
        if (str == "") {
            return str;
        }
        String result = "";
        if (str.substring(0, 1).equals("o")) {
            result += "o";
            if (str.length() == 1) {
                return result;
            }
        }
        if (str.substring(1, 2).equals("z")) {
            result += "z";
        }
        return result;
    }

    /** https://codingbat.com/prob/p173784
     * @author Adam Wandoch
     */
    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }

    /** https://codingbat.com/prob/p154485
     * @author Adam Wandoch
     */
    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        }
        return a + b;
    }
}
