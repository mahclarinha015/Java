/******************************************************************************

9. Construa um algoritmo para calcular o
valor a ser pago pelo período de estacionamento do automóvel (PAG). O usuário
entra com os seguintes dados: hora (HE) e minuto (ME) de entrada, hora (HS) e
minuto (MS) de saída. Sabe-se que este estacionamento cobra hora cheia, ou
seja, se passar um minuto ele cobra a hora inteira. O valor cobrado pelo
estacionamento é: •R$ 4,00 para 1 hora de estacionamento •R$ 6,00 para 2 horas
de estacionamento •R$ 1,00 por hora adicional (acima de 2 horas)
*******************************************************************************/
import java.util.Scanner;
public class ex09
{
	public static void main(String[] args) {
		//Declarar variáveis
		Scanner ler = new Scanner (System.in);
		 double HEentrada, MEentrada, HSsaida, MSsaida,minutosEntrada, minutosSaida, totalMinutos, horasAdicionais, valor;
         
        // Entrada dos dados de hora e minuto de entrada
        System.out.println ("Digite a hora de entrada (HE): ");
        HEentrada = ler.nextDouble();
        System.out.println ("Digite os minutos de entrada (ME): ");
        MEentrada = ler.nextDouble ();

        // Entrada dos dados de hora e minuto de saída
        System.out.println ("Digite a hora de saída (HS): ");
        HSsaida = ler.nextDouble();
        System.out.println ("Digite os minutos de saída (MS): ");
        MSsaida = ler.nextDouble();
           
        // Processamento
         minutosEntrada = HEentrada * 60 + MEentrada;
         minutosSaida = HSsaida * 60 + MSsaida;
         totalMinutos = minutosSaida - minutosEntrada;
         
        // Saída
          if (totalMinutos <= 60) {
            valor = 4.00; // 1 hora
        } else if (totalMinutos <= 120) {
            valor = 6.00; // 2 horas
        } else {
            // Se o tempo de estacionamento for superior a 2 horas, cobra-se R$ 1,00 por hora adicional
            horasAdicionais = (totalMinutos - 120 + 59) / 60; // arredonda para cima
            valor = 6.00 + horasAdicionais * 1.00;
        }
           System.out.println ("O valor a ser pago é R$" + valor);
	}
}

