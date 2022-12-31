/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reversing.a.string;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class ReversingAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int letters=0;
        int numbers=0;
        int spaces=0;
        int other=0;
        String name = input.nextLine();
        char [] ch = name.toCharArray();
        for(int i = 0; i < name.length(); i++){
			if(Character.isLetter(ch[i])){
				letters++ ;
			}
			else if(Character.isDigit(ch[i])){
				numbers ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				spaces ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("letter: " + letters);
		System.out.println("space: " + spaces);
		System.out.println("number: " + numbers);
		System.out.println("other: " + other);
			}
        
        
        
    }
    

