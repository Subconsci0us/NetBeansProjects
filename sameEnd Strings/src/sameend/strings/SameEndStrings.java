/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sameend.strings;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SameEndStrings {

    
     
        public static String sameEnds(String string) {

         int len = string.length();
             String fin = "";
            String tmp = "";
             for (int i = 0; i < len/2; i++) {
         tmp += string.charAt(i);
          int tmplen = tmp.length();
             if (tmp.equals(string.substring(len-tmplen,len)))
           fin = tmp;
  }
         return fin;

}

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        
        System.out.println(sameEnds(a));
    }
    
}
