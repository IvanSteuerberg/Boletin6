package boletin6_5;
//@author irodriguezsteuerberg

import java.util.Scanner;

public class Boletin6_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce o numero1");
        int num1 = sc.nextInt();
        System.out.println("Introduce o numero2");
        int num2 = sc.nextInt();
        System.out.println("Introduce o numero3");
        int num3 = sc.nextInt();
        Numeros obx1=new Numeros();
        obx1.comparar(num1, num2, num3);
        
    }

}
