/******************************************************************************

 35- Faça um programa que leia o nome e o valor de 10 produtos, calcule o valor total da compra e após escolha a forma de pagamento:
 
 1 - À Vista em Dinheiro ou Pix, recebe 8% de desconto.

 2 - À Vista no cartão de crédito, recebe 3% de desconto.

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros.

 4 - Parcelado no cartão em três vezes ou até 10 parcelas, preço normal do produto mais juros de 10%.
*******************************************************************************/
import java.util.Scanner;

public class Ex35{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalCompra = 0;
        int numeroProdutos = 10;
        int contador = 1;
        
        do {
            System.out.println("Digite o nome do produto " + contador + ": ");
            String nomeProduto = scanner.nextLine();
            
            System.out.println("Digite o valor do produto " + nomeProduto + ": ");
            double valorProduto = scanner.nextDouble();
            scanner.nextLine();  
            
            totalCompra += valorProduto;
            contador++;
        } while (contador <= numeroProdutos);
        
        System.out.println("\nTotal da compra: R$ " + totalCompra);
        
        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix (desconto de 8%)");
        System.out.println("2 - À Vista no Cartão de Crédito (desconto de 3%)");
        System.out.println("3 - Parcelado em 2x no Cartão de Crédito (sem juros)");
        System.out.println("4 - Parcelado em 3x ou mais no Cartão de Crédito (juros de 10%)");
        
        int formaPagamento = scanner.nextInt();
        
        double valorFinal = totalCompra;
        
        switch (formaPagamento) {
            case 1:
                valorFinal -= totalCompra * 0.08;
                System.out.println("Pagamento à vista (Dinheiro ou Pix) com 8% de desconto.");
                break;
            case 2:
                valorFinal -= totalCompra * 0.03;
                System.out.println("Pagamento à vista no cartão de crédito com 3% de desconto.");
                break;
            case 3:
                System.out.println("Pagamento parcelado em 2x no cartão, preço normal.");
                break;
            case 4:
                valorFinal += totalCompra * 0.10;
                System.out.println("Pagamento parcelado em 3x ou mais no cartão com 10% de juros.");
                break;
            default:
                System.out.println("Opção inválida.");
                return; 
        }
        
        System.out.println("Valor final a pagar: R$ " + valorFinal);
        
        scanner.close();
    }
}