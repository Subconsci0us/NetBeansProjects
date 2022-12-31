/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decimal.to.hexadecimal;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class DecimalToHexadecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        
        int [] sum =new int [40];
        char b;
        System.out.println("Input a number");
        int a =(input.nextInt());
        if (a>64 && a<91){
            b= (char)a;
            System.out.print(b);
        }
        
        
        
    
        
    }
    
}
