/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package submatrix.arrray;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SubMatrixArrray {

    /**
     * @param args the command line arguments
     */
     public static void display(int [][] arr) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                 System.out.print(arr[i][j] + " ");
                 
             }
             System.out.println();
             
         }
     
     
     }
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int sum=0;
        System.out.println("Enter rows");
        int a= input.nextInt();
       int [][]arr = new int [a][a];
       int []arrsumofrow = new int [a];
       int []arrsumofcolumn = new int [a];
       //input
        for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                  arr[i][j]=input.nextInt();  
            }   
          }
        //row check
        for (int i = 0; i < arr.length; i++) {
             sum=0;
            for (int j = 0; j < arr[i].length-1; j++) {
               
                    if(arr[i][j]==arr[i][j+1]){
                        sum+= arr[i][j];
                    }
                
            }
            arrsumofrow[i]=sum;
           
        }
        sum=0;
        for (int i = 0; i < arr[0].length-1; i++) {
             sum=0;
            for (int j = 0; j < arr.length; j++) {
              
                    if(arr[i][j]==arr[i+1][j]){
                sum+= arr[j][i];
                    }
                
                
            }
            arrsumofcolumn[i]=sum;
           
        }
        
        //checking sum of column
        for (int i = 0; i < arrsumofcolumn.length; i++) {
            System.out.println(arrsumofcolumn[i]);  
        }
        //checking sum of row
        for (int i = 0; i < arrsumofrow.length; i++) {
            System.out.println(arrsumofrow[i]);  
        }
       
    }
    
}
