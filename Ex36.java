/******************************************************************************

 36-  Desenvolver um programa com menu para simular uma conta corrente:    
     a) Depósito bancário
     b) Saque
     c) Saldo
     d) Sair
*******************************************************************************/
import java.util.Scanner;

public class Ex36{

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        double saldo = 0.0;  
        int opcao;  

        do {
            System.out.println("\nMenu de Conta Corrente:");
            System.out.println("1 - Depósito Bancário");
            System.out.println("2 - Saque");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                System.out.print("Digite o valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor de depósito inválido!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente para saque.");
                    } else {
                        System.out.println("Valor de saque inválido!");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;

                case 4:
                    System.out.println("Saindo... Obrigado por usar o sistema!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 4);  
        
        scanner.close();
    }
}