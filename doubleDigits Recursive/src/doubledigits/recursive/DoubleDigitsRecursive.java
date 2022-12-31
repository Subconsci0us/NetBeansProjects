/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doubledigits.recursive;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class DoubleDigitsRecursive {

    /**
     * @param a
     * @return 
     */
    public static String check(String a){
        String result="";
        if(a==""){
        return result;
        }
        result=result+a.charAt(0)+a.charAt(0);
       
        
        return result +check((a.substring(1)));
        
    
    
    }
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int n = input.nextInt();
        String a= String.valueOf(n);
        System.out.println(check(a));
    }
    
}
