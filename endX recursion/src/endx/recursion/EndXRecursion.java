/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package endx.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class EndXRecursion {

    /**
     * @param a
     * @param args the command line arguments
     * @return 
     */
     public static String remove(String a) {
         String str="";
         if(a==""){
         return str;
         }
         if(a.charAt(0)=='x'){
         str= str+a.charAt(0);
         return remove(a.substring(1))+str;
         }
         str=str+ String.valueOf(a.charAt(0));
         return str+ remove(a.substring(1)); 
         
     
       }
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         String a =input.next();
         System.out.println(remove(a));
    }
    
}
