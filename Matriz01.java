/******************************************************************************

1. Crie um programa que leia uma matriz 5x5. Em seguida, conte quantos números pares
existem na matriz.

*******************************************************************************/

import java.util.Scanner;

public class Matriz01 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int contadorPares = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Verifica se é par
                if (matriz[i][j] % 2 == 0) {
                    contadorPares++;
                }
            }
        }
           System.out.println("Quantidade de números pares na matriz: " + contadorPares);
    }
}
