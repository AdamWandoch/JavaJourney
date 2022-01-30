package com.codingbat;

/**
 * @author of solutions Adam Wandoch
 */
public final class Logic2 {

    private Logic2 () {};

    /** https://codingbat.com/prob/p183562 */
    public boolean makeBricks(int small, int big, int goal) {
        if (goal <= big * 5 + small) {
            if (small >= goal || (big * 5 >= goal && goal % 5 == 0)) return true;
            if (goal % 5 <= small) return true;
        }
        return false;
    }

    /** https://codingbat.com/prob/p148972 */
    public int loneSum(int a, int b, int c) {
        if (a != b && b != c && a != c) return a + b + c;
        if (a == b && b == c) return 0;
        if (a == b) return c;
        if (a == c) return b;
        return a;
    }

    /** https://codingbat.com/prob/p130788 */
    public int luckySum(int a, int b, int c) {
        if (a != 13 && b != 13 && c != 13) return a + b + c;
        if (a == 13) return 0;
        if (b == 13) return a;
        return a + b;
    }

    /** https://codingbat.com/prob/p182879 */
    public int noTeenSum(int a, int b, int c) {
        int sum = 0;
        if (a >= 13 && a <= 19) {
            sum += fixTeen(a);
        } else sum += a;
        if (b >= 13 && b <= 19) {
            sum += fixTeen(b);
        } else sum += b;
        if (c >= 13 && c <= 19) {
            sum += fixTeen(c);
        } else sum += c;
        return sum;
    }

    public int fixTeen(int n) {
        if (n != 15 && n != 16) return 0;
        return n;
    }

    /** https://codingbat.com/prob/p186753 */
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int n) {
        if (n < 10) {
            if (n >= 5) return 10;
            return 0;
        }
        if (n % 10 >= 5) {
            return n / 10 * 10 + 10;
        }
        return n / 10 * 10;
    }

    /** https://codingbat.com/prob/p138990 */
    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1) {
            return Math.abs(a - c) > 1 && Math.abs(b - c) > 1;
        }
        return Math.abs(a - c) <= 1 && Math.abs(b - a) > 1 && Math.abs(b - c) > 1;
    }

    /** https://codingbat.com/prob/p117019 */
    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) return 0;
        if (a > 21) return b;
        if (b > 21) return a;
        if (Math.abs(a - 21) < Math.abs(b - 21)) return a;
        return b;
    }

    /** https://codingbat.com/prob/p198700 */
    public boolean evenlySpaced(int a, int b, int c) {
        if (a < b && a < c) {
            if (b < c) {
                return (c - b == b - a);
            }
            return (b - c == c - a);
        }
        if (b < a && b < c) {
            if (a < c) {
                return (c - a == a - b);
            }
            return (a - c == c - b);
        }
        if (a < b) {
            return (b - a == a - c);
        }
        return (a - b == b - c);
    }

    /** https://codingbat.com/prob/p191363 */
    public int makeChocolate(int small, int big, int goal) {
        int missing = goal - 5 * big;
        if (missing <= small && missing >= 0) return missing;
        if (missing < 0 && goal % 5 <= small) return goal % 5;
        return -1;
    }
}
