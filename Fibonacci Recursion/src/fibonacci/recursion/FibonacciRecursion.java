/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
//1,1,2,3,5,8,13
public class FibonacciRecursion {
    public static int fibonacci(int number){
        if(number == 2 || number == 3){
            return 1;
        }
      
        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
      int n = input.nextInt();
        System.out.println(fibonacci(n));
    }
    
}
