/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swapping.pkg2.variables;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class Swapping2Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Input 2 numbers");
        int temp;
        int a =input.nextInt();
        int b =input.nextInt();
        System.out.println(a);
        System.out.println(b);
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    
    
    }   
    
}
