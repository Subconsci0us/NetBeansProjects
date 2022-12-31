/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package replacing;

/**
 *
 * @author Shayan
 */
public class Replacing {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        String str = "Shayan";
      	String strd = "Hi 10, How 20 and 30 are doing!";
        String   str2 = strd.replaceAll("[0-3]", "");
        String   str5 = strd.replaceAll("[^0-9]+", " ");
        String   str6 = strd.replaceAll("[0-9]+", "");
        String str4 = str.replaceAll("[a-h]", "Java");
        System.out.println(str2);
        System.out.println(str5);
        System.out.println(str4);
        System.out.println(str6);
    }
    
}
