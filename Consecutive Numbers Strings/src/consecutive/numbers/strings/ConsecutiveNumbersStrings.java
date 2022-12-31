/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consecutive.numbers.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class ConsecutiveNumbersStrings {

    /**
     * @param args the command line arguments
     */
      public static boolean print(int []a) {
          int i=0;
          int count=0;
          Arrays.sort(a);

          while(i+1 != a.length-1){
           if(a[i]-a[i+1] ==-1){
            count+=1;
           
           }
          
          i++;
          }
          if(count==i){
          return true;
          }
      return false;
      
      
      }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] a =new int [5];
        for (int i = 0; i < 5; i++) {
            a[i]=input.nextInt();
        }
        System.out.println(print(a));
        
        
        
    }
    
}
