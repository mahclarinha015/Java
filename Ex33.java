/******************************************************************************

33-  Faça um programa que leia 10 números e informe a soma e a média dos números.
*******************************************************************************/
import java.util.Scanner;
public class Ex33
{
	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int quantidadeNumeros = 10;
        
        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o " + i + "° número: ");
            int numero = scanner.nextInt();
            
            soma += numero;
        }
        
        double media = (double) soma / quantidadeNumeros;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        
        scanner.close();
    }
}



	

