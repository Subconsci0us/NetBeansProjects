/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fix34.array;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class Fix34Array {

    /**
     * @param arry
     * @param args the command line arguments
     */
    
      public static void fix(int[] arry) {
         
          for (int i = 0; i < arry.length; i++) {
              if(arry[i]==3)
         
             for (int j = i; j < arry.length; j++) {
                 if (arry[j] == 4 && arry[j-1]!=3) {
                int tmp = arry[i+1];
                arry[i+1] = 4;
                arry[j] = tmp;
       
             }
          }
        }
      }
          
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] arry ={1,3,4,3,5,4};
        fix(arry);
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]);
            
        }
        
    }
    
}
