/******************************************************************************
 
  37 - Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.
 
 *******************************************************************************/
 import java.util.Scanner;
 
 public class Ex37{
 
     public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int quantidadeCavalo;
       int resultado;
       
       System.out.println("Insira a quantidade de cavalos do haras");
       quantidadeCavalo = scanner.nextInt();
       
       resultado = 4 * quantidadeCavalo;
       
       System.out.println("A quantidade de ferraduras necessárias é de: "+ resultado);
       
       
       
       
       
         
     }
 }