package boletin6_4;
// @author irodriguezsteuerberg

public class Boletin6_4 {

    public static void main(String[] args) {
Persona persona1=new Persona("Ana",80.5f);
Persona persona2=new Persona("Pedro",100f);
float peso1=persona1.getPeso();
float peso2=persona2.getPeso();
if (peso1>peso2){
System.out.println(persona1.getNome()+" pesa más");
System.out.println("A diferencia de peso é de: "+(peso1-peso2)+" kg");
}
else{
System.out.println(persona2.getNome()+" pesa más");
System.out.println("A diferencia de peso é de: "+(peso2-peso1)+" kg");    
} 

}    

}
