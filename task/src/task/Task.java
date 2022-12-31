/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task;

import java.util.*;

/**
 *
 * @author Shayan
 */
public class Task {

    /**
     * @param args the command line arguments
     */
    
    public static String convert(int n, int a, int b,int z) {
     String result="";
     
     if(z==n){
     return result;
     }else
     if(z%b==0 && z%a==0){
     result += "fizzbuzz";
     }else
     if(z%b==0){
     result += "buzz";
     }else
     if(z%a==0){
     result += "fizz";
     }else{
     result += z;}
     z++;
     return result +convert(n,a,b,z);
     
    }
    
    
    
    public static void main(String[] args) {
         Scanner input= new Scanner (System.in);
       
      
         System.out.println("Input till sequence and then input for the word to be fizz and then input for buzz");
        try{
              int z=1;
        int n= input.nextInt();// till sequence
        int a= input.nextInt();//word to be converted to fizz
        int b= input.nextInt();//word to be converted to buzz
        System.out.println(convert(n,a,b,z));  
        }catch(InputMismatchException e){
            System.out.println("Enter integer");
        }
         
    }
    
}
