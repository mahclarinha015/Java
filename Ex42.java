/******************************************************************************
 
  42 - Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
 vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
 quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
 informe quanto será o valor arrecadado.  
 
  *******************************************************************************/
  import java.util.Scanner;
 
    public class Ex42 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        int camisetaP;
        int camisetaM;
        int camisetaG;
        int resultado;
         
         System.out.print("Informe a quantidade de camisetas pequenas: ");
         camisetaP = scanner.nextInt();
         System.out.print("Informe a quantidade de camisetas médias: ");
         camisetaM = scanner.nextInt();
         System.out.print("Informe a quantidade de camisetas grandes: ");
         camisetaG = scanner.nextInt();
         
         resultado = camisetaP * 10 + camisetaM * 12 + camisetaG * 15;
         
         System.out.println("O valor arrecadado final é de; "+resultado);
     }
 }
 