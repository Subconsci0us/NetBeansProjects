/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package table.to.pkg10;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class TableTo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input= new Scanner (System.in);
        System.out.println("Input 2 numbers");
        int a =input.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(a*i);
            
        }
    }
    
}
