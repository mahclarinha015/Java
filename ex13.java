/******************************************************************************

13.Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
-
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP
*******************************************************************************/
import java.util.Scanner;
public class ex13
{
	public static void main(String[] args) {
	  //Declara variáveis
         int comprimento, largura;
  String terrenoPopular, terrenoMaster, terrenoVip;

  //Entrada de dados
   System.out.println("Entre com o comprimento: ");
    comprimento = ler.nextInt();

   System.out.println("Entre com a largura: ");
   largura = ler.nextInt();


   //Saída de dados

    if (comprimento <= 100) {
  System.out.printString("terrenoPopular");
   } if (comprimento <= 500) {
    System.out.printString ("terrenoMaster");

    if (comprimento >= 500)
   System.out.printString ("terrenoVip");
   }
	}
}
    
	
    

