package com.bairesdev;

/** John wants to send a letter to Peter, who lives on Tesla Street.
 John doesn't remember the house number. However, he knows that it has 4 digits,
 it is a multiple of 5 and 7 and that the last digit is 0. What is the minimum
 number of letters that John has to send to be sure that Peter receives his letter?
 * @author Adam Wandoch
 */
public class LettersToSend {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i < 10000; i++) {
            if (i % 5 == 0 && i % 7 == 0 && i % 10 == 0) {
                count++;
            }
        }
        System.out.println("Result: " + count);
    }
}
