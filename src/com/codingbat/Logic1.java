package com.codingbat;

/** https://codingbat.com/java/Logic-1
 * @author of solutions Adam Wandoch
 */
public final class Logic1 {

    private Logic1() {}

    /** https://codingbat.com/prob/p159531 */
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) return true;
        if (cigars >= 40 && cigars <= 60) return true;
        return false;
    }

    /** https://codingbat.com/prob/p103360 */
    public int dateFashion(int you, int date) {
        if (you > 7 || date > 7) {
            if (you < 3 || date < 3) return 0;
            return 2;
        }
        if (you < 3 || date < 3) return 0;
        return 1;
    }

    /** https://codingbat.com/prob/p141061 */
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp >= 60 && temp <= 100) {
            if (!isSummer) return temp <= 90;
            return true;
        }
        return false;
    }

    /** https://codingbat.com/prob/p157733 */
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int limit1 = 60, limit2 = 80;
        if (isBirthday) {
            limit1 += 5;
            limit2 += 5;
        }
        if (speed <= limit1) return 0;
        if (speed > limit1 && speed <= limit2) return 1;
        return 2;
    }

    /** https://codingbat.com/prob/p183071 */
    public int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) return 20;
        return a + b;
    }

    /** https://codingbat.com/prob/p160543 */
    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day > 0 && day < 6) return "10:00";
            return "off";
        }
        if (day > 0 && day < 6) return "7:00";
        return "10:00";
    }

    /** https://codingbat.com/prob/p137742 */
    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) return true;
        if (a + b == 6 || a - b == 6 || b - a == 6) return true;
        return false;
    }

    /** https://codingbat.com/prob/p137365 */
    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode) return (n >= 1 && n <= 10);
        return (n <= 1 || n >= 10);
    }

    /** https://codingbat.com/prob/p100962 */
    public boolean specialEleven(int n) {
        return ((n % 11 == 0) || ((n - 1) % 11 == 0));
    }

    /** https://codingbat.com/prob/p118290 */
    public boolean more20(int n) {
        return ((n - 1) % 20 == 0 || (n - 2) % 20 == 0);
    }

    /** https://codingbat.com/prob/p159612 */
    public boolean old35(int n) {
        return (n % 3 == 0 && n % 5 != 0) || (n % 3 != 0 && n % 5 == 0);
    }

    /** https://codingbat.com/prob/p133158 */
    public boolean less20(int n) {
        return ((n + 1) % 20 == 0 || (n + 2) % 20 == 0);
    }

    /** https://codingbat.com/prob/p193613 */
    public boolean nearTen(int num) {
        return (num - 2) % 10 == 0 || (num - 1) % 10 == 0 || num % 10 == 0 || (num + 1) % 10 == 0 || (num + 2) % 10 == 0;
    }

    /** https://codingbat.com/prob/p178728 */
    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) return 19;
        return a + b;
    }

    /** https://codingbat.com/prob/p110973 */
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (!isAsleep) {
            if (!isMorning) return true;
            if (isMom) return true;
        }
        return false;
    }

    /** https://codingbat.com/prob/p177181 */
    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        if (tea >= candy * 2 || candy >= tea * 2) return 2;
        return 1;
    }


}
