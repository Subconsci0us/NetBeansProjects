/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seriesup.array;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SeriesUpArray {

    /**
     * @param a
     * @param args the command line arguments
     * @param arry
     */
    public static void series(int a, int[] arry) {
        int b=1;
        while(b != a){
            for (int i = b; i <=b; i++) {
                arry[i]=i;
                
            }
            b+=1;
        }
    
    
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a= input.nextInt();
         int [] arry = new int [10];
        series(a, arry);
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
            
        }
    }
    
}
