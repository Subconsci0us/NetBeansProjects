/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package panagram.string;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class PanagramString {

    /**
     * @param args the command line arguments
     */
    //silent //listen
        public static boolean pana(String a, String b) {
        String [] a1= new String [a.length()];
        int count=0;
        String [] b1= new String [b.length()];
        if(a.length()!=b.length()){
        return false;
        }
            for (int i = 0; i < a1.length; i++) {
                a1[i]=String.valueOf(a.charAt(i));
            }
            for (int i = 0; i < b1.length; i++) {
                b1[i]=String.valueOf(b.charAt(i));
            }
            for (int i = 0; i < a1.length; i++) {
                for (int j = 0; j < b1.length; j++) {
                    if(a1[i].equals(b1[j])){
                    count+=1;
                    }
                }
            }
            if(count==a.length()){
            return true;
            }
            return false;
        
        
        }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a=input.next();
        String b=input.next();
        
        System.out.println(pana(a,b));
    }
    
}
