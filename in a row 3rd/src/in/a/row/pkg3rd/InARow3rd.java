/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package in.a.row.pkg3rd;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class InARow3rd {
    public static void inputandprint(int columnnumber, int count, String[][]arry,String userinput) {
       arry[5-count][columnnumber]= userinput; //inputting the value in the array
        for (int i = 0; i<5; i++) { // this loop is used to display the array
            for (int j = 0; j <7 ; j++) {
                System.out.print("|");
                System.out.print(arry[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
    }
    /**
     * @param columnnumber
     * @param count
     * @param arry
     * @param userinput
     * @return 
     */
    public static boolean DiagionalChecker(int columnnumber, int count, String[][]arry, String userinput) {
      int newcountr=0;
      int newcountc=0;
        for (int i = 0; i < arry.length; i++) {// checking diagionally rightly
            for (int j = 0; j < arry[0].length; j++) {
                if(arry[i][j].equals(userinput) && (arry[i-1][j+1]).equals(userinput)){
                newcountr++;
            if(newcountr==4){
            return true;}
             }         
            }
        }
        for (int i = 0; i < arry.length; i++) { //checking diagionally leftly
            for (int j = 0; j < arry[0].length; j++) {
                if(arry[i][j].equals(userinput) && (arry[i+1][j+1]).equals(userinput)){
                newcountc++;
            if(newcountc==4){
            return true;}
             }         
            }
        }
        return false;
    }

    public static boolean RowCheck(int columnnumber, int count, String[][]arry,String userinput){
        int newcount=0;
        for (int i = 0; i < 6; i++) { //for checking 4 elements
            if(arry[4-count][i].equals(userinput) && arry[4-count][i+1].equals(userinput) ){  // this if statement is used to check if the current letter is equal to the next letter than increment count
            newcount++;
            if(newcount==3){
            return true;}
            }         
        }
        return false;      
    }

    public static boolean ColumnCheck(int columnnumber, int count, String[][]arry,String userinput){
        int newcount=0;
        for (int i = 0; i <arry.length; i++) {
            if(arry[i][columnnumber].equals(userinput) && arry[i+1][columnnumber].equals(userinput)){ // this if statement is used to check if the current letter is equal to the next upper letter than increment count
            newcount++;
            if(newcount==4){
            return true;}
            }
        }
       return false;  
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String [][] arry= new String [6][7];
        boolean playerwon=false;
        String userinput="";
        int count=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        int count7=0;
        for (int i = 0; i < arry.length; i++) { // storing empty spaces in the arry
            for (int j = 0; j < arry[i].length; j++) {
                arry[i][j]=" "; 
            }}
        for (int i = 0; i < 1000; i++) {
            System.out.println("input X or O");  //forcing user to input X or O
            userinput=input.nextLine();
            if(userinput.equals("X") || userinput.equals("O")){
            break;
            }
        }
        try{
        do{
            System.out.println("Enter column number");           
            int columnnumber=input.nextInt();
            if(columnnumber==0 && count1<6){           
            count=count1;
            count1+=1;
            inputandprint(columnnumber,count1,arry,userinput);
            }else if(columnnumber==1 && count2<6){
             count=count2;
             count2+=1;
             inputandprint(columnnumber,count2,arry,userinput);
            }else if(columnnumber==2 && count3<6){           
             count=count3;
             count3+=1;
             inputandprint(columnnumber,count3,arry,userinput);
            }else if(columnnumber==3 && count4<6){     
             count=count4;
             count4+=1;
             inputandprint(columnnumber,count4,arry,userinput);
            }else if(columnnumber==4 && count5<6){  
             count=count5;
             count5+=1;
             inputandprint(columnnumber,count5,arry,userinput);
            }else if(columnnumber==5 && count6<6){
             count=count6;
             count6+=1;
             inputandprint(columnnumber,count6,arry,userinput);
            }else if(columnnumber==6 && count7<6){
             count=count7;
             count7+=1;
             inputandprint(columnnumber,count7,arry,userinput);
            }else{
                System.out.println("Column is full");
            }
            //check to finish the loop
            if(RowCheck(columnnumber,count,arry,userinput)==true || ColumnCheck(columnnumber,count,arry,userinput)==true || DiagionalChecker(columnnumber,count,arry,userinput)){
            playerwon=true;
            break;
            }
        if(userinput.equals("X") || userinput.equals("x")){
        userinput="O";
        }else{
        userinput="X";
        }}while(playerwon=true);  
        }
        catch(InputMismatchException e1){
            System.out.println("Error in input");               
        }
        if(playerwon==true){
        System.out.println("u won");}
    }
} 
    
  

             
   
  