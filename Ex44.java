/******************************************************************************
 
44 - Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um
algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
Carlos, R$33,00 para André e R$35,53 para Felipe.
 
 *******************************************************************************/
 import java.util.Scanner;

public class Ex44{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o valor total da conta (em R$): ");
        double valorTotal = scanner.nextDouble();
        
       
        int valorParaCarlosAndre = (int) (valorTotal / 3);  
        
       
        double valorParaFelipe = valorTotal - 2 * valorParaCarlosAndre;
       
        System.out.printf("Carlos deve pagar: R$ %d,00%n", valorParaCarlosAndre);
        System.out.printf("André deve pagar: R$ %d,00%n", valorParaCarlosAndre);
        System.out.printf("Felipe deve pagar: R$ %.2f%n", valorParaFelipe);
        
        
        scanner.close();
    }
}