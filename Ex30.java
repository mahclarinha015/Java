/******************************************************************************

30- Escreva um programa que pergunta um número ao usuário, e
mostre sua tabuada completa desse número (de 1 até 10).
*******************************************************************************/
import java.util.Scanner;
public class Ex30
{
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para ver a sua tabuada: ");
        int numero = scanner.nextInt();
        
        System.out.println("Tabuada do " + numero + ":");
    
        int i = 1;
        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;  
        }
        
        scanner.close();
        }
	}



	

