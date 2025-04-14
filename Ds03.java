/******************************************************************************

 03- Cadastro de notas com classificação
O programa deve permitir o cadastro de várias notas (entre 0 e 10). A cada nota inserida, o sistema deve classificar como:

Excelente (>= 9)
Bom (>= 7)
Regular (>= 5)
Insuficiente (< 5)
*Quando o usuário digitar -1, o programa termina e exibe a média geral e a contagem de cada classificação.

*******************************************************************************/
import java.util.Scanner;

public class Ds03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        double somaNotas = 0;
        int totalNotas = 0;

        int excelente = 0;
        int bom = 0;
        int regular = 0;
        int insuficiente = 0;

        System.out.println("Cadastro de Notas (Digite -1 para encerrar)");

        while (true) {
            System.out.print("Digite a nota (0 a 10): ");
            nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                continue;
            }

            somaNotas += nota;
            totalNotas++;

            if (nota >= 9) {
                System.out.println("Classificação: Excelente");
                excelente++;
            } else if (nota >= 7) {
                System.out.println("Classificação: Bom");
                bom++;
            } else if (nota >= 5) {
                System.out.println("Classificação: Regular");
                regular++;
            } else {
                System.out.println("Classificação: Insuficiente");
                insuficiente++;
            }
        }

        if (totalNotas > 0) {
            double media = somaNotas / totalNotas;

            System.out.println("\n Resultado Final");
            System.out.printf("Média geral: "+ media);
            System.out.println("Total de notas: " + totalNotas);
            System.out.println("Excelente: " + excelente);
            System.out.println("Bom: " + bom);
            System.out.println("Regular: " + regular);
            System.out.println("Insuficiente: " + insuficiente);
        } else {
            System.out.println("Nenhuma nota foi cadastrada.");
        }

        scanner.close();
    }
}