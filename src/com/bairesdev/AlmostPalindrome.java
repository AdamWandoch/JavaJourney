package com.bairesdev;

/** TASK: Palindrome is a word that reads the same forward and backward, i.e. "KAYAK"
 * Implement isAlmostPalindrome method taking String parameter and returning true if a given
 * string is a palindrome or if changing only one letter would also make it a palindrome
 * @author Adam Wandoch
 * */
public class AlmostPalindrome {

    public static void main(String[] args) {
        //test
        System.out.println(isAlmostPalindrome("ssADAM"));
        System.out.println(isAlmostPalindrome("sADAM"));
        System.out.println(isAlmostPalindrome("ADAM"));
    }

    //solution
    private static boolean isAlmostPalindrome(String word) {

        if (word != null) {
            char[] array = word.toCharArray();
            int count = 0;
            for (int i = 0; i < array.length / 2; i++) {  //swap characters back to front
                char temp = array[i];                     //swap start
                array[i] = array[array.length - 1 - i];   //swapping
                array[array.length - 1 - i] = temp;       //swap end
                if (temp != array[i]) {
                    count++;                              //count if swapped letters are not equal
                }
                if (count > 1) {
                    return false;      //return false if more than one swapped letter pair is not equal
                }
            }
            return true;  // true if you can reach this statement
        }
        return false; // return false for null
    }
}
