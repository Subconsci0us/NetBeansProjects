/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countyz.practice;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class CountYZPractice {

    /**
     * @param args the command line arguments
     */
    public static int count(String a) {
        int count=0;
     String [] token = a.split(" ");
        for (int i = 0; i < token.length; i++) {
            if(token[i].charAt(token[i].length()-1)=='z' || token[i].charAt(token[i].length()-1)=='y')
            {
            count+=1;
            }
        }
    return count;
    
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        System.out.println(count(a));
    }
    
}
