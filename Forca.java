/******************************************************************************

1) Desenvolver o jogo da Forca. Favor seguir algumas regras:
    a) Pedir para o jogador 1 digitar a palavra que será adivinhada pelo jogador 2
    b) Digitar o nome do jogador 2 para iniciar o jogo.
    c) A cada letra digitada mostrar a letra certa / errada e um desenho mostrando a perda de uma parte do corpo, se a letra estiver errada.
    d) O jogador 2 terá 5 tentativas de adivinhar a palavra correta.
    e) Se o jogo finalizar, mostrar o nome do jogador 2 e se ele ganhou ou perdeu.

*******************************************************************************/
import java.util.Scanner;

public class Forca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       
        System.out.print("Jogador 1, digite a palavra secreta: ");
        String palavraSecreta = scanner.nextLine().toLowerCase(); 
       
        
        System.out.print("Jogador 2, digite seu nome: ");
        String jogador2 = scanner.nextLine();
       
       
        int tentativas = 5;
        StringBuilder palavraAdivinhada = new StringBuilder("_".repeat(palavraSecreta.length()));
        boolean[] letrasTentadas = new boolean[26];
        boolean jogoAtivo = true;
       
     
         String[] forca = {
            " -----\n |   |\n     |\n     |\n     |\n     |\n     |\n---------",
            " -----\n |   |\n O   |\n     |\n     |\n     |\n     |\n---------",
            " -----\n |   |\n O   |\n |   |\n     |\n     |\n     |\n---------",
            " -----\n |   |\n O   |\n/|   |\n     |\n     |\n     |\n---------",
            " -----\n |   |\n O   |\n/|\\  |\n     |\n     |\n     |\n---------",
            " -----\n |   |\n O   |\n/|\\  |\n/    |\n     |\n     |\n---------",
            " -----\n |   |\n O   |\n/|\\  |\n/ \\  |\n     |\n     |\n---------",
        };

        
        while (jogoAtivo && tentativas > 0) {
            
            System.out.println("Palavra: " + palavraAdivinhada);
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println("Letras tentadas: ");
            for (char c = 'a'; c <= 'z'; c++) {
                if (letrasTentadas[c - 'a']) {
                    System.out.print(c + " ");
                }
            }
            System.out.println();
            System.out.println(forca[5 - tentativas]); 

            
            System.out.print(jogador2 + ", digite uma letra: ");
            char letra = scanner.nextLine().toLowerCase().charAt(0);

           
            if (letra < 'a' || letra > 'z') {
                System.out.println("Por favor, digite uma letra válida.");
                continue;
            }
           
            if (letrasTentadas[letra - 'a']) {
                System.out.println("Você já tentou essa letra.");
                continue;
            }

           
            letrasTentadas[letra - 'a'] = true;

            
            boolean letraCorreta = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    palavraAdivinhada.setCharAt(i, letra);
                    letraCorreta = true;
                }
            }

            
            if (!letraCorreta) {
                tentativas--;
                System.out.println("A letra '" + letra + "' não está na palavra.");
            } else {
                System.out.println("Boa! A letra '" + letra + "' está na palavra.");
            }

           
            if (palavraAdivinhada.toString().equals(palavraSecreta)) {
                System.out.println("Parabéns " + jogador2 + ", você adivinhou a palavra: " + palavraSecreta);
                jogoAtivo = false; 
            }
        }

   
        if (tentativas == 0) {
            System.out.println("Que pena " + jogador2 + ", você perdeu. A palavra era: " + palavraSecreta);
        }

      
    }
}

