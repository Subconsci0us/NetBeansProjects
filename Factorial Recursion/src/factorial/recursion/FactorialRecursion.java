/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class FactorialRecursion {
    public static int factorial(int n) {
    if(n==1){
    return 1;
       }
    return n*factorial(n-1);
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      int n = input.nextInt();
        System.out.println(factorial(n));
    }
    
}
