/******************************************************************************

7. Tendo como entrada o total vendido por
um funcionário no mês de abril, faça um algoritmo que calcule e mostre a sua
comissão e seu salário bruto neste mês, sabendo que o seu salário base é
R$1.200,00 e sua comissão é de 10% sobre o total vendido. O funcionário só
ganhará comissão se o valor total vendido for maior que R$2.000,00.

*******************************************************************************/
import java.util.Scanner;
public class ex07
{
	public static void main(String[] args) {
		//Declarar variáveis
		Scanner ler = new Scanner (System.in);
		int sn, tv, comissao;
		
		
 
       //Entrada de dados
    System.out.println("Entre com o total de vendas: ");
    tv = ler.nextInt();


       // processamento
     comissao = tv / 10;
     sn = comissao + 1200;
   
      //Saída
   
     if (tv >= 2000)
   System.out.println ("A comissão foi de: " + comissao);
     else
   System.out.println ("Não foi possivel obter alteração no salário devido ao baixo número de vendas");
	}
}

