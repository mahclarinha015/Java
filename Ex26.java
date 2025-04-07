/******************************************************************************

26- Faça um programa, utilizando while, que mostre na tela de 0 até N, em que N é o limite inserido pelo usuário.

*******************************************************************************/
import java.util.Scanner;
public class Ex26
{
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o limite N: ");
        int N = scanner.nextInt();
        
        int i = 0;
        
        
        while (i <= N) {
            System.out.println(i);
            i++;  
        
       scanner.close();
        }
	}



	

