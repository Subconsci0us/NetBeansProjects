/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverse.a.number.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class ReverseANumberRecursion {
    public static String Reverse(String a) {
   String result="";
    if(a.length()==1){
    return String.valueOf(a.charAt(0));
    }
    result= a.charAt(0)+ result;
    return Reverse(a.substring(1))+ result;
    
    
    
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
      int n = input.nextInt();
      String a = String.valueOf(n);
        System.out.println(Reverse(a));
    }
    
}
