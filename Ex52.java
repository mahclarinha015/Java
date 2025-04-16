/******************************************************************************

52-  Faça um programa que leia 5 idades de pessoas, armazeno-os em um Array, calcule e apresente a soma das idades. 
Verificar as idades e apresentar se a pessoal é " Melhor idade", " Adulto" ou "Criança".

*******************************************************************************/
import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] idades = new int[5];

       
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a idade de " + nomes[i] + ": ");
            idades[i] = scanner.nextInt();
            scanner.nextLine();
        }

        
        System.out.println("\nPessoas maiores de idade:");
        for (int i = 0; i < 5; i++) {
            if (idades[i] >= 18) {
                System.out.println(nomes[i] + " - " + idades[i] + " anos");
            }
        }

       
    }
}
