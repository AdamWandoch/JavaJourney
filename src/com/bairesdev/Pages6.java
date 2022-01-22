package com.bairesdev;

/** Mary wrote a book of 1536 pages. She numbered all the pages by hand.
 * How many times did she write the number 6?
 * @author Adam Wandoch
 */
public class Pages6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 1537; i++) {
            char[] digits = String.valueOf(i).toCharArray();
            for (int j = 0; j < digits.length; j++) {
                if (digits[j] == '6') {
                    count++;
                }
            }
        }
        System.out.println("Result: " + count);
    }
}
