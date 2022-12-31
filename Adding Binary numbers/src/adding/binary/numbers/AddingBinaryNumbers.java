/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adding.binary.numbers;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class AddingBinaryNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int i=0;
        int carry =0;
        int [] sum = new int[10];
        System.out.println("Input 2 numbers");
        long a =input.nextLong();
        long b =input.nextLong();
        
        while (a !=0 || b!= 0){
        
            sum[i++] = (int)(((a%10) +(b %10) +carry)%2);
            carry = (int)((a%10 + b %10)/2);
            a=a/10;
            b=b/10;
        }
        if(carry !=0){
        sum[i++]=carry;
    }
        for (int j = 0; j < sum.length; j++) {
            System.out.print(sum[i]);
                    }

    }
    
}
