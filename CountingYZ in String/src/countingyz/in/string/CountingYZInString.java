/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countingyz.in.string;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class CountingYZInString {

    /**
     * @param str
     * @param args the command line arguments
     */
    public static int countYZ(String str) {
        int count=0;
        str=str.toLowerCase();
        String [] token = str.split(" ");
        for (int i = 0; i < token.length; i++) {
            if(token[i].charAt(token[i].length()-1)=='z'|| token[i].charAt(token[i].length()-1)=='y'){
            count+=1; 
            }
        }
        return count;
     
     
     
     }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input String");
        String str= input.nextLine();
        if(str.length()!=0){
        System.out.println(countYZ(str));}else{
            System.out.println("enter something");
        }
    }
    
}
