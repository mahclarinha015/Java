/******************************************************************************

Ex05 - Implemente um código para aprovar
empréstimo bancário. O código deve pedir 3 informações: valor do empréstimo,
número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor
das parcelas representem no máximo 30% do salário do solicitante.


*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 //Declara variáveis
 Scanner ler = new Scanner (System.in);
 double salario, qtdparcelas, vlremprestimo, caso, parcela;
 
 //Entrada de dados
System.out.println("Entre com o valor do empréstimo: ");
vlremprestimo= ler.nextDouble ();
System.out.println("Entre com o quantidade de parcelas: ");
qtdparcelas= ler.nextDouble ();
System.out.println("Entre com o salário do solicitante: ");
salario= ler.nextDouble ();

   // processamento
   parcela= vlremprestimo/qtdparcelas;
   
    //Saída
    System.out.println ("O salário do funcionário é de: " + salario);
    System.out.println ("A quantidade de parcelas seria de: " + qtdparcelas);
   
if (parcela <= (0.3 * salario) ){
   System.out.println ("Emprestimo aprovado");
   }else
   System.out.println ("Emprestimo negado");
	}
}
