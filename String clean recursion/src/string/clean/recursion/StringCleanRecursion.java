/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string.clean.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class StringCleanRecursion {

    /**
     * @param str
     * @param a
     * @param args the command line arguments
     * @return 
     */
     public static String clean(String str) {
        if (str.length() < 2) return str;

  if (str.charAt(0) == str.charAt(1))

    return clean(str.substring(1));

  else

    return str.charAt(0) + clean(str.substring(1));

     }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String a= input.next();
        System.out.println(clean(a));
    }
    
}
