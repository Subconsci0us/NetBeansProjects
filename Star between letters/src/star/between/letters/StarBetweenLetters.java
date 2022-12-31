/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package star.between.letters;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class StarBetweenLetters {

    /**
     * @param str
     * @param args the command line arguments
     * @return 
     */
    
    
    
     public static String allstar(String str) {  
       if(str.length()<=1){
       return str;
       }
       return (str.charAt(0)+"*")+ allstar(str.substring(1));

     }
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        String a= input.next();
        System.out.println(allstar(a));
    }
    
}
