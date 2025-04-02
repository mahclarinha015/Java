/******************************************************************************

19.  Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.
*******************************************************************************/
import java.util.Scanner;
public class ex19

{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    
	 String nomeMaisNovo = "";
        int idadeMaisNova = 1200;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);
   }
	}

    
	
    

