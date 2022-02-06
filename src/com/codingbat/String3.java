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

}
