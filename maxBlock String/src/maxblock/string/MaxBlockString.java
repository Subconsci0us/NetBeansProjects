/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxblock.string;

import java.util.*;

/**
 *
 * @author Shayan
 */
public class MaxBlockString {

    /**
     * @param args the command line arguments
     */
     public static int check(String str) {
         int count=0;
         int max=1;
         if(str.length()==0){
         return 0;
         }
         for (int i = 0; i < str.length()-1; i++) {
             if(str.charAt(i)==str.charAt(i+1)){
                 for (int j = i; j < str.length(); j++) {
                     if(str.charAt(i)==str.charAt(j)){
                     count+=1;
                     if(max<count){
                     max=count;
                     }                     
                     }
                      
                 }
                
            
             }
              count=0;
         }
     return max;
     
     
     }
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Input String");
        try{
        String str= input.next();
       if(str.length()==0){
           System.out.println("0");
         }else{
        System.out.println(check(str));
       }  
        }catch (InputMismatchException e){
            System.out.println("Enter String");
        }
    }
    
}
