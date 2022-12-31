/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taking.average.of.several.numbers;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class TakingAverageOfSeveralNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int sum=0;
        int num= input.nextInt();
        int [] arry = new int [num];
        System.out.println("Input numbers");
        for (int i = 0; i < arry.length; i++) {
            arry [i]= input.nextInt(); 
        }
        for (int j = 0; j < arry.length; j++) {
            sum=sum+arry[j];
        }
        System.out.println(sum);
    }
    
}
