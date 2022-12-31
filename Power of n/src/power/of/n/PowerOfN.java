/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package power.of.n;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class PowerOfN {

    /**
     * @param n
     * @param n1
     * @return 
     */
    public static int power(int n, int n1) {
    int result=1;
    if (n1==1){
    return result*n;
    }
    result=result*n;
    return result * power(n, n1-1);
    
    
    }
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int n = input.nextInt();
        int n1= input.nextInt();
        System.out.println(power(n,n1));
    }
    
}
