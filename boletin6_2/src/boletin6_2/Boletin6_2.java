
package boletin6_2;
// @author irodriguezsteuerberg

import java.util.Scanner;

 
public class Boletin6_2 {

   
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Numero obx1=new Numero();
    System.out.println("Introduce un numero");
    short num1=sc.nextShort();
    System.out.println("Introduce otro numero");
    short num2=sc.nextShort();
    obx1.comparar(num1, num2);
    System.out.println(" A suma é: "+(num1+num2));



    
 }
    
}
