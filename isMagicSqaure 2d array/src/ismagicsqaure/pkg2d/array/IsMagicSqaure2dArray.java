/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ismagicsqaure.pkg2d.array;

/**
 *
 * @author Shayan
 */
public class IsMagicSqaure2dArray {

    /**
     * @param args the command line arguments
     */
    
     public static boolean checkrows(int [][] arr) {
         int sum=0;
    for (int i = 0; i < arr.length; i++) {
        sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum +=arr[i][j];
            }
            if (sum!= 15){
            return false;
            }
            
        }
    return true;
     }
      public static boolean checkcolumn(int [][] arr) {
         int sum=0;
    for (int i = 0; i < arr[0].length; i++) {
        sum=0;
            for (int j = 0; j < arr.length; j++) {
                sum +=arr[j][i];
            }
            if (sum!= 15){
            return false;
            }
            
        }
    return true;
     }
    
    public static void main(String[] args) {
        int [][]arr = {{2,7,6},{9,5,1},{4,3,8}};
        if(checkrows(arr)==true && checkcolumn(arr)==true){
            System.out.println("It is a magic sqaure");
        }else{
            System.out.println("not a magic square");
        }
    }
    
}
