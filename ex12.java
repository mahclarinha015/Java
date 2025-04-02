/******************************************************************************

12.Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.
*******************************************************************************/
import java.util.Scanner;
public class ex12
{
	public static void main(String[] args) {
	  //Declara variáveis
         Scanner ler = new Scanner (System.in);
          int anodeNascimento, alistamentoMilitar, idade, ano;

   //Entrada de dados
    System.out.printIn("Entre com o ano de nascimento: ");
       anodeNascimento = Ler.nextInt();

     //Processamento

      idade = 2025 - anodeNascimento;

      //Saída de dados

      if (idade < 18) {
      System.out.printIn ("faltará um tempo para você poder se alistar!");

    else if (idade == 18) 
     System.out.printIn ("Você já pode se alistar!");

     if (idade = 2025 - anodeNascimento && idade - 18);
     System.out.printIn ("Você já passou da data de se alistar: ", +idade - 18);
    }
	}
    

