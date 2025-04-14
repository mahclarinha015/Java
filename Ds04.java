/******************************************************************************

 04- Caixa eletrônico com cédulas disponíveis
Simule um caixa eletrônico. O usuário informa o valor do saque, e o programa informa quantas cédulas de R$100, R$50, R$20, R$10 e R$5 serão entregues, com base nas cédulas disponíveis. Caso não seja possível realizar o saque com as cédulas, exiba uma mensagem de erro.

*******************************************************************************/
import java.util.Scanner;

public class Ds04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int notas100 = 5;
        int notas50 = 5;
        int notas20 = 5;
        int notas10 = 5;
        int notas5 = 5;

        System.out.print("Digite o valor do saque: R$ ");
        int valor = scanner.nextInt();

       
        if (valor <= 0 || valor % 5 != 0) {
            System.out.println("Valor inválido. Só é possível sacar múltiplos de R$5.");
            return;
        }

      
        int valorOriginal = valor;

        
        int usar100 = Math.min(valor / 100, notas100);
        valor -= usar100 * 100;

        int usar50 = Math.min(valor / 50, notas50);
        valor -= usar50 * 50;

        int usar20 = Math.min(valor / 20, notas20);
        valor -= usar20 * 20;

        int usar10 = Math.min(valor / 10, notas10);
        valor -= usar10 * 10;

        int usar5 = Math.min(valor / 5, notas5);
        valor -= usar5 * 5;

        
        if (valor == 0) {
            System.out.println("\nSaque de R$" + valorOriginal + " realizado com sucesso:");
            if (usar100 > 0) System.out.println("R$100: " + usar100 + " cédula(s)");
            if (usar50 > 0)  System.out.println("R$50: " + usar50 + " cédula(s)");
            if (usar20 > 0)  System.out.println("R$20: " + usar20 + " cédula(s)");
            if (usar10 > 0)  System.out.println("R$10: " + usar10 + " cédula(s)");
            if (usar5 > 0)   System.out.println("R$5: " + usar5 + " cédula(s)");
        } else {
            System.out.println("Não foi possível realizar o saque com as cédulas disponíveis.");
        }

        scanner.close();
    }
}