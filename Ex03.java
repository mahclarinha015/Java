/******************************************************************************

 Ex03 - Faça um algoritmo que receba a idade
do usuário e verifique se ele tem 18 anos ou mais. Se a resposta for positiva
escrever “maior de idade”, senão “menor de idade”.


*******************************************************************************/
import java.util.Scanner;
public class Ex03
{

     public static void main(String[]args){
         //Declarar Variaveis
         int n1, n2, n3;
         Scanner ler = new Scanner(System.in);
         
         System.out.println("Entre com o primeiro número: ");
         n1 = ler.nextInt();
         
         System.out.println("Entre com o segundo número: ");
         n2 = ler.nextInt();
         
         System.out.println("Entre com o terceiro número: ");
         n3= ler.nextInt();
         
         // Saida
         if(n1 > n2)
         if(n1 > n3)
         System.out.println("O número 1 é maior !");
          if(n2 > n3)
         if(n2 > n1)
         System.out.println("O número 2 é maior !");
          if(n3 > n2)
         if(n3 > n1)
         System.out.println("O número 3 é maior !");
         else 
         System.out.println("Número não indentificado !");
     }

}
