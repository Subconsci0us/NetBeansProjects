/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number.of.zeros.recursion;

/**
 *
 * @author Shayan
 */
public class NumberOfZerosRecursion {

    /**
     * @param args the command line arguments
     */
     public static int counting(int a) {
    int count=0;
    if(a==0){
    return count;
    }
    if(a%10==0){
    count+=1;
    }
    return count+counting(a/10);
    
    
    }
    public static void main(String[] args) {
        int a=2030;
        System.out.println(counting(a));
    }
    
}
