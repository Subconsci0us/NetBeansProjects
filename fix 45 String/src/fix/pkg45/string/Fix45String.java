/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fix.pkg45.string;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class Fix45String {

    /**
     * @param args the command line arguments
     */
    
public static int [] fix(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {

      for (int j = 0; j < nums.length; j++) {
        if (nums[j] == 5) {
          if (j>0 && nums[j-1] != 4) {
            int tmp = nums[i+1];
            nums[i+1] = 5;
            nums[j] = tmp;
          }
          else if (j ==0) {
            int tmp = nums[i+1];
            nums[i+1] = 5;
            nums[j] = tmp;
          }
        }
      }
    }
  }
return nums;

}

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int [] arry ={5,3,2,3,4,7};
        fix(arry);
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]);
            
        }
        
    }
    
}
