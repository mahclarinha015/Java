/******************************************************************************

49- Desenvolva um algoritmo que leia 2 vetores de 10 elementos inteiros
cada. Em seguida, calcule a soma desses vetores, guarde o resultado em um terceiro vetor e escreva o resultado.

*******************************************************************************/
import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] somaVetor = new int[10];

       
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do primeiro vetor: ");
            vetor1[i] = scanner.nextInt();
        }

       
        System.out.println("\nDigite os elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do segundo vetor: ");
            vetor2[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 10; i++) {
            somaVetor[i] = vetor1[i] + vetor2[i];
        }

      
        System.out.println("\nResultado da soma dos vetores:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Soma do elemento " + (i + 1) + ": " + somaVetor[i]);
        }

        scanner.close();
    }
}