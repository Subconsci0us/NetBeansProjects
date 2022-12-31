/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package change.xto.y.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class ChangeXtoYRecursion {

    /**
     * @param str
     * @param a
     * @param args the command line arguments
     * @return 
     */
     public static String change(String str) {
         String result="";
        if(str==""){
        return str;
        }
        
        if(str.charAt(0)=='x'){
        result=result+'y';
        }else if(str.charAt(0)!='x'){
        result=result+ str.charAt(0);
        }
        return  result +change(str.substring(1));
        
        
     
     
     }
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
        String a= input.next();
        System.out.println(change(a));
    }
    
}
