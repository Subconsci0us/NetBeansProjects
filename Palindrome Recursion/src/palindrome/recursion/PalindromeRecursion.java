/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrome.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class PalindromeRecursion {

    /**
     * @param n
     * @return 
     */
      public static boolean check(String n) {
      if(n.length()==0 || n.length()==1){
      return true;
      }
      if(n.charAt(0) == n.charAt(n.length()-1)){
         return check(n.substring(1,n.length()-1));
      }
      return false;
      
      
      }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String n = input.next(); 
        System.out.println(check(n));
        
    }
    
}
