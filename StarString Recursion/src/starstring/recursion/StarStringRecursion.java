/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starstring.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class StarStringRecursion {

    /**
     * @param n
     * @param args the command line arguments
     * @return 
     */
    public static String starString(int n) {
    
    if(n==0){ 
    return "*" ;}
    return starString(n-1)+ starString(n-1);
    }
    
    
    
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int n = input.nextInt();
        System.out.println(starString(n));
    }
    
}
