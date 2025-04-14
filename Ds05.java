/******************************************************************************

 05-Simulador de empréstimo com juros compostos
Peça ao usuário um valor de empréstimo e em quantas parcelas deseja pagar.
Calcule o valor final com juros compostos de 2% ao mês. Mostre o valor final e o valor de cada parcela.
Permita simular vários empréstimos.

*******************************************************************************/
import java.util.Scanner;

public class Ds05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxaJuros = 0.02; 
        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.print("Digite o valor do empréstimo: R$ ");
            double valorEmprestimo = scanner.nextDouble();

            System.out.print("Digite o número de parcelas: ");
            int parcelas = scanner.nextInt();

            
            double valorFinal = valorEmprestimo * Math.pow(1 + taxaJuros, parcelas);

            
            double valorParcela = valorFinal / parcelas;

            System.out.println("\n Detalhes do Empréstimo");
            System.out.printf("Valor do Empréstimo: "+ valorEmprestimo);
            System.out.printf("Número de Parcelas:"+ parcelas);
            System.out.printf("Valor Final (com juros de + ao mês): "+ valorFinal);
            System.out.printf("Valor de cada parcela: "+ valorParcela);

           
            System.out.print("\nDeseja simular outro empréstimo? (S/N): ");
            continuar = scanner.next().charAt(0);
        }

        System.out.println("\nObrigado por usar o simulador de empréstimo!");
        scanner.close();
    }
}