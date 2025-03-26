/******************************************************************************

Ex02- Faça um algoritmo que receba a idade
do usuário e verifique se ele tem 18 anos ou mais. Se a resposta for positiva
escrever “maior de idade”, senão “menor de idade”.


*******************************************************************************/
import java.util.Scanner;
public class Ex02
{
	public static void main(String[] args) {
		//Declarar variáveis 
		
		int idade;
		Scanner ler = new Scanner(System.in);

		
		System.out.println("entre com a idade: ");
		idade = ler.nextInt();
		
		// Processamento
		
		if (idade >= 18 ) 
		System.out.println("Você é maior de idade!");
		
		//saída
		
		else
		System.out.println("Você é menor de idade!");
		
		
		
	}
}
