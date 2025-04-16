/******************************************************************************

Desenvolver um programa para ler a o nome e a idade de 5 pessoas guardar esses dados em array apresentar
nome e idade de pessoas maiores de idade

*******************************************************************************/
import java.util.Scanner;

public class Ds03 {
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