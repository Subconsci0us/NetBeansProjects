/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumnumbers.string;

import java.util.Scanner;

/**
 *
 * @author Shayan
 */
public class SumNumbersString {

    /**
     * @param args the command line arguments
     */
 public static int sumNumbers(String str) {
int sum = 0;
String str2 = str.replaceAll("[^0-9]+"," ");
String arr[] = str2.trim().split(" ");
for(int i = 0;i<arr.length;i++){
if(arr[i]!=null && !arr[i].isEmpty()){
sum += Integer.parseInt(arr[i]);
}
}
return sum;
}
 
public static int sumNumberss(String str) {
 int len = str.length();
  int sum = 0;
  String tmp = "";
  for (int i = 0; i < len; i++) {
    if (Character.isDigit(str.charAt(i))) {
      if (i < len-1 && Character.isDigit(str.charAt(i+1))) {
      tmp += str.charAt(i);
      }
      else {
        tmp += str.charAt(i);
        sum += Integer.parseInt(tmp);
        tmp = "";
      }
    }
  }
  return sum;

}

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input String");
        String str= input.next();
        
        System.out.println(sumNumberss(str));
    }
    
}
