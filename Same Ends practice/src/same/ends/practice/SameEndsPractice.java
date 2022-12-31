/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package same.ends.practice;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SameEndsPractice {

    /**
     * @param args the command line arguments
     */
    public static String sameEnds(String a) {
        String temp="";
        for (int i = 0; i < a.length()/2; i++) {
            for (int j = a.length()-1; j > a.length()/2; j--) {
              if(a.charAt(i)==a.charAt(j)){
              temp+=a.charAt(i);
              }              
            }    
        }
        return temp;
}

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        
        System.out.println(sameEnds(a));
    }
    
}
