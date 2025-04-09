/******************************************************************************
 
  40 -  Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
tanque.
 *******************************************************************************/
 import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Digite o preço do litro da gasolina (em reais): ");
        double precoLitro = scanner.nextDouble();
        
        System.out.print("Digite o valor do pagamento (em reais): ");
        double valorPagamento = scanner.nextDouble();
       
        double litros = valorPagamento / precoLitro;
        
       
        System.out.printf("O motorista conseguiu colocar %.2f litros de gasolina no tanque.%n", litros);
        
        scanner.close();
    }
}
