/******************************************************************************

27- Faça um programa, utilizando while, que permita o usuário escrever o nome de cinco pessoas e os mostre na tela.

*******************************************************************************/
import java.util.Scanner;
public class Ex27
{
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        
        while (contador < 5) {
            System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
            String nome = scanner.nextLine();
            
            System.out.println("Nome inserido: " + nome);
            
            contador++;
        }
        
        scanner.close();
        }
	}



	

