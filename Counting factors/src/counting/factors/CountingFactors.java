/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package counting.factors;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class CountingFactors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        int count=0;
       
       
      
        
        
        for (int i = 1; i <=num; i++) {
           if (num%i ==0){
               count +=1;
               System.out.println("Factor is : "+ i);
           }
            
            
        }
        System.out.println(" total factors : "+ count);
    }
    
}
