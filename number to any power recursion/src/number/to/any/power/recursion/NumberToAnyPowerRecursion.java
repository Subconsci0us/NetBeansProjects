/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number.to.any.power.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class NumberToAnyPowerRecursion {

    /**
     * @param args the command line arguments
     */
        public static int power(int a, int b) {
        int result=1;
        if (b==1){
        return a;
        }else{
        result=result*a;
        }
        return result*power(a,b-1);
        
        
        
        
        }
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       int a=input.nextInt();
       int b=input.nextInt();
        System.out.println(power(a,b));
    }
    
}
