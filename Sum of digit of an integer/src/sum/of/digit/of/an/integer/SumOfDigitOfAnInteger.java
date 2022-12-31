/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum.of.digit.of.an.integer;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SumOfDigitOfAnInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Input number");
        int total=0;
        int a =input.nextInt();
        while(a>0){
        total =  total + a%10;
        a=a/10;
        }
        System.out.println(total);
    
    
    }
    
}
