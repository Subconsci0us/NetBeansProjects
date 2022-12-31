/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suduko;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class Suduko {
    /*** 
     * @param i 
     * @param j 
     * @param ninput* 
     * @param arry* 
     * @return */
    public static boolean newchecker (int ninput, int [][] arry, int i, int j){
    int rowstart= i-i%3;  //to calculte starting of row of 3x3 box
    int colstart = j-j%3; // to calculate starting of column of 3x3 box
        for (int k = rowstart; k < rowstart+3; k++) {
            for (int m = colstart; m < colstart+3; m++) {
                if(arry[k][m]==ninput){ //if duplicate found then return false
                return false;
                }            
            }   
        }
    return true;
    }
    public static boolean columnchecker(int ninput, int [][] arry, int i, int j) {
        boolean unequal=true;  
            for (int column = j; column < j+1; column++) { // column wise checking
                for (int row = 0; row < arry.length; row++) { //row wise checking
                   if(ninput==arry[row][column]){   // if input is equal to the content of array then return false
                 unequal=false;
                    }    
                }   
            }return unequal;
    } 
    public static boolean rowchecker(int ninput, int [][] arry, int i, int j) {
        boolean unequal=true; 
            for (int k = 0; k < 9; k++) {  
                if
                (ninput==arry[i][k]){   //to compare the content of array row wise with input number, if equals the number then return false
                    unequal=false;
                }
            }	
        return unequal;
    }
    public static void displayarray(int [][] arry){
                       for (int k = 0; k < arry.length; k++) {   //printing after single correct output
                          for (int m = 0; m < 9; m++) {  // printing of array after correct value is found
                              System.out.print(arry[k][m]);  
                              System.out.print(" ");
                            }
                          System.out.println();  
                         }  
    }
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int ninput;
       boolean perfectinput= false;
       int arry[][]= {{5,3,0,0,7,0,0,0,0}, //hard coded value of suduko
                      {6,0,0,1,9,5,0,0,0},
                      {0,9,8,0,0,0,0,6,0},
                      {8,0,0,0,6,0,0,0,3},
                      {4,0,0,8,0,3,0,0,1},
                      {7,0,0,0,2,0,0,0,6},
                      {0,6,0,0,0,0,0,0,0},
                      {0,0,0,4,1,9,0,0,5},
                      {0,0,0,0,8,0,0,7,9}};
       displayarray(arry);
               while(perfectinput==false){   // run the loop till correct input
                 for (int i = 0; i <arry.length; i++) {
                  for (int j = 0; j < arry[i].length; j++) {
                     if (arry[i][j]==0){ //finding zero
                  ninput = input.nextInt(); //new input
                  if((rowchecker(ninput,arry,i,j)==true) && ((columnchecker(ninput,arry,i,j))==true) && newchecker(ninput,arry,i,j)==true){ //checking the duplication using 3 methods
                     arry[i][j]=ninput;   // after passing checks, input to the array location where zero was found
                     perfectinput=true; //if perfectnumber is true then replace input with the zero.
                      displayarray(arry);       // displaying my arry
                      }else{
                      j--;  // if incorrect input then decrease the number of pointing rows
                       } 
                     }
                   }
                 }
               }
    }
}

