/******************************************************************************
 
 39- Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida
ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex uma pessoa
com 19 anos possui 6935 dias de vida; veja um exemplo de saída maria, voce ja viveu 6935
dias
 
 *******************************************************************************/
 import java.util.Scanner;
 
 public class Ex39{
 
     public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
     String nomePessoa;
     int idadePessoa;
     int resultado;
     
      System.out.print("Digite o nome da pessoa: ");
      nomePessoa = scanner.nextLine();
     
      System.out.print("Digite a idade da pessoa: ");
      idadePessoa = scanner.nextInt();
     
      resultado = idadePessoa * 365;
      System.out.println (nomePessoa +", você possui "+resultado+ "dias de vida");
       
       
       
       
       
         
     }
 }