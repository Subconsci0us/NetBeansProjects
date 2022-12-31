/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parenbit.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class ParenBitRecursion {

    /**
     * @param a
     * @param args the command line arguments
     * @return 
     */
   
public static String parenBit(String str) {

  if (str.equals("")) return str;

  if (str.charAt(0) == '(') {

    if (str.charAt(str.length()-1) == ')')

      return str;

    else

      return parenBit(str.substring(0, str.length()-1));

  } else

    return parenBit(str.substring(1));

}

    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         String a =input.next();
         System.out.println(parenBit(a));
    }
  
    
}
