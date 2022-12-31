/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculate.sum.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class CalculateSumRecursion {

    /**
     * @param args the command line arguments
     */
    public static int getMaximumValue(int[] a, int b){
    //last element in an array, return element
    if(b == 1)
        return a[0];
    return Math.max(getMaximumValue(a, b -1),a[b -1] ); }
     public static int sum(int[] a, int b,int g) {
     
      int result=0;
         if(g==b-1){
         return a[g];
         }
         result+=a[g];
         g++;
         return result + sum(a,b,g);
     }
      public static int maxmium(int [] a, int b, int g, int max) {
         
          if(g==b-1){
          return max;
          }
          if(a[g]>max){
          max=a[g];
          g++;
              System.out.println(g);
          }
          return maxmium(a,b,g,max);
      
      
      }
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int b=input.nextInt();
         int g=0;
         int max=0;
         int h=0;
        int []a=new int [b];
        for (int i = 0; i < b; i++) {
            a[i]=(int)(Math.random()*10);
            
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            
        }
        System.out.println("sum is : "+sum(a,b,g));
        System.out.println("max is : "+getMaximumValue(a,b));
        System.out.println("new max is : "+ maxmium(a,b,g,max));
    }
    
}
