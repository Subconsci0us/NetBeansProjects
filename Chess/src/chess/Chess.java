/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chess;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class Chess {


    /**
     * @param arry
     */
    
    public static void display(int arry[][]){
        for (int i = 0; i <8; i++) {
            for (int j = 0; j <8; j++) {
                System.out.print("|");
                System.out.print(arry[i][j]); 
            }
            System.out.print("|");
            System.out.println("");
        }
    }
    
    public static void pawn(int rownum,int colnum,int movetor, int movetoc, int [][]arry ){
        if(movetor-rownum<=-1){
        arry[movetor][movetoc]=arry[rownum][colnum];
        arry[rownum][colnum]=99;
        
        }
    
    
    
    
    
    }
    public static void bishop(){}
    public static void knight(){}
    public static void rook(){}
    public static void queen(){}
    public static void king(){}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean kingdefeated = false;
        int arry[][] = {{14, 13, 12, 15, 16, 12, 13, 14}, //hard coded value of suduko
        {11, 11, 11, 11, 11, 11, 11, 11},    //blacks 
        {99, 99, 99, 99, 99, 99, 99, 99},
        {99, 99, 99, 99, 99, 99, 99, 99},
        {99, 99, 99, 99, 99, 99, 99, 99},
        {99, 99, 99, 99, 99, 99, 99, 99},
        {21, 21, 21, 21, 21, 21, 21, 21},    //whites
        {24, 23, 22, 25, 26, 22, 23, 24}};
        display(arry);

        System.out.println("Black first(1) or White first(2)");
        int first = input.nextInt();
        while (kingdefeated == false) {
            if (first == 2) {
                System.out.println("which piece to move?");
                int status = input.nextInt();
                switch (status) {
                    case 21:
                        int rownum=input.nextInt();
                        int colnum=input.nextInt();
                        int movetor= input.nextInt();
                        int movetoc= input.nextInt();
                        pawn(rownum,colnum,movetor,movetoc,arry);
                        display(arry);
                        break;
                    case 22:
                        bishop();
                        break;
                    case 23:
                        knight();
                        break;
                    case 24:
                        rook();
                        break;
                    case 25:
                        queen();
                        break;
                    case 26:
                        king();
                        break;
                }
            }
            System.out.println("which piece to move?");
                int status = input.nextInt();
                switch (status) {
                    case 11:
                        pawn();
                        break;
                    case 12:
                        bishop();
                        break;
                    case 13:
                        knight();
                        break;
                    case 14:
                        rook();
                        break;
                    case 15:
                        queen();
                        break;
                    case 16:
                        king();
                        break;
                }
            
           
            }
        }
    }
}
