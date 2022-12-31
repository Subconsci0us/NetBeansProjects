/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printing.alpha.numeric;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class PrintingAlphaNumeric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        String newinput = input.nextLine();
       
        String [] token = newinput.split(" ");
        
        for (int i = 0; i < token.length; i++) {
             boolean b1=false;
        boolean b2=false;
        
            
            for (int j = 0; j < token[i].length(); j++) {
              
                if((Character.isDigit(token[i].charAt(j)))==true) {
                    b1=true;}
               
                if((Character.isLetter(token[i].charAt(j)))==true) {
                    b2=true;
                }
                
            }
          
            if(b1==true && b2==true)
            {
            System.out.println(token[i]);
        
            
            }
        }
        
    }
    
}
