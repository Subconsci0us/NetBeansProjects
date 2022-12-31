/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strcopies.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class StrCopiesRecursion {

    /**
     * @param str
     * @param sub
     * @param a
     * @param b
     * @param n
     * @param args the command line arguments
     * @return 
     */
   public static boolean strCopies(String a, String b, int n) {
    if(n == 0)
        return true;
    if(a.length() < b.length())
        return false;
    if(a.substring(0,b.length()).equals(b)){
    return strCopies(a.substring(1), b, n-1);}
    return strCopies(a.substring(1), b, n);
}
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         String a =input.next();
         String b = input.next();
         int n = input.nextInt();      
         System.out.println(strCopies(a,b,n));
    
    
    
    }
    
}
