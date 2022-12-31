/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method.middle.character.of.a.string;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class MethodMiddleCharacterOfAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int b=0;
        String a=input.next();
        b=(int)(check(a));
        
    }
    public static double check(String a) {
        double middle=0;
        if(a.length()%2!=0){
         middle=Math.ceil(a.length()/2);
        
        }else if(a.length()%2 ==0){
            middle=Math.floor(a.length()/2);
    
    }
        return middle;
        
        
    }
}
