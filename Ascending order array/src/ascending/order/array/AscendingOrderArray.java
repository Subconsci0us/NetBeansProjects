/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ascending.order.array;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class AscendingOrderArray {

    /**
     * @param mylist
     * @return 
     */
     public static boolean check(int[] mylist) {
         int count =0;
         for (int i = 0; i < mylist.length; i++) {
            if(mylist[i]<mylist[i+1]){
            count +=1;}
            if(count>=mylist.length-1){
            return true;
         }
         }
         
     
     
     return false;
     
     }
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       int [] mylist = new int [10];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i]=input.nextInt();
        }
        System.out.println(check(mylist));
    }
    
}
