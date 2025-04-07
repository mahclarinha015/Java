/******************************************************************************

32-   Faça um programa que leia 5 números e informe o maior número.
*******************************************************************************/
import java.util.Scanner;
public class Exercicio32
{
	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        int contador = 1; 
        int maiorNumero = Integer.MIN_VALUE; 

        while (contador <= 5) {
            System.out.print("Digite o " + contador + "º número: ");
            int numero = scanner.nextInt();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }

            contador++; 
        }

        System.out.println("O maior número digitado foi: " + maiorNumero);
        
        scanner.close(); 
     }
	}

	
    



	

