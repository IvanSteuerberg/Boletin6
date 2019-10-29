package boletin6_6;
// @author irodriguezsteuerberg

public class Produtos {
private String nome;
private int vendas;

public Produtos(){    
}
public Produtos(String nome, int vendas){
this.nome=nome;
this.vendas=vendas;
}
public void comparar(){
if (vendas<=100)
    System.out.println("O tipo do produto é baixo");    
else if (vendas>100 && vendas<=500)
        System.out.println("O tipo do produto é medio");
else if (vendas>500 && vendas<=1000)
        System.out.println("O tipo do produto é alto");
else 
        System.out.println("O produto é de primeira necesidade");
}



}
