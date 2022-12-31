/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum.of.pkg2.numbers;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SumOf2Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
        System.out.println("Input 2 numbers");
        int a =input.nextInt();
        int b =input.nextInt();
        int sum =a+b;
        System.out.println(sum);
        System.out.println(1%2);
        
    }
    
}
