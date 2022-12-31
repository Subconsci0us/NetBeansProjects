/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printing.american.flag;

/**
 *
 * @author Shayan
 */
public class PrintingAmericanFlag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=0;
        do{
        for (int i = 1; i <= 6; i++) {
            System.out.print("*");
            System.out.print(" ");
            
        }
        System.out.print("==================================");
        count +=1;
        System.out.println();
        for (int j = 1; j <=5; j++) {
            System.out.print(" ");
            System.out.print("*");
            
        }
        System.out.print("  ==================================");
            System.out.println();
        }while(count <4);
        for (int i = 1; i <= 6; i++) {
            System.out.print("*");
            System.out.print(" ");
            
        }
        System.out.print("==================================");
        System.out.println();
        for (int i = 1; i <=6; i++) {
            System.out.println("==============================================");
            
        }
    
    
    }
    
    
}
