package laco_condicional_if;

import java.util.Scanner;

public class Exercicio2_ParImpar {
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);

        int n1;
        String parImpar, positivoNegativo;

        System.out.println("Digite um número:");
        n1 = lerValor.nextInt();

        if(n1 % 2 == 0){
            parImpar = "par";
        } else{
            parImpar = "ímpar";
        }

        if(n1 >= 0){
            positivoNegativo = "positivo";
        } else{
            positivoNegativo = "negativo";
        }       
        
        System.out.println("O Número " + n1 + " é " + parImpar + " e " + positivoNegativo + "!");

        lerValor.close();
    }
}
