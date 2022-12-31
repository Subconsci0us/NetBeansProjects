/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2darray.task.pkg1;

import java.util.*;

/**
 *
 * @author Shayan
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void sum(int [][] arr,int b, int [] maximum) {
       
        int max=0;
        int counter=0;
        int u=0;
        int p=0;
        if(b==3){
        u=3;
        p=3;
        }
        if(b==4){
        u=2;
        p=2;
        }
       
        for (int i = 0; i < u; i++) { // i is set as 3 so index should be maximum  of checking row 3
            for (int j = 0; j < p; j++) { //j is set as 3 so index should be maximum  of checking column 3
                for (int k = i; k < i+b; k++) { //checking only 3x3 matrix
                    for (int h = j; h < j+b; h++) {
                        if(arr[k][h]>max){
                        max=arr[k][h];
                        }                     
                    }
                }
                //first 3x3 maximum value to be stored in 1-d array
                maximum[counter]=max;
                counter +=1;
                max=0;                
            }    
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
         int[] maximum= new int [16];
         try{
         
        
        int [][] arr =new int [5][5];
        System.out.println("Input size of matrix to calculate the sum of : ");
         int b=input.nextInt();
        if(b>=5){
            System.out.println("b should be smaller than a");
            System.exit(0);
        }
         System.out.println("Enter values for matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {              
                arr[i][j]=input.nextInt();
            } 
        }     
        sum(arr,b,maximum);
        for (int i = 0; i < maximum.length; i++) {
            System.out.println(maximum[i]);
        }
         }catch(InputMismatchException e1){
             System.out.println("Incorrect input...Enter integer only");
         }
         
         
         
         }
    }   

