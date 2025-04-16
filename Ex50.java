/******************************************************************************

50- Desenvolva um algoritmo que leia um vetor de 10 elementos com valores de uma compra no final mostre o valor gasto e o imposto.
a) Se a compra foi acima de R1.200,00 colocar imposto de 2.5% senão colocar imposto de 0.8%.
b) Mostrar os valores finais com e sem imposto.
*******************************************************************************/
import java.util.Scanner;

public class Ex50 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double[] compra = new double[10];
        double totalCompra = 0;

        
        System.out.println("Digite os valores dos 10 itens da compra:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor do item " + (i + 1) + ": ");
            compra[i] = scanner.nextDouble();
            totalCompra += compra[i]; 
        }

       
        double imposto = 0;
        if (totalCompra > 1200) {
            imposto = totalCompra * 0.025; 
        } else {
            imposto = totalCompra * 0.008; 
        }

        
        double totalComImposto = totalCompra + imposto;

       
        System.out.println("\nTotal da compra sem imposto: R$ " + totalCompra);
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Total com imposto: R$ " + totalComImposto);

        
    }
}