package laco_condicional_switch;

import java.util.Scanner;

public class Exercicio5_ValorConta {
    public static void main(String[] args) {
        Scanner lerScanner = new Scanner(System.in);

        String produto = "";
        double preco = 0.0, valorTotal;
        int codigoProduto, quantidade;

        System.out.println("#####  ####  ###  ##  #  #  ##  ###  #####  #####");
        System.out.println("--  Código    |     Produto       |  Preço    --");
        System.out.println("--    1       |  Cachorro Quente  |  R$10.00  --");
        System.out.println("--    2       |     X-Salada      |  R$15.00  --");
        System.out.println("--    3       |     X-Bacon       |  R$18.00  --");
        System.out.println("--    4       |      Bauru        |  R$12.00  --");
        System.out.println("--    5       |    Refrigerante   |  R$8.00   --");
        System.out.println("--    6       |  Suco de Laranja  |  R$13.00  --");
        System.out.println("#####  ####  ###  ##  #  #  ##  ###  #####  #####");

        System.out.println("--        Digite o código do produto          --");
        codigoProduto = lerScanner.nextInt();

        switch (codigoProduto) {
            case 1:
                produto = "Cachorro-Quente";
                preco = 10.00;
                break;

            case 2:
                produto = "X-Salada";
                preco = 15.00;
                break;
            
            case 3:
                produto = "X-Bacon";
                preco = 18.00;
                break;

            case 4:
                produto = "Bauru";
                preco = 12.00;
                break;

            case 5:
                produto = "Refrigerante";
                preco = 8.00;
                break;

            case 6:
                produto = "Suco de laranja";
                preco = 13.00;
                break;
        
            default:
                System.out.println("Operação Inválida!");
                break;
        }

        System.out.println("--            Digite a quantidade:            --");
        quantidade = lerScanner.nextInt();

        valorTotal = quantidade * preco;

        System.out.println("Produto: " + produto);
        System.out.printf("Valor total: R$ %.2f", valorTotal);

        lerScanner.close();
    }
}
