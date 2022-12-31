/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canbalance.array;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class CanBalanceArray {

    /**
     * @param args the command line arguments
     */
    public static boolean check(int [] arry ) {
        int sum1=0;
        int sum2=0;
     
        for (int i = 0; i < arry.length/2 ; i++) {
            sum1 += arry[i];
        }
        for (int i = arry.length/2 ; i < arry.length; i++) {
            sum2 += arry[i];
            
        }
      
        if(sum1==sum2){
        return true;
        }
        
        return false;
    
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] arry = {1,1,1,2,1};
        System.out.println(check(arry));
    }
    
}
