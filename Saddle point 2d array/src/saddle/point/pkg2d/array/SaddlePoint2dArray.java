/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saddle.point.pkg2d.array;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SaddlePoint2dArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){  
       Scanner input= new Scanner (System.in);
       int [][]a = new int [3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length; j++) {
              a[i][j]=input.nextInt();              
            }          
        }
        
        for (int i = 0; i < a.length; i++) {
            int lrn=0;
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j]<a[i][lrn]){
                lrn=j;
                }
                
            }
            boolean flag=true;
            for (int k = 0; k < a.length; k++) {
               if(a[k][lrn]>a[i][lrn]){
              flag=false;
              break;
               }
                
            }
            if(flag==true){
                System.out.println(a[i][lrn]);
            }
            
        }
        
        
        
      
 
        } 
}  
