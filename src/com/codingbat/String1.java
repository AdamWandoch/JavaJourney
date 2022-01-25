package com.codingbat;

/** https://codingbat.com/java/String-1
 * @author of solutions Adam Wandoch
 */
public final class String1 {

    private String1() {}

    /** https://codingbat.com/prob/p171896 */
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
    /** https://codingbat.com/prob/p161056 */
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    /** https://codingbat.com/prob/p147483 */
    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /** https://codingbat.com/prob/p184030 */
    public static String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }

    /** https://codingbat.com/prob/p108853 */
    public static String extraEnd(String str) {
        return str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
    }

    /** https://codingbat.com/prob/p163411 */
    public static String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0,2);
    }

    /** https://codingbat.com/prob/p172267 */
    public static String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }

    /** https://codingbat.com/prob/p130896 */
    public static String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

    /** https://codingbat.com/prob/p168564 */
    public static String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        }
        return b + a + b;
    }

    /** https://codingbat.com/prob/p143825 */
    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    /** https://codingbat.com/prob/p197720 */
    public static String left2(String str) {
        return str.substring(2) + str.substring(0,2);
    }

    /** https://codingbat.com/prob/p130781 */
    public static String right2(String str) {
        return str.substring(str.length()-2) + str.substring(0, str.length() - 2);
    }

    /** https://codingbat.com/prob/p162477 */
    public static String theEnd(String str, boolean front) {
        if (front) return str.substring(0,1);
        return str.substring(str.length() - 1);
    }

    /** https://codingbat.com/prob/p174254 */
    public static String withouEnd2(String str) {
        if (str.length() < 3) return "";
        return str.substring(1,str.length() - 1);
    }

    /** https://codingbat.com/prob/p137729 */
    public static String middleTwo(String str) {
        return str.substring(str.length()/2-1,str.length()/2+1);
    }

    /** https://codingbat.com/prob/p103895 */
    public static boolean endsLy(String str) {
        if (str.length() < 2) return false;
        return str.substring(str.length() - 2).equals("ly");
    }

    /** https://codingbat.com/prob/p174148 */
    public static String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length() - n);
    }

    /** https://codingbat.com/prob/p144623 */
    public static String twoChar(String str, int index) {
        if (index < 0 || index + 1 > str.length() - 1) return str.substring(0,2);
        return str.substring(index, index + 2);
    }

    /** https://codingbat.com/prob/p115863 */
    public static String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    /** https://codingbat.com/prob/p139075 */
    public static boolean hasBad(String str) {
        if (str.length() < 3) return false;
        if (str.length() < 4) return str.substring(0,3).equals("bad");
        return str.substring(1,4).equals("bad") || str.substring(0,3).equals("bad");
    }

    /** https://codingbat.com/prob/p139076 */
    public static String atFirst(String str) {
        if (str.length() < 1) return "@@";
        if (str.length() < 2) return str + "@";
        return str.substring(0,2);
    }

    /** https://codingbat.com/prob/p138183 */
    public static String lastChars(String a, String b) {
        if (a.length() == 0) a = "@";
        if (b.length() == 0) b = "@";
        return a.substring(0,1) + b.substring(b.length()-1);
    }

    /** https://codingbat.com/prob/p132118 */
    public static String conCat(String a, String b) {
        if (a != "" && b != "") {
            if (a.charAt(a.length()-1) == b.charAt(0)) {
                b = b.substring(1);
            }
        }
        return a + b;
    }

    /** https://codingbat.com/prob/p194786 */
    public static String lastTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2,str.length() - 1);
        }
        if (str.length() == 2) {
            return str.substring(1,2) + str.substring(0,1);
        }
        return str;
    }

    /** https://codingbat.com/prob/p199216 */
    public static String seeColor(String str) {
        if (str.indexOf("red") == 0) return "red";
        if (str.indexOf("blue") == 0) return "blue";
        return "";
    }

    /** https://codingbat.com/prob/p196652 */
    public static boolean frontAgain(String str) {
        if (str.length() > 1) {
            if (str.substring(0,2).equals(str.substring(str.length() - 2))) {
                return true;
            }
        }
        return false;
    }

    /** https://codingbat.com/prob/p105745 */
    public static String minCat(String a, String b) {
        if (a.length() != b.length()) {
            if (a.length() > b.length()) {
                a = a.substring(a.length() - b.length());
            } else {
                b = b.substring(b.length() - a.length());
            }
        }
        return a + b;
    }

    /** https://codingbat.com/prob/p172063 */
    public static String extraFront(String str) {
        if (str.length() > 2) str = str.substring(0,2);
        return str + str + str;
    }

    /** https://codingbat.com/prob/p142247 */
    public static String without2(String str) {
        if (str.length() == 2) return "";
        if (str.length() > 2) {
            if (str.substring(0,2).equals(str.substring(str.length() - 2))) {
                return str.substring(2);
            }
        }
        return str;
    }

    /** https://codingbat.com/prob/p110141 */
    public static String deFront(String str) {
        String result = "";
        if (str.length() < 1) return str;
        if (str.length() < 2) {
            if (str.equals("a")) return "a";
            return str;
        }
        if (str.length() < 3) {
            if (str.charAt(0) == 'a') result += "a";
            if (str.charAt(1) == 'b') result += "b";
            return result;
        }
        if (str.charAt(0) == 'a') result += "a";
        if (str.charAt(1) == 'b') result += "b";
        return result + str.substring(2);
    }

    /** https://codingbat.com/prob/p141494 */
    public static String startWord(String str, String word) {
        if (str.equals("")) return "";
        if (word.length() < 2) return str.substring(0,1);
        if (str.length() < 3) return "";
        if (word.substring(1).equals(str.substring(1,word.length()))) {
            return str.substring(0,word.length());
        }
        return "";
    }

    /** https://codingbat.com/prob/p151940 */
    public static String withoutX(String str) {
        if (str.length() < 3) return str.replaceAll("x","");
        String result = "";
        if (str.charAt(0) != 'x') result += str.substring(0,1);
        result += str.substring(1,str.length()-1);
        if (str.charAt(str.length()-1) != 'x') result += str.substring(str.length()-1);
        return result;
    }

    /** https://codingbat.com/prob/p151359 */
    public static String withoutX2(String str) {
        if (str.length() <= 2) return str.replace("x","");
        String start = str.substring(0,2).replaceAll("x","");
        return start + str.substring(2);
    }


































}
