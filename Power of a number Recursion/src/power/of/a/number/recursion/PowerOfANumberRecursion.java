/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package power.of.a.number.recursion;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class PowerOfANumberRecursion {

    /**
     * @param n
     * @param p
     * @return 
     */
    public static int convert(int n, int p) {
    if(p==1){
    return n;
    }else{
    return n *convert(n, p-1);
    }
    
    
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
         int n = input.nextInt();   
         int p = input.nextInt();   
         System.out.println(convert(n,p));
     
    }
      
}
