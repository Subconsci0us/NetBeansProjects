/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.in.a.row;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class InARow {
   
     
    public static boolean Rowchecker(int columnnumber, int count, String [][] arry, String XorO ) {   
        for (int i = 1; i < 4; i++) {
            if(arry[count][columnnumber+i] != XorO){
            return false;
            }     
        }
        for (int i = 1; i>-1 ; i--) {
            if(arry[count][columnnumber+i] != XorO){
            return false;
            }     
        }
    return true;
    }
    public static boolean Columnchecker(int columnnumber, int count, String [][] arry, String XorO) {
        //columnnumber,count,arry,XorO
        for (int i = 1; i <=4; i++) {
            if(arry[count+i][columnnumber] != XorO){
            return false;
            }
        }
        for (int i = 1; i >=4; i--) {
            if(arry[count-i][columnnumber] != XorO){
            return false;
            }
        }
     return true;
    }
   /* public static boolean DiagionalChecker(int columnnumber, int count, String[][]arry) {
      int wrongboxUp=0;
      int wrongboxdown=0;
      if(wrongboxUp<1){
          for (int i = 1; i <=3; i++) {
              for (int j = 1; j <=3; j++) {
                  if(arry[count][columnnumber]!= arry[count-i][columnnumber+i]){
                  return false;
                  }         
              }  
          }
      }
      if(wrongboxdown<1){
          for (int i = 0; i <=3; i++) {
              for (int j = 0; j <=3; j++) {
                  if(arry[count][columnnumber]!= arry[count+i][columnnumber-i]){
                  return false;
                  }         
              }  
          }
      }
      return true;
    }
     */
    public static void input(int columnnumber, int count, String[][]arry,String XorO) {
       arry[5-count][columnnumber]= XorO;
        for (int i = 0; i<5; i++) {
            for (int j = 0; j <7 ; j++) {
                System.out.print("|");
                System.out.print(arry[i][j]);
    
            }
            System.out.print("|");
            System.out.println();
            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        String [][] arry= new String [6][7];
        
        int count=0;
        int count0=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        boolean playerwon=false;
         // storing empty spaces in the arry
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                arry[i][j]=" "; 
            }   
        }
        
        
        String XorO="";
        do{
           System.out.println("Enter X or O in your desired column");
            //input of the player
            XorO = input.nextLine();
           int columnnumber = input.nextInt(); // in which column the player wants his input in.
           // this is done to check whether the column in empty and if it is,,, then input the value in column
           if(columnnumber==0 && count0<=5){
               count=count0;
               count0 +=1;
               input(columnnumber,count0,arry,XorO);
               
           }else if(columnnumber==1 && count1<=5){
               count=count1;
               count1 +=1;
               input(columnnumber,count1,arry,XorO);
                
           }else if(columnnumber==2 && count2<=5){
               count=count2;
               count2 +=1;
               input(columnnumber,count2,arry,XorO);
                
           }else if(columnnumber==3 && count3<=5){
               count=count3;
               count3 +=1;
               input(columnnumber,count3,arry,XorO);
                 
           }else if(columnnumber==4 && count4<=5){
                count=count4;
               count4 +=1;
               input(columnnumber,count4,arry,XorO);
                
           }else if(columnnumber==5 && count5<=5){
               count=count5;
               count5 +=1;
               input(columnnumber,count5,arry,XorO);
                
           }else if(columnnumber==6 && count6<=5){
                  count=count6;
               count6 +=1;
               input(columnnumber,count6,arry,XorO);
             
           }
            //this is done to check the condition of 4 in a row    
           if(Rowchecker(columnnumber,count,arry,XorO)==true || Columnchecker(columnnumber,count,arry,XorO)==true){
               System.out.println("Player won");    
               playerwon=true;
           }
           XorO = input.nextLine();
           count=0;
           XorO="";
         
//condition to keep running the game until either all counts fill up to maximum or player wins
       }while(count0<=6 && count1<=6 && count2<=6 && count3<=6 && count4<=6 && count5<=6 ||playerwon==true);
      
    }
    
   
}
