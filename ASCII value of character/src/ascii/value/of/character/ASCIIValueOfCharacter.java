/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ascii.value.of.character;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class ASCIIValueOfCharacter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int b;
        char a = input.next().charAt(0);
        b = (int)(a);
        System.out.println(b);
        
    }
    
}
