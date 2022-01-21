package com.codingbat.warmup_2;

/**
 * @author Adam Wandoch
 */
public class StringYak {

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

    public static void main(String[] args) {
        System.out.println(stringYak("yakyakadYAKamadYAKamadYsKamyukyek"));
    }

}
