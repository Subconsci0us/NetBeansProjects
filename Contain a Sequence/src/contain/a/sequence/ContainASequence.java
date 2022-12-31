/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contain.a.sequence;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class ContainASequence {

    /**
     * @param mylist
     * @param mylist2
     * @return 
     */
    public static boolean check(int[] mylist, int[]mylist2) {
        int count=0;
        for (int i = 0; i < mylist2.length; i++) {
            for (int j = 0; j < mylist.length; j++) {
                if(mylist2[i]==mylist[j]){
                    for (int k = 1; k < mylist2.length; k++) {
                        if(mylist[j+k]==mylist2[i+k]){
                        count +=1;
                        if(count>=mylist2.length-1)
                        return true;
                        }
                        
                    }
                
                }
                
            }
            
        }
    
    return false;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
       int [] mylist = new int [10];
       int [] mylist2 = new int [3];
       
        for (int i = 0; i < mylist.length; i++) {
            mylist[i]=input.nextInt();
        }
        System.out.println("enter elements for list 2");
         for (int i = 0; i < mylist2.length; i++) {
           mylist2[i]=input.nextInt();
        }
        System.out.println(check(mylist,mylist2));
        
        
        
        
    }
    
}
