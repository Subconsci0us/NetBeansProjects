/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication53;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class JavaApplication53 {

    /**
     * @param n
     */
    public static void mystery1(int n) {
    if (n <= 1) {
        System.out.print(n);
    } else {
        mystery1(n / 2);
        System.out.print(", " + n);
    }
}
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        mystery1(n);
    }
    
}
