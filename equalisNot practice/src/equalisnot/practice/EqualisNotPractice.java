/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equalisnot.practice;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class EqualisNotPractice {

    /**
     * @param args the command line arguments
     */
    public static boolean check(String a) {
        int countis=0;
        int countnot=0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='i'&& a.charAt(i+1)=='s'){
            countis+=1;
            }
            if(a.charAt(i)=='n'&& a.charAt(i+1)=='o' && a.charAt(i+2)=='t'){
            countnot+=1;
            }
            
     }
        if(countis==countnot){
            return true;
            }
        return false;
    }
        
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        
        System.out.println(check(a));
    }
    
}
