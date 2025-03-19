package laco_condicional_switch;

import java.util.Scanner;

public class Exercicio6_SalarioReajustado {
    public static void main(String[] args) {
         Scanner lerScanner = new Scanner(System.in);

         int codigoColaborador;
         String nomeColaborador, cargo = "";
         float salario, novoSalario, reajuste = 0;
        
        System.out.println("#####   ####   ###   ##   #   #   ##   ###   #####   #####");
        System.out.println("--  Código  |     Cargo       |  Percentual do Reajuste --");
        System.out.println("--    1     |    Gerente      |           10%           --");
        System.out.println("--    2     |    Vendedor     |            7%           --");
        System.out.println("--    3     |   Supervisor    |            9%           --");
        System.out.println("--    4     |    Motorista    |            6%           --");
        System.out.println("--    5     |   Estoquista    |            5%           --");
        System.out.println("--    6     |  Técnico de TI  |            8%           --");
        System.out.println("#####   ####   ###   ##   #   #   ##   ###   #####   #####");

        System.out.println("--            Digite o nome do colaborador:              --");
        nomeColaborador = lerScanner.nextLine();

        System.out.println("--              Digite o código do cargo:               --");
        codigoColaborador = lerScanner.nextInt();

        System.out.println("--                 Digite o salário:                    --");
        salario = lerScanner.nextFloat();

        switch (codigoColaborador) {
            case 1:
                cargo = "Gerente";
                reajuste = 0.10f;
                break;
            
            case 2:
                cargo = "Vendedor";
                reajuste = 0.07f;
                break;
            
            case 3:
                cargo = "Supervisor";
                reajuste = 0.09f;
                break;
            
            case 4:
                cargo = "Motorista";
                reajuste = 0.10f;
                break;
        
            case 5:
                cargo = "Estoquista";
                reajuste = 0.05f;
                break;
            
            case 6:
                cargo = "Técnico TI";
                reajuste = 0.08f;
                break;

            default:
                System.out.println("Operação Inválida!");
                break;
        }

        novoSalario = salario + (reajuste * salario);

        System.out.println("\nNome do colaborador: " + nomeColaborador);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f", novoSalario);

        lerScanner.close();

    }
}
