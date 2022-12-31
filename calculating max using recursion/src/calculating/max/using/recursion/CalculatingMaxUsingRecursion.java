/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculating.max.using.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class CalculatingMaxUsingRecursion {

    /**
     * @param args the command line arguments
     */
    public static int max(int[] arr, int g,int max) {
        if(g==arr.length){
        return max;
        }
        if(arr[g]>max){
        max=arr[g];
        }
        g++;
        return max(arr,g,max);
    
    
    }
    public static void main(String[] args) {
        int g=0;
        int [] arr = {1,7,3,64,55};
        int max=arr[0];
        System.out.println(max(arr,g,max));
        
    }
    
}
