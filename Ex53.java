/******************************************************************************

53- .Faça um programa que leia 10 valores reais e os apresente na ordem:
       a) crescente
       b) decrescente
       c) inversa da entrada.
       * pesquisar para obter os valores em ordem crescente e decrescente.


*******************************************************************************/
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Double[] valores = new Double[10];

       
        System.out.println("Digite 10 valores reais:");
        for (int i = 0; i < 10; i++) {
            valores[i] = scanner.nextDouble();
        }

       
        Arrays.sort(valores);
        System.out.println("\nOrdem crescente:");
        for (double valor : valores) {
            System.out.print(valor + " ");
        }

        
        Arrays.sort(valores, Collections.reverseOrder());
        System.out.println("\n\nOrdem decrescente:");
        for (double valor : valores) {
            System.out.print(valor + " ");
        }

      
        System.out.println("\n\nOrdem inversa da entrada:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.print(valores[i] + " ");
        }

      
    }
}
