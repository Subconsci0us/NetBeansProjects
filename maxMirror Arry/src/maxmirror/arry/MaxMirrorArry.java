/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxmirror.arry;

import java.util.*;

/**
 *
 * @author Shayan
 */
public class MaxMirrorArry {

    /**
     * @param args the command line arguments
     */
     public static String check(int [] arry) {
         String str= Arrays.toString(arry); 
         String value1="";
         String value2="";
         String str2=str.replaceAll(",","");
         for (int i = 0; i < str2.length(); i++) {
             for (int j = str2.length()-1; j > i; j--) {
                 if(str2.charAt(i)==str2.charAt(j)){
                 value1+=str2.charAt(i);
                         break;               
                 }               
             }            
         }
         value2=value1.replaceAll(" ", "");
         return value2;
     
     }
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        int [] arry = {1,2,3,8,9,3,2,1};
        System.out.println(check(arry));
    }
    
}
