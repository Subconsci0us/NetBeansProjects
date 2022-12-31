/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrgghh.recursion;

/**
 *
 * @author Shayan
 */
public class ArrgghhRecursion {

    /**
     * @param args the command line arguments
     */
     public static String print(int n) {
         int count=0;
         String result="";
     if(count==n){
     return "h";
     
     }
     return "a"+ print(n-1);
     
     
     
     }
    public static void main(String[] args) {
        int n= 5;
        System.out.println(print(n));
    }
    
}
