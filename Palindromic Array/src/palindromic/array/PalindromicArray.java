/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromic.array;

/**
 *
 * @author Shayan
 */
public class PalindromicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String reverseStr="";
       String []arr = {"111","222","333","744","855"};
        for (int k = 0; k < arr.length; k++) {
        for (int i = (arr[k].length() - 1); i >=0; --i) {
            reverseStr = reverseStr + arr[k].charAt(i);
           }

           if (arr[k].equals(reverseStr)) {
              System.out.println( " is a Palindrome String.");
         }
              else {
               System.out.println( " is not a Palindrome String.");
             }
            
            
            reverseStr="";
            
         }
           
    }
}
    

