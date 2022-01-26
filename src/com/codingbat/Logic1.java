package com.codingbat;

/** https://codingbat.com/java/Logic-1
 * @author of solutions Adam Wandoch
 */
public final class Logic1 {

    private Logic1() {}

    /** https://codingbat.com/prob/p159531 */
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) return true;
        if (cigars >= 40 && cigars <= 60) return true;
        return false;
    }

    /** https://codingbat.com/prob/p103360 */
    public static int dateFashion(int you, int date) {
        if (you > 7 || date > 7) {
            if (you < 3 || date < 3) return 0;
            return 2;
        }
        if (you < 3 || date < 3) return 0;
        return 1;
    }

    /** https://codingbat.com/prob/p141061 */
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp >= 60 && temp <= 100) {
            if (!isSummer) return temp <= 90;
            return true;
        }
        return false;
    }

    /** https://codingbat.com/prob/p157733 */
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int limit1 = 60, limit2 = 80;
        if (isBirthday) {
            limit1 += 5;
            limit2 += 5;
        }
        if (speed <= limit1) return 0;
        if (speed > limit1 && speed <= limit2) return 1;
        return 2;
    }

}
