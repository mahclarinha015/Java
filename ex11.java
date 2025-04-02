/******************************************************************************

11.  Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio no último ano. Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela abaixo. Mostre uma mensagem informando o saldo médio e o valor do crédito.
de 0 a 200 - nenhum crédito
de 201 a 400 - 20% do valor do saldo médio
de 401 a 600 - 30% do valor do saldo médio
acima de 601 - 40% do valor do saldo médio
*******************************************************************************/
import java.util.Scanner;
public class ex11
{
	public static void main(String[] args) {
	  //Declara variáveis
         Scanner ler = new Scanner (System.in);
          int sm, credito = 0;
       
        // Entrada de dados
        System.out.println("Entre com o Saldo Médio: ");
        sm = ler.nextInt();
       
        // Condicional para calcular o crédito
        if (sm >= 0 && sm <= 200) {
            credito = 0;
            System.out.println("Seu saldo médio será de: " + sm);
            System.out.println("Seu crédito será de: " + credito);
        } else if (sm >= 201 && sm <= 400) {
            credito = 20;
            System.out.println("Seu saldo médio será de: " + sm);
            System.out.println("Seu crédito será de: " + credito);
        } else if (sm >= 401 && sm <= 600) {
            credito = 30;
            System.out.println("Seu saldo médio será de: " + sm);
            System.out.println("Seu crédito será de: " + credito);
        } else if (sm > 600) {
            credito = 40;
            System.out.println("Seu saldo médio será de: " + sm);
            System.out.println("Seu crédito será de: " + credito);
        }
	}
}

