/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial.recursions;

/**
 *
 * @author Shayan
 */
public class FactorialRecursions {

    /**
     * @param args the command line arguments
     */
    public static int Factorial(int a) {
    if(a==1){
    return a;
    }
    return a*Factorial(a-1);
    
    
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(Factorial(a));
        
    }
    
}
