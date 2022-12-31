/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countdown.to.pkg0.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class CountdownTo0Recursion {
   public static void countdown(int n) {
   if (n==0){
    System.out.println(n);
   }else{
     System.out.println(n); 
     countdown(n-1);
   }
   
   
   }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
      int n = input.nextInt();
        countdown(n);
    }
    
}
