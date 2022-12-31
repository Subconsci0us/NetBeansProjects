/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package withoutstring.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class WithoutStringRecursion {

    /**
     * @param a
     * @param b
     * @param args the command line arguments
     * @return 
     */
    public static String remove(String a, String b) {
         return a.toLowerCase().replaceAll(b.toLowerCase(),"");
       }
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         String a =input.nextLine();
         String b =input.next();
         System.out.println(remove(a,b));
    }
}
