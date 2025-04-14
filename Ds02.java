/******************************************************************************

 02- Jogo de adivinhação com dificuldade
Crie um jogo de adivinhação onde o jogador escolhe a dificuldade 
(fácil: 1 a 10, médio: 1 a 50, difícil: 1 a 100). 
O programa gera um número aleatório(pesquisar) e o jogador tem 5 tentativas para acertar. 
A cada erro, o programa dá dicas: "maior" ou "menor".


*******************************************************************************/
import java.util.Random;
import java.util.Scanner;

public class Ds02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int limiteSuperior = 10;
        int numeroSecreto;
        int tentativa;
        int maxTentativas = 5;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Escolha a dificuldade:");
        System.out.println("1 - Fácil (1 a 10)");
        System.out.println("2 - Médio (1 a 50)");
        System.out.println("3 - Difícil (1 a 100)");
        System.out.print("Digite a opção: ");
        int dificuldade = scanner.nextInt();

        switch (dificuldade) {
            case 1:
                limiteSuperior = 10;
                break;
            case 2:
                limiteSuperior = 50;
                break;
            case 3:
                limiteSuperior = 100;
                break;
            default:
                System.out.println("Opção inválida! Usando dificuldade fácil por padrão.");
                limiteSuperior = 10;
        }

        numeroSecreto = random.nextInt(limiteSuperior) + 1; 

        System.out.println("Tente adivinhar o número entre 1 e " + limiteSuperior + ". Você tem " + maxTentativas + " tentativas.");

        boolean acertou = false;
        for (int i = 1; i <= maxTentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            tentativa = scanner.nextInt();

            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número.");
                acertou = true;
                break;
            } else if (tentativa < numeroSecreto) {
                System.out.println("O número secreto é MAIOR.");
            } else {
                System.out.println("O número secreto é MENOR.");
            }
        }

        if (!acertou) {
            System.out.println("Suas tentativas acabaram! O número secreto era: " + numeroSecreto);
        }

        scanner.close();
    }
}