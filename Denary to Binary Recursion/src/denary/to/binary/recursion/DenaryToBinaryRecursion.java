/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package denary.to.binary.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class DenaryToBinaryRecursion {

    /**
     * @param n
     * @param result
     * @return 
     */
     public static String sum(int n, String result) {
     if(n == 0){
     return result;
     }
     
     result= n%2 +result;
     return sum(n/2, result);
     
     }
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       String result="";
         int n = input.nextInt();  
         System.out.println(sum(n,result));
    }
    
}
