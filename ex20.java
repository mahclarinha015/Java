/******************************************************************************

20.Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200. 
*******************************************************************************/
import java.util.Scanner;
public class ex20
{
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
		
	   int contagem1a100 = 0;
        int contagem101a200 = 0;
        int contagemAcima200 = 0;

        // Entrada de dados
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                contagem1a100++;
            } else if (numero >= 101 && numero <= 200) {
                contagem101a200++;
            } else if (numero > 200) {
                contagemAcima200++;
            }
        }

        // Saída de dados
        System.out.println("\nQuantidade de números entre 0 e 100: " + contagem1a100);
        System.out.println("Quantidade de números entre 101 e 200: " + contagem101a200);
        System.out.println("Quantidade de números maiores que 200: " + contagemAcima200);
	}
}
