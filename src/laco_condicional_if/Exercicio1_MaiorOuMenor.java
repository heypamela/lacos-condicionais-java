package laco_condicional_if;

import java.util.Scanner;

public class Exercicio1_MaiorOuMenor {
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);

        int n1, n2, n3, resultadoSoma;

        System.out.println("Digite um número:");
        n1 = lerValor.nextInt();

        System.out.println("Digite mais um número:");
        n2 = lerValor.nextInt();

        System.out.println("Digite outro número:");
        n3 = lerValor.nextInt();

        resultadoSoma = n1 + n2;

        if(resultadoSoma > n3){
            System.out.println("A Soma de A + B é Maior do que C");
        }

        if(resultadoSoma < n3){
            System.out.println("A Soma de A + B é Menor do que C");
        } 
        
        if(resultadoSoma == n3){
            System.out.println("A Soma de A + B é Igual a C");
        }
    }
}
