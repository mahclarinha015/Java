/******************************************************************************

54- ..Faça um programa para ler N valores inteiros e armazená-los em um Array. O
programa deve contar quantos valores pares ele possui e multiplicar os valores ímpares.


*******************************************************************************/
import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a quantidade de valores inteiros (N): ");
        int N = scanner.nextInt();

        int[] numeros = new int[N];
        int contadorPares = 0;
        int produtoImpares = 1;
        boolean temImpar = false;

        
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else {
                produtoImpares *= numeros[i];
                temImpar = true;
            }
        }

      
        System.out.println("\nQuantidade de valores pares: " + contadorPares);

        if (temImpar) {
            System.out.println("Multiplicação dos valores ímpares: " + produtoImpares);
        } else {
            System.out.println("Não há valores ímpares para multiplicar.");
        }

       
    }
}