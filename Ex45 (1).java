/******************************************************************************
 
45- A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
quilos) de queijo, presunto e carne necessários para compra. 

 
 *******************************************************************************/
 import java.util.Scanner;

public class Ex45{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        double pesoQueijoPorFatia = 50.0; 
        double pesoPresuntoPorFatia = 50.0; 
        double pesoHamburguerPorRodela = 100.0; 
        
        
        System.out.print("Digite a quantidade de sanduíches a fazer: ");
        int quantidadeSanduiches = scanner.nextInt();
        
       
        double totalQueijoGramas = quantidadeSanduiches * 2 * pesoQueijoPorFatia; 
        double totalPresuntoGramas = quantidadeSanduiches * pesoPresuntoPorFatia; 
        double totalHamburguerGramas = quantidadeSanduiches * pesoHamburguerPorRodela; 
        
        
        double totalQueijoQuilos = totalQueijoGramas / 1000;
        double totalPresuntoQuilos = totalPresuntoGramas / 1000;
        double totalHamburguerQuilos = totalHamburguerGramas / 1000;
        
       
        System.out.printf("\n Quantidade de queijo necessária: " + totalQueijoQuilos);
        System.out.printf("\n Quantidade de presunto necessária:"+ totalPresuntoQuilos);
        System.out.printf("\n Quantidade de carne (hambúrguer) necessária: " + totalHamburguerQuilos);
        
      
        scanner.close();
    }
}