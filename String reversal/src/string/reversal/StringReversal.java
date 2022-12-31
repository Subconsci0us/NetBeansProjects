/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string.reversal;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class StringReversal {

    /**
     * 
     * @param s
     * @return 
     */
    
        public static String StringReversal(String s){
        if(s.length()==1)
            return s;
        return (StringReversal(s.substring(1))+s.charAt(0));
        
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
      String s = input.nextLine();
        System.out.println(StringReversal(s));
    }
    }
    

