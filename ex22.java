/******************************************************************************

22. )Faça um programa que receba a idade e o sexo de sete pessoas e que calcule e mostre:
A idade média do grupo;
A idade média das mulheres;
A idade média dos homens; 
*******************************************************************************/
import java.util.Scanner;
public class ex22
{

     public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
        int totalPessoas = 7;
        int somaEmGrupo = 0;
        int somaIdadeMulheres = 0;
        int somaIdadeHomens = 0;
        int contMulheres = 0;
        int contHomens = 0;

        //Entrada de dados
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i);

            // Recebe a idade
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();  

            // Recebe o sexo
            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);

           //Processamento
            somaEmGrupo += idade;

           
            if (sexo == 'F' || sexo == 'f') {
                somaIdadeMulheres += idade;
                contMulheres++;
            }
           
            else if (sexo == 'M' || sexo == 'm') {
                somaIdadeHomens += idade;
                contHomens++;
            }
        }

       
        double mediaGrupo = (double) somaEmGrupo / totalPessoas;  
        double mediaMulheres = contMulheres > 0 ? (double) somaIdadeMulheres / contMulheres : 0;
        double mediaHomens = contHomens > 0 ? (double) somaIdadeHomens / contHomens : 0;

        //Saída de dados
        System.out.println("Idade média do grupo: " + mediaGrupo);
        System.out.println("Idade média das mulheres: " + mediaMulheres);
        System.out.println("Idade média dos homens: " + mediaHomens);
   }
	}

    
	
    

