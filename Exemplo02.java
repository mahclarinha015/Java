/******************************************************************************

Exemplo Array - Entrada de Dados

*******************************************************************************/
import java.util.Scanner;
public class Exemplo02
{
	public static void main(String[] args) {
	int []  numeros = new int [5];
	Scanner ler = new Scanner(System.in);
	
	//Entrada de Dados
	for(int i=0; i<numeros.length; i++){
	    System.out.println("Digite o " + (i + 1) + "º nmeros: ");
	   numeros[i] = ler.nextInt();
	}
	    //Saída de Dados
	    for(int i=0; i<numeros.length; i++){
	        System.out.println(" o" + (i + 1)+ "º numros é:" + numeros[i]);
	    
	    }
	}
}

