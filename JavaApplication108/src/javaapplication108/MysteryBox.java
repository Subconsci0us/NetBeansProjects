/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication108;


import java.util.*;


/**
 *
 * @author Shayan
 */
public class MysteryBox {
public static int mystery(int first, int last) {
if (first > last)
return 0;
else if (first == last)
return first;
else
return first + mystery(first + 1, last - 1);
}
public static void print(int n) {
if (n <= 0) return;
    System.out.print(n + " ");
print(n-2);
    System.out.print(n + " ");
}
public static void main(String[] args) {
    Integer[] arr = { 5, 2, 1, 8, 10 };
        Arrays.sort(arr, Collections.reverseOrder());
        
        

}
public static boolean check(String s1, String s2, int len, int count) {
    
    if(count==len){
    
    return true;
    }
    if(s1.equals("")){
    return false;
    }
    
    if(s2.charAt(0)!=s1.charAt(0)){
    return check(s1.substring(1),s2,len,count);
    }else{
        count+=1;
    return check(s1.substring(1),s2.substring(1),len,count);
    }
    



}
/*
public static int mystery2(int num) {
if (num < 10)
return num;
else
return num%10 + mystery2(num/10);
}
public static void mystery(int n) {
if (n > 100) {
System.out.print(n);
} else {
mystery(2 * n);
System.out.print(", " + n);
}
}
*/
}

