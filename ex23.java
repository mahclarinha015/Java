/******************************************************************************

23)  Faça um programa que usando laços de repetição receba a idade e o peso de 15 pessoas.
Calcule e mostre as médias dos pesos das pessoas da mesma faixa etária.
As faixas etárias são: de 1 a 10 anos, de ll a 20 anos, de 21 a 30 anos e maiores de 31 anos.
*******************************************************************************/
import java.util.Scanner;
public class ex23
{

     public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
      int totalPessoas = 15;

        //Entrada de dados
        double somaPeso1a10 = 0, somaPeso11a20 = 0, somaPeso21a30 = 0, somaPesoMaior31 = 0;
        int cont1a10 = 0, cont11a20 = 0, cont21a30 = 0, contMaior31 = 0;

        //Processamento
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i);

           
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

         
            System.out.print("Digite o peso: ");
            double peso = scanner.nextDouble();

           
            if (idade >= 1 && idade <= 10) {
                somaPeso1a10 += peso;
                cont1a10++;
            } else if (idade >= 11 && idade <= 20) {
                somaPeso11a20 += peso;
                cont11a20++;
            } else if (idade >= 21 && idade <= 30) {
                somaPeso21a30 += peso;
                cont21a30++;
            } else if (idade > 30) {
                somaPesoMaior31 += peso;
                contMaior31++;
            }
        }
   
	

    
	
    

