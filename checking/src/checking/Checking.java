/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checking;

/**
 *
 * @author Shayan
 */
public class Checking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
System.out.println(a == b);
    }
     public static void a1() {}
          public static void a1(String[] args) {}
 
public static int first(int x, int y) {
int z=0;
for (int i=0; i<y; i++) {
z += x;
}
return z;
}
public static int second(int x, int y) {
int z=1;
for (int i=0; i<y; i++) {
z = first( z, x);
}
return z;
}
    
}
