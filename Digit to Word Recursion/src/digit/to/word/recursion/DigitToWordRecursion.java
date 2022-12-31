/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digit.to.word.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class DigitToWordRecursion {
    public static void dtw(int n, String[] a) {
        if(n%10 == 0){
            
        }else{
            dtw(n/10,a);
        System.out.println(a[n%10]);
        
        
        }
 
 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
      int n = input.nextInt();
      String [] a= {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        dtw(n,a);
    }
    }
    

