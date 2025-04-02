/******************************************************************************

 18.Leia a idade de 20 pessoas e exiba a soma das idade, a média das idades e quantas pessoas são maiores de idade.
*******************************************************************************/
 import java.util.Scanner;
 public class ex18
{
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		
		 int somaIdades = 0;
        int maiorIdadeCount = 0;
        int totalPessoas = 20;
        
        // Lendo as idades de 20 pessoas
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            
            somaIdades += idade;
            
            // Verificando se a pessoa é maior de idade
            if (idade >= 18) {
                maiorIdadeCount++;
            }
        }

        // Calculando a média das idades
        double mediaIdades = (double) somaIdades / totalPessoas;

        // Exibindo os resultados
        System.out.println("\nSoma das idades: " + somaIdades);
        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Número de pessoas maiores de idade: " + maiorIdadeCount);
	}
}
