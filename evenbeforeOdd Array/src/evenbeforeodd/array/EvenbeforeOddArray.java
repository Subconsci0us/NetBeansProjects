/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenbeforeodd.array;

/**
 *
 * @author Shayan
 */
public class EvenbeforeOddArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []arr = {5,4,2,11,9,10,4,7,3};
        int [] arr2= new int [9];
        int g=0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
            arr2[g]=arr[i];
            g+=1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 !=0){
            arr2[g]=arr[i];
            g+=1;
            }
            
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+ " ");
            
        }
    }
    
}
