/******************************************************************************

01- Sistema de votação com contagem por candidato
Simule uma eleição com 3 candidatos. Os votos são inseridos até que o usuário digite 0. O programa 
deve validar se o voto é válido (1, 2, 3)
e exibir ao final a quantidade de votos por candidato e o vencedor. Empates devem ser considerados.

*******************************************************************************/
import java.util.Scanner;

public class Ds01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voto;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0;

        System.out.println("Sistema de Votação - Digite 0 para encerrar");
        System.out.println("Candidatos:");
        System.out.println("1 - Candidato 1");
        System.out.println("2 - Candidato 2");
        System.out.println("3 - Candidato 3");

        while (true) {
            System.out.print("Digite o número do seu voto: ");
            voto = scanner.nextInt();

            if (voto == 0) {
                break;
            } else if (voto == 1) {
                candidato1++;
            } else if (voto == 2) {
                candidato2++;
            } else if (voto == 3) {
                candidato3++;
            } else {
                System.out.println("Voto inválido! Tente novamente.");
            }
        }

        
        System.out.println("\nResultado da eleição:");
        System.out.println("Candidato 1: " + candidato1 + " voto(s)");
        System.out.println("Candidato 2: " + candidato2 + " voto(s)");
        System.out.println("Candidato 3: " + candidato3 + " voto(s)");

       
        if (candidato1 > candidato2 && candidato1 > candidato3) {
            System.out.println("Vencedor: Candidato 1");
        } else if (candidato2 > candidato1 && candidato2 > candidato3) {
            System.out.println("Vencedor: Candidato 2");
        } else if (candidato3 > candidato1 && candidato3 > candidato2) {
            System.out.println("Vencedor: Candidato 3");
        } else {
            System.out.println("Empate entre os candidatos!");
        }

    }
}