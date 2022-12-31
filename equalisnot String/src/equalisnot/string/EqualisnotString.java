/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equalisnot.string;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class EqualisnotString {

    /**
     * @param str
     * @return 
     */
    public static boolean equal(String str) {
        
        int countis=0;
        int countnot=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='i' && str.charAt(i+1)=='s' && i+1 <str.length()){
            countis +=1;
            }
            if(str.charAt(i)=='n' && str.charAt(i+1)=='o'&& str.charAt(i+2)=='t' && i+1 <str.length()){
            countnot +=1;
            }
            
        }
       
         if(countis==countnot){
         return true;
         }    
             return false;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input String");
        String str= input.nextLine();
        System.out.println(equal(str));
    }
    
}
