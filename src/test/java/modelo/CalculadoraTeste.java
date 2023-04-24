package modelo;

import br.com.alura.tdd.modelo.Caculadora;

public class CalculadoraTeste {

    public static void main(String[] args){

        Caculadora calc = new Caculadora();

        int soma = calc.somar(3,7);
        System.out.println(soma);

        soma = calc.somar(3,0);
        System.out.println(soma);

        soma = calc.somar(0,0);
        System.out.println(soma);

        soma = calc.somar(3,-1);
        System.out.println(soma);

        soma = calc.substrair(3,0);
        System.out.println(soma);

        soma = calc.substrair(0,0);
        System.out.println(soma);

        soma = calc.substrair(3,-1);
        System.out.println(soma);
    }
}
