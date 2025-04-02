/******************************************************************************

 16. Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

*******************************************************************************/
import java.util.Scanner;
public class ex16
{
	public static void main(String[] args) {
	 Scanner ler = new Scanner (System.in);
		String nome;
     
      System.out.println ("Digite o nome de usúario: ");
      nome= ler.nextLine ();
     
      for (int i=0 ; i<= 10; i++) {
      System.out.println("O nome do usúario é:" + nome );
	}
	}

