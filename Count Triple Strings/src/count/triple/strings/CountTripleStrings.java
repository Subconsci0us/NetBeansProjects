/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package count.triple.strings;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class CountTripleStrings {

    /**
     * @param args the command line arguments
     */
    
public static int countTriple(String str) {

  int len = str.length();

  int count = 0;

   

  for (int i = 0; i < len-2; i++){

    

    if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2))

      count++;

  }

  return count;

}

    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       
       int count=0;
        System.out.println("Input String");
        String str= input.next();
         System.out.println(countTriple(str));
        for (int i = 0; i < str.length()-2; i++) {
            if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)){
                count++;       
                }
            
            }
            System.out.println(count);
           
        }
       
            
     
        
    
    
}
