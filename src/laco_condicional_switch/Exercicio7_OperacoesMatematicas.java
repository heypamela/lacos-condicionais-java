package laco_condicional_switch;

import java.util.Scanner;

public class Exercicio7_OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner lerScanner = new Scanner(System.in);
        
        int codigoOperacao;
        float numero1, numero2, resultado; 

        System.out.println("####  ###  ##  #  ##  ###  #####");
        System.out.println("--  Código  |    Operação     --");
        System.out.println("--    1     |      Soma       --");
        System.out.println("--    2     |    Subtração    --");
        System.out.println("--    3     |  Multiplicação  --");
        System.out.println("--    4     |     Divisão     --");
        System.out.println("####  ###  ##  #  ##  ###  #####");

        System.out.println("--     Digite um número       --");
        numero1 = lerScanner.nextInt();

        System.out.println("--    Digite mais número      --");
        numero2 = lerScanner.nextInt();

        System.out.println("-Escolha uma operação matemática-");
        codigoOperacao = lerScanner.nextInt();

        switch (codigoOperacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("\n" + numero1 + " + " + numero2 + " = " + resultado);
                break;
            
            case 2:
                resultado = numero1 - numero2;
                System.out.println("\n" + numero1 + " - " + numero2 + " = " + resultado);
                break;
        
            case 3:
                resultado = numero1 * numero2;
                System.out.println("\n" + numero1 + " * " + numero2 + " = " + resultado);
                break;
            
            case 4:
                resultado = numero1 / numero2;    
                System.out.println("\n" + numero1 + " / " + numero2 + " = " + resultado);
                break;

            default:
                System.out.println("Operação Inválida!");
                break;
        }

        lerScanner.close();
    }
}
