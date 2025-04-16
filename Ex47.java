/******************************************************************************

.47- Desenvolva um algoritmo que leia um conjunto de 20 valores inteiros,
guarde-os em um vetor e escreva-os em ordem inversa.
*******************************************************************************/
import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];

        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros na ordem inversa:");
        
        for (int i = 19; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

      
    }
}