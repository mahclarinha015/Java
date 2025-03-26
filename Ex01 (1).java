/******************************************************************************

Ex01- Desenvolva um programa que calcule a media de dois numeros mostre se ele 
foi aprovado ou reprovado

*******************************************************************************/
import java.util.Scanner;
public class Ex01
{
	public static void main(String[] args) {
     // Declara variáveis
     double  n1,n2,soma,media;
     Scanner ler = new Scanner(System.in);
     
     System.out.println("Entre com a primeira nota: ");
     n1 = ler.nextInt();
     
     System.out.println("Entre com a segunda nota: ");
     n2 = ler.nextInt();
     
     //Processamento
     
     media = (n1 + n2)/ 2;
     
     //Saída
     System.out.println("A média do aluno será: " + media);
     if (media >= 7)
     System.out.println("Você foi aprovado " );
     else
     System.out.println("Você foi reprovado ");
     
     
	}
}
