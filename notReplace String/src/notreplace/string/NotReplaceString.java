/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notreplace.string;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class NotReplaceString {

    /**
     * @param str
     * @param args the command line arguments
     * @return 
     */
     public static String replace(String str) {
         String str2="";
         for (int i = 0; i < str.length()-1; i++) {
             if(str.charAt(i)=='i' && str.charAt(i+1)=='s'){
               str2=str.replaceAll("is", "is not");
             }     
         }
         return str2;
     
     
     }
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Input String");
        String str= input.next();
        System.out.println(replace(str));      
    }
    
}
