/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum.of.digits.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SumOfDigitsRecursion {

    /**
     * @param n
     * @return 
     */
     public static int sum(int n) {
     if (n%10 == 0 ){
     return 0;
     }else{
     return n%10+ sum (n/10);
     
     }
     
     
     
     
     }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
         int n = input.nextInt();  
         System.out.println(sum(n));
    }
    
}
