package boletin6_5;
// @author irodriguezsteuerberg
 
public class Numeros {
private int num1;
private int num2;
private int num3;

public Numeros(){    
}
public Numeros(int num1,int num2,int num3){
this.num1=num1;
this.num2=num2;
this.num3=num3;
}
public void comparar(int num1,int num2,int num3){
if (num1>num2){
if (num1>num3)
        System.out.println(num1+" é o maior");
else
        System.out.println(num3+" é o maior");
}
else{
if (num2>num3)
        System.out.println(num2+" é o maior");
else
        System.out.println(num3+" é o maior");
}


    
}


}
