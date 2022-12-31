/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumdigits.practice;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SumdigitsPractice {

    /**
     * @param args the command line arguments
     */
    public static int sum(String a) {
        int sum=0;
     String str= a.replaceAll("[^0-9]+", " ");
        String[] str2 = str.trim().split(" ");
        for (int i = 0; i < str2.length; i++) {
            sum= sum + Integer.parseInt(str2[i]);
            
        }
        return sum;
     
     
    
    
    
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        
        System.out.println(sum(a));
    }
    
}
