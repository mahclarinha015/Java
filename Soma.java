/******************************************************************************

Desenvolva um programa que calcule a soma de dois numeros 

*******************************************************************************/
import java.util.Scanner;
public class Soma
{
	public static void main(String[] args) {
     // Declara variáveis
     double a,b, soma;
     Scanner ler = new Scanner(System.in);
     
     System.out.println("Digite o prieiro número:");
     a = ler.nextDouble();
     
     System.out.println("Digite o segundo número:");
     b = ler.nextDouble();
     
     //Processamento
     
     soma = a + b;
     
     //Saída
     System.out.println("o resultado será: " + soma);
     
     
	}
}
