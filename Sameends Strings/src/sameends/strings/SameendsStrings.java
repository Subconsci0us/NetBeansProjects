/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sameends.strings;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SameendsStrings {

    /**
     * @param str
     * @param args the command line arguments
     * @return 
     */
    //abXaYab //XXX
     public static String check(String str) {
        String result = "";
        String temp = "";  
         for (int i = 0; i < str.length()/2; i++) {
             temp += str.charAt(i);
          if (temp.equals(str.substring(str.length()-temp.length(),str.length())))
              result = temp;
         }
      return result;
     }
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Input String");
        String str= input.next();
        System.out.println(check(str));
    }
    
}
