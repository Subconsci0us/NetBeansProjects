/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum.of.number.between.string;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SumOfNumberBetweenString {

    /**
     * @param str
     * @return 
     */
     public static int sum(String str) {
         int sum=0;
      String str1="";
      str1=str.replaceAll("[^0-9]", " ");
         System.out.println(str1);
      String [] token = str1.trim().split(" ");
         for (int i = 0; i < token.length; i++) {
             if(token[i]!=""){
             sum= sum + Integer.parseInt(token[i]);}
         }
         return sum;
     }
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Input String");
        String str= input.next();
        System.out.println(sum(str));
       
        
    }
    
}
