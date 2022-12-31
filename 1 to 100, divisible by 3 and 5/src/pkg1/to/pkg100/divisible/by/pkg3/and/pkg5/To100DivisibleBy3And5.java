/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.to.pkg100.divisible.by.pkg3.and.pkg5;

/**
 *
 * @author Shayan
 */
public class To100DivisibleBy3And5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for (int i = 1; i <= 100; i++) {
            if(i%3==0){
                System.out.println("divisible by 3 : "+i);}
            if(i%5==0){
            System.out.println("Divisible by 5 :"+i);
                    }
            if(i%3==0 && i%5==0){
                System.out.println("By both 5 and 3 :"+i);}
        }
    }
    
}
