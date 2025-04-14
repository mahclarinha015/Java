/******************************************************************************

 06 - Faça um programa em Java para resolver a equação de 2º grau.        
        Pedir para o usuário entrar com as variáveis A, B e C .
        Mostrar o valor de x1, x2 e delta.
       
        Usar a biblioteca:
          import java.lang.Math;
          Usar o "Math.sqrt" para encontrar a raiz quadrada. Ex.: raiz = Math.sqrt(9); // = 3
          Usar o "Math.pow" para fazer a potenciação Ex.: potencia= Math.pow(5,2); // = 25
          *Usar double se resultar em números decimais
*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;

public class Ds06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();
        
        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

       
        double delta = Math.pow(B, 2) - 4 * A * C;

        System.out.println("\nValor de Delta (Δ): " + delta);

        if (delta > 0) {
           
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.println("Raiz x1: " + x1);
            System.out.println("Raiz x2: " + x2);
        } else if (delta == 0) {
           
            double x = -B / (2 * A);

            System.out.println("Raiz única: " + x);
        } else {
           
            System.out.println("Não existe solução real para a equação (Δ < 0).");
        }

       
    }
}