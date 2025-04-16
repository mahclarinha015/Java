/******************************************************************************

48- Desenvolva um algoritmo que leia um conjunto de 10 valores reais, guarde-os
em um vetor, calcule a soma dos valores armazenados em posicões ímpares
e escreva o resultado.

*******************************************************************************/
import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[10];
        double soma = 0;

       
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor real: ");
            valores[i] = scanner.nextDouble();
        }

      
        for (int i = 1; i < 10; i += 2) {  
            soma += valores[i];
        }

      
        System.out.println("\nA soma dos valores nas posições ímpares é: " + soma);

      
    }
}