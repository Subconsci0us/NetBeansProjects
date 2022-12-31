/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitalizing.first.every.letter.in.a.sentence;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class CapitalizingFirstEveryLetterInASentence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message = "everyone loves java";

    // stores each characters to a char array
    char[] charArray = message.toCharArray();
    boolean foundSpace = true;

    for(int i = 0; i < charArray.length; i++) {

      // if the array element is a letter
      if(Character.isLetter(charArray[i])) {

        // check space is present before the letter
        if(foundSpace) {

          // change the letter into uppercase
          charArray[i] = Character.toUpperCase(charArray[i]);
          foundSpace = false;
        }
      }

      else {
        // if the new character is not character
        foundSpace = true;
      }
    }

    // convert the char array to the string
    message = String.valueOf(charArray);
    System.out.println("Message: " + message);
        
    }
    
}
