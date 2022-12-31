/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication98;

/**
 *
 * @author Shayan
 */
public class JavaApplication98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[][] matrix = {{20, 30, 40}, {56, 78, 45}, {01, 02, 03}};  
            int mr=0;
            int mc=0;

            int min = 0, max = 0;  
            int [][]arr = new int[3][3];  
            System.out.print("The matrix is: \n");  
            int i,j;  

      for (i = 0; i < 3; i++){         
        for (j = 0; j < 3; j++){  
            System.out.print(matrix[i][j] + " " );  
                }  
            System.out.println();  
         }  

      //finding minimum in the row
        for (int k = 0; k < arr.length; k++) {
            min=arr[0][k];
            for (int p = 0; p < arr.length; p++) {
               if(arr[p][k]<=min){
               mr=p;
               mc=k;
               }
            } 
        }
        System.out.print(mr+",");
        System.out.println(mc);
        
      
      
      
    }
    
}
