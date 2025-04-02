/******************************************************************************

10. Construa um algoritmo que determine
quanto será gasto para encher o tanque de um carro (VG), sabendo-se que o preço
da gasolina é de R$ 1,80 e o preço do álcool é de R$ 1,00. O usuário fornecerá
os seguintes dados: Tipo de carro (TC) (G – gasolina ou A – álcool) e
Capacidade do tanque (CT), em litros

*******************************************************************************/
import java.util.Scanner;
public class ex10
{
	public static void main(String[] args) {
	  //Declara variáveis
         Scanner ler = new Scanner (System.in);
         char tipodecombustivel;
         double capacidadeTanque,valorGasto;
         
        // Entrada dos dados de hora e minuto de entrada
        System.out.println ("Digite o tipo de combustivel \n (G- gasolina ou A- álcool): ");
        tipodecombustivel = ler.next().charAt(0);
        System.out.println ("Digite a capacidade do tanque: ");
        capacidadeTanque = ler.nextDouble () ;

        // Saída
            if (tipodecombustivel == 'G' || tipodecombustivel == 'g' ) {
            valorGasto = capacidadeTanque * 1.80;
            System.out.println ("O valor pago no combustivel será de: " + valorGasto);
        }   else if (tipodecombustivel == 'A' || tipodecombustivel == 'a' ) {
            valorGasto = capacidadeTanque * 1.00;
            System.out.println ("O valor pago no combustivel será de: " + valorGasto);
        } else {
            System.out.println("Tipo de combustível inválido.");
        }
	}
}

