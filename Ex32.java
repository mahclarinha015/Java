/******************************************************************************

32-  Faça um programa que leia 5 números e informe o maior número
*******************************************************************************/
import java.util.Scanner;
public class Ex32
{
	public static void main(String[] args) {
     focanner scanner = new Scanner(System.in);
        
        int maiorNumero = Integer.MIN_VALUE;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "° número: ");
            int numero = scanner.nextInt();
            if (numero > maiorNumero) {
                maiorNumero = numero;  
            }
        }
        
        System.out.println("O maior número digitado foi: " + maiorNumero);
        
        scanner.close();
        }
	}
}



	

