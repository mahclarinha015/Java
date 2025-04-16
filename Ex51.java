/******************************************************************************

51-  Desenvolva um algoritmo que preencha aleatoriamente um vetor de 10 posicões com números entre 0 a 100. 
Calcule e escreva o maior, menor e a média desses números.
*******************************************************************************/
import java.util.Random;

public class Ex51 {
    public static void main(String[] args) {
        Random random = new Random();  
        int[] vetor = new int[10];  
        int soma = 0;
        int maior = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE; 

      
        for (int i = 0; i < 10; i++) {
            vetor[i] = random.nextInt(101);  
            soma += vetor[i];  

            
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        
        double media = soma / 10.0;

      
        System.out.println("Vetor gerado: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + media);
    }
}