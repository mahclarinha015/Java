/******************************************************************************
 
46-  Desenvolver um programa com  Ao iniciar o programa, exiba o seguinte menu de opções:

--- Calculadora de Áreas --- 
1. Calcular Área do Retângulo 
2. Calcular Área do Triângulo 
3. Calcular Área do Círculo 
0. Sair 

 
 *******************************************************************************/
 import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        
       
        do {
            System.out.println("--- Calculadora de Áreas ---");
            System.out.println("1. Calcular Área do Retângulo");
            System.out.println("2. Calcular Área do Triângulo");
            System.out.println("3. Calcular Área do Círculo");
            System.out.println("0. Sair");
            System.out.print("-- Escolha uma opção: ");
            
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    
                    System.out.print("Digite a base do retângulo: ");
                    double baseRetangulo = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double alturaRetangulo = scanner.nextDouble();
                    double areaRetangulo = baseRetangulo * alturaRetangulo;
                    System.out.printf("A área do retângulo é:" + areaRetangulo);
                    break;
                
                case 2:
                   
                    System.out.print("Digite a base do triângulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                    System.out.printf("A área do triângulo é: " + areaTriangulo);
                    break;
                
                case 3:
                    
                    System.out.print("Digite o raio do círculo: ");
                    double raioCirculo = scanner.nextDouble();
                    double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
                    System.out.printf("A área do círculo é:" + areaCirculo);
                    break;
                
                case 0:
                    System.out.println("Saindo... Até logo!");
                    break;
                
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0); 
        
       
        scanner.close();
    }
}