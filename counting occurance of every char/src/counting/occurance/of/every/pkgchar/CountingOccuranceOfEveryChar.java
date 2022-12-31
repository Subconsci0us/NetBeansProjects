/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package counting.occurance.of.every.pkgchar;

/**
 *
 * @author Shayan
 */
public class CountingOccuranceOfEveryChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str="qwe";
        int [] arr = new int [256];
        
        
        for (int i = 0; i < str.length(); i++) {
            arr[(char)(str.charAt(i))]++;            
        }
        for (int i = 97; i < 122; i++) {
           
            System.out.println((char)i +" is represented " +arr[i]+ " times");
            
        }
        System.out.println(str.length());
      
        
    }
    
}
