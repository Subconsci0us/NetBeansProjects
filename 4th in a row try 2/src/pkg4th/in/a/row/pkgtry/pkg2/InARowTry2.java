/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4th.in.a.row.pkgtry.pkg2;
import java.util.Scanner;
/**
 *
 * @author Shayan
 */
public class InARowTry2 {
    
    public static void inputandprint(int columnnumber, int count, String[][]arry,String uinput) {
       arry[5-count][columnnumber]= uinput;
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
     * @param columnnumber
     * @param count
     * @param arry
     * @param userinput
     * @param uinput
     * @param args the command line arguments
     * @return 
     */
    public static boolean RowCheck(int columnnumber, int count, String[][]arry,String userinput){
        int newcount=0;
        for (int i = 0; i < arry[5-count].length; i++) {
            if(arry[5-count][i].equals(userinput) ){
            newcount++;
            if(newcount==4){
            return true;}
            }         
        }
        return false;
        
    }
    public static boolean ColumnCheck(int columnnumber, int count, String[][]arry,String userinput){
        int newcount=0;
        for (int i = 0; i <arry.length; i++) {
            if(arry[i][columnnumber].equals(userinput) ){
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
        int count0=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        for (int i = 0; i < arry.length; i++) { // storing empty spaces in the arry
            for (int j = 0; j < arry[i].length; j++) {
                arry[i][j]=" "; 
            }}
            System.out.println("input X or O and column number in which you want to input");
            userinput=input.nextLine(); 
        do{
            System.out.println("Enter column number");
            int columnnumber=input.nextInt();
            if(count0>=5 ||count1>=5 ||count2>=5 ||count3>=5 ||count4>=5 ||count5>=5 ||count6>=5){
            System.out.println("This column is full");
            continue;
            } 
            if(columnnumber==0 && count0<6){           
            count=count0;
            count0+=1;
            inputandprint(columnnumber,count0,arry,userinput);
            }else if(columnnumber==1 && count1<6){
             count=count1;
             count1+=1;
             inputandprint(columnnumber,count1,arry,userinput);
            }else if(columnnumber==2 && count1<6){           
             count=count2;
             count2+=1;
             inputandprint(columnnumber,count2,arry,userinput);
            }else if(columnnumber==3 && count1<6){     
             count=count3;
             count3+=1;
             inputandprint(columnnumber,count3,arry,userinput);
            }else if(columnnumber==4 && count1<6){  
             count=count4;
             count4+=1;
             inputandprint(columnnumber,count4,arry,userinput);
            }else if(columnnumber==5 && count1<6){
             count=count5;
             count5+=1;
             inputandprint(columnnumber,count5,arry,userinput);
            }else if(columnnumber==6 && count1<6){
             count=count6;
             count6+=1;
             inputandprint(columnnumber,count6,arry,userinput);
            }else{
                System.out.println("Column is full");
            }
            //check to finish the loop
            if(RowCheck(columnnumber,count,arry,userinput)==true || ColumnCheck(columnnumber,count,arry,userinput)==true){
            playerwon=true;
            break;
            }
        if(userinput.equals("X") || userinput.equals("x")){
        userinput="O";
        }else{
        userinput="X";
        }
        }while(playerwon=true);    
        System.out.println("u won");
    } 
}
