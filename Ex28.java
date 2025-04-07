/******************************************************************************

28- Faça um programa, utilizando while, que permita o usuário fazer contas de adição enquanto quiser.
*******************************************************************************/
import java.util.Scanner;
public class Ex28
{
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
        
        String resposta;
        
        do {
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
            int soma = numero1 + numero2;
    
            System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + soma);
            
            System.out.print("Você quer fazer outra adição? (sim/não): ");
            resposta = scanner.next();
            
        } while (resposta.equalsIgnoreCase("sim"));
        scanner.close();
        
        System.out.println("Programa encerrado. Até logo!");
        }
	}



	

