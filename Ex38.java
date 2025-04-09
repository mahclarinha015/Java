/******************************************************************************

 38- A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. 
 Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto 
 arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de
 poupança (10% do total arrecadado).
 Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos,
 faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.

*******************************************************************************/
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        double precoPao = 0.12;
        double precoBroa = 1.50;
        
       
        System.out.print("Digite a quantidade de pães vendidos: ");
        int quantidadePao = scanner.nextInt();
        
        System.out.print("Digite a quantidade de broas vendidas: ");
        int quantidadeBroa = scanner.nextInt();
        
        
        double totalArrecadado = (quantidadePao * precoPao) + (quantidadeBroa * precoBroa);
        
       
        double valorPoupanca = totalArrecadado * 0.10;
        
        
        System.out.printf("Total arrecadado: R$ %.2f%n", totalArrecadado);
        System.out.printf("Valor a ser guardado na poupança (10%%): R$ %.2f%n", valorPoupanca);
        
        
        scanner.close();
    }
}