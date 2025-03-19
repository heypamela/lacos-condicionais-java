package laco_condicional_if;

import java.util.Scanner;

public class Exercicio3_DoadorDeSangue {
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);

        String nome;
        int idade;
        boolean primeiraDoacao, apto = false;

        System.out.println("Digite o nome do doador:");
        nome = lerValor.nextLine();

        System.out.println("Digite a idade do doador:");
        idade = lerValor.nextInt();

        System.out.println("Primeira doação de sangue?");
        primeiraDoacao = lerValor.nextBoolean();

        if(idade >= 18 && idade <=69){
            if (idade >= 60 && idade <= 69) {
                if(!primeiraDoacao){
                    apto = true;
                }
            } else {
                apto = true;
            }
        }

        if (apto) {
            System.out.println(nome + " está apto(a) para doar sangue!");
        } else {
            System.out.println(nome + " não está apto(a) para doar sangue!");
        }

        lerValor.close();
    }
}
