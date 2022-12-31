/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sec.to.hr.min.sec;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SecToHrMinSec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sec= input.nextInt();
        int hr;
        int min;
        int finalsec;
        int tomin;
        hr = (int)sec/3600;
        tomin= sec%3600;
        min = tomin/60;
        finalsec= tomin%60;
        
        System.out.println(hr+ ":"+ min + ":" +finalsec);
        
    }
    
}
