package com.codingbat.warmup_2;

/** https://codingbat.com/prob/p126212
 * @author Adam Wandoch
 */
public class StringYak {

    public static String stringYakMine(String str) {
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

    //online solution much easier and faster in performance:

    public static String stringYak(String str) {
        String result = "";

        for (int i=0; i<str.length(); i++) {
            // Look for i starting a "yak" -- advance i in that case
            if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
                i =  i + 2;
            } else { // Otherwise do the normal append
                result = result + str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        System.out.println("Started mine: " + stringYakMine("yrkADAMyakWANDyukOCHyek"));
        System.out.println("\t\ttime elapsed: " + (System.currentTimeMillis() - t1));

        t1 = System.currentTimeMillis();
        System.out.println("Started his: " + stringYak("yrkADAMyakWANDyukOCHyek"));
        System.out.println("\t\ttime elapsed: " + (System.currentTimeMillis() - t1));
    }
}
