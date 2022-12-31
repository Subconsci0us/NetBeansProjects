/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum.of.natural.number.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SumOfNaturalNumberRecursion {

    /**
     * @param n
     * @return 
     */
     public static int sum(int n) {
     if(n==0){
     return 0;
     }else{
     return n + sum(n-1);
     }
     
     
     
     
     }
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
         int n = input.nextInt();  
         System.out.println(sum(n));
    }
    
}
