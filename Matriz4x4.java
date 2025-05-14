/******************************************************************************

1) Desenvolver um programa que leia uma matriz 4 X 4
   a) Verificar o número de linhas e colunas
   b) Mostrar a matriz  formatada
*******************************************************************************/
import java.util.Scanner;

public class Matriz4x4 {

    public static void main(String[] args) {
        int linhas = 4;
        int colunas = 4;
        int[][] matriz = new int[linhas][colunas];

        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

       
        System.out.println("\nNúmero de linhas: " + matriz.length);
        System.out.println("Número de colunas: " + matriz[0].length);

       
        System.out.println("\nMatriz formatada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
