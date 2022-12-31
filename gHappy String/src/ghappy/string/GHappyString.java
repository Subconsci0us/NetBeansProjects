/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ghappy.string;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class GHappyString {

    /**
     * @param str
     * @param args the command line arguments
     * @return 
     */
    
         public static boolean gHappy(String str) {
        int len = str.length();

            boolean happy = true;

 

            for (int i = 0; i < len; i++) {

                if (str.charAt(i) == 'g') {

                    if (i > 0 && str.charAt(i-1) == 'g')

                        happy = true;

                    else if (i < len-1 && str.charAt(i+1) == 'g')

                         happy = true;

                    else

                         happy = false;

                 }

            }

                return happy;

}



     
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input String");
        String str= input.nextLine();
        System.out.println(gHappy(str));
        
    }
    
}