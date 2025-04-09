/******************************************************************************
 
43 - Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.
 
 *******************************************************************************/
 import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o salário do funcionário: R$ ");
        double salarioInicial = scanner.nextDouble();
        
       
        double salarioComAumento = salarioInicial * 1.15;
        
       
        double salarioFinal = salarioComAumento * 0.92;
        
        
        System.out.printf("Salário inicial: R$ %.2f%n", salarioInicial);
        System.out.printf("Salário com aumento de 15%%: R$ %.2f%n", salarioComAumento);
        System.out.printf("Salário final após desconto de 8%%: R$ %.2f%n", salarioFinal);
        
       
        scanner.close();
    }
}