/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area.and.perimeter.of.a.circle;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class AreaAndPerimeterOfACircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
        System.out.println("Input 2 numbers");
        double a =input.nextDouble();
        double area = 3.142 * (a*a);
        double perimeter = 2* 3.142 * a;
        System.out.println(area);
        System.out.println(perimeter);
    }
    
}
