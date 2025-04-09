/******************************************************************************
 
  41 -  O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
balança já desconte o peso do prato.  
 *******************************************************************************/
 import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        double precoPorQuilo = 12.00;
        
        
        System.out.print("Digite o peso do prato montado (em quilos): ");
        double pesoPrato = scanner.nextDouble();
        
       
        double valorAPagar = pesoPrato * precoPorQuilo;
        
       
        System.out.printf("O valor a pagar é: R$ %.2f%n", valorAPagar);
        
        
        scanner.close();
    }
}