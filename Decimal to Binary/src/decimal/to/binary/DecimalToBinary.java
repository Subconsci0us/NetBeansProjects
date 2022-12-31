/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decimal.to.binary;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class DecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        
        int [] sum =new int [40];
        int i=0;
        System.out.println("Input a number");
        int a =input.nextInt();
     
        
        while(a>0){
        sum[i++]=a%2;
        a=(int)(a/2);
        }
        for(int j = i-1;j >= 0;j--){    
            System.out.print(sum[j]);   
     }  
        
        
    }
    
}
