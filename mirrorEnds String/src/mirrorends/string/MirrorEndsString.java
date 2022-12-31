/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mirrorends.string;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class MirrorEndsString {

    /**
     * @param args the command line arguments
     */
    public static String check(String str) {
        String result="";
        if(str.length()==3){
        return str;
        }
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)==str.charAt(str.length()-1-i))
                result=result+str.charAt(i);
        }
        return result;
    
    
    }
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Input String");
        String str= input.next();
        System.out.println(check(str));
    }
    
}
