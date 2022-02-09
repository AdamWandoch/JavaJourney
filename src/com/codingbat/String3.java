package com.codingbat;

/**
 * https://codingbat.com/java/String-3
 * @author of solutions Adam Wandoch
 */
public final class String3 {

    /** https://codingbat.com/prob/p199171*/
    public int countYZ(String str) {
        char[] letters = str.toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'y' || letters[i] == 'z') {
                if (i + 1 > letters.length - 1) {
                    count++;
                } else {
                    if (!Character.isAlphabetic(letters[i + 1])) count++;
                }
            }
        }
        return count;
    }

    /** https://codingbat.com/prob/p192570 */
    public String withoutString(String base, String remove) {
        String result = "";
        String baseL = base.toLowerCase();
        String removeL = remove.toLowerCase();
        for (int i = 0; i < baseL.length(); i++) {
            if (baseL.startsWith(removeL, i)) {
                i += removeL.length() - 1;
            } else {
                result += base.charAt(i);
            }
        }
        return result;
    }

    /** https://codingbat.com/prob/p141736 */
    public boolean equalIsNot(String str) {
        int isCount = 0, notCount = 0;
        for (int i = 0; i < str.length(); i++ ) {
            if (str.startsWith("is", i)) isCount++;
            if (str.startsWith("not", i)) notCount++;
        }
        return isCount == notCount;
    }

    /** https://codingbat.com/prob/p198664 */
    public boolean gHappy(String str) {
        if (str.equals("") || str.equals("gg")) return true;
        if (str.length() < 2 || !str.contains("gg")) return false;
        for (int i = 1; i < str.length(); i++) {
            if (i < str.length() - 1) {
                if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') return false;
            } else if
                (str.charAt(str.length()-1) == 'g') return str.charAt(str.length()-2) == 'g';
        }
        return true;
    }

    /** https://codingbat.com/prob/p195714 */
    public int countTriple(String str) {
        if (str.length() < 3) return 0;
        int counter = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) counter++;
        }
        return counter;
    }

    /** https://codingbat.com/prob/p197890 */
    public int sumDigits(String str) {
        if (str == null || str.equals("")) return 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) sum += Integer.parseInt(str.substring(i, i + 1));
        }
        return sum;
    }

    /** https://codingbat.com/prob/p131516 */
    public String sameEnds(String string) {
        if (string.length() < 2) return "";
        String result = "";
        for (int i = 1; i <= string.length() / 2; i++) {
            if (string.substring(0, i).equals(string.substring(string.length() - i))) result = string.substring(0, i);
        }
        return result;
    }

    /** https://codingbat.com/prob/p139411 */
    public String mirrorEnds(String string) {
        if (string.length() < 2) return string;
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length()-1-i)) result += Character.valueOf(string.charAt(i));
            else return result;
        }
        return result;
    }

    /** https://codingbat.com/prob/p179479 */
    public int maxBlock(String str) {
        if (str == "") return 0;
        if (str.length() < 2) return 1;
        int counter, result = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            counter = 1;
            if (str.charAt(i) == str.charAt(i + 1)) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) counter++;
                    else break;
                }
                if (counter > result) result = counter;
            }
        }
        return result;
    }

}
