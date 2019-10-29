package boletin6_3;
// @author irodriguezsteuerberg

public class Numero {

    private int num;

    public Numero() {
    }

    public Numero(int num) {
        this.num = num;
    }

    public void comparar(int num) {
        if (num > 0) 
            System.out.println("+");
         else if (num < 0) 
            System.out.println("-");
        else
            System.out.println("0");
    }
        
    }

