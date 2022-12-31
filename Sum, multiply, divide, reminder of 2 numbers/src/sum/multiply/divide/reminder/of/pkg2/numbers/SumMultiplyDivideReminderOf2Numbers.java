/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum.multiply.divide.reminder.of.pkg2.numbers;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SumMultiplyDivideReminderOf2Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input= new Scanner (System.in);
        System.out.println("Input 2 numbers");
        double a =input.nextInt();
        double b =input.nextInt();
        int sum=(int)(a+b);
        int multiply =(int) (a*b);
        double divide = a/b;
        double reminder =a%b;
        System.out.println("sum is: "+ sum);
        
        System.out.println("multiply is: "+ multiply);
        
        System.out.println("divide is: "+ divide);
        System.out.println("reminder is: "+ reminder);
        
        
    }
    
}
