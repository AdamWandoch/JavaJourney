package com.codingbat;

/** https://codingbat.com/java/String-2
 * @author of solutions Adam Wandoch
 */
public final class String2 {

    private String2() {}

    /** https://codingbat.com/prob/p165312 */
    public String doubleChar(String str) {
        char[] letters = str.toCharArray();
        String result = "";
        for (char letter : letters) {
            result += letter;
            result += letter;

        }
        return result;
    }

    /** https://codingbat.com/prob/p147448 */
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
                i++;
            }
        }
        return count;
    }

    /** https://codingbat.com/prob/p111624 */
    public boolean catDog(String str) {
        int cat = 0, dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("dog")) dog++;
            if (str.substring(i, i + 3).equals("cat")) cat++;
        }
        return cat == dog;
    }

    /** https://codingbat.com/prob/p123614 */
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') count++;
        }
        return count;
    }

    /** https://codingbat.com/prob/p126880 */
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() >= b.length()) return (a.substring(a.length() - b.length()).equals(b));
        return (b.substring(b.length() - a.length()).equals(a));
    }

    /** https://codingbat.com/prob/p136594*/
    public boolean xyzThere(String str) {
        if (str.length() > 2 && str.contains("xyz")) {
            return str.replaceAll("\\.xyz", "").contains("xyz");
        }
        return false;
    }

    /** https://codingbat.com/prob/p175762 */
    public boolean bobThere(String str) {
        if (str.length() > 2) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
                    return true;
            }
        }
        return false;
    }

    /** https://codingbat.com/prob/p134250 */
    public boolean xyBalance(String str) {
        if (!str.contains("x")) return true;
        int index = str.lastIndexOf('x');
        for (int i = index; i < str.length(); i++) {
            if (str.charAt(i) == 'y') return true;
        }
        return false;
    }

    /** https://codingbat.com/prob/p125185 */
    public String mixString(String a, String b) {
        String small, big;
        String result = "";
        if (a.length() < b.length()) {
            small = a;
            big = b;
        } else {
             small = b;
             big = a;
        }
        for (int i = 0; i < small.length(); i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }
        if (a.length() != b.length()) result += big.substring(small.length());
        return result;
    }

    /** https://codingbat.com/prob/p152339 */
    public String repeatEnd(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str.substring(str.length()-n);
        }
        return result;
    }

    /** https://codingbat.com/prob/p128796 */
    public String repeatFront(String str, int n) {
        String result = "";
        for (int i = n; i > 0; i--) {
            result += str.substring(0, i);
        }
        return result;
    }

    /** https://codingbat.com/prob/p109637 */
    public String repeatSeparator(String word, String sep, int count) {
        String result = "";
        if (count > 0) {
            for (int i = 0; i < count - 1; i++) {
                result += (word + sep);
            }
            return result + word;
        }
        return result;
    }

    /** https://codingbat.com/prob/p136417 */
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        str = str.substring(1);
        return str.contains(prefix);
    }

    /** https://codingbat.com/prob/p159772 */
    public boolean xyzMiddle(String str) {
        if (str.contains("xyz")) {
            int left = str.indexOf("xyz") - 1;
            int right = // TBC
        }
        return false;
    }


}
