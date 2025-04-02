/******************************************************************************

8. Construa um algoritmo que, tendo como
dados de entrada a altura (H) e o sexo (S) de uma pessoa calcule e apresente
seu peso ideal utilizando as seguintes fórmulas: Para homens: Peso ideal (P) =
(72,7 * H) – 58 Para mulheres: Peso ideal (P) = (62,1 * H) – 44,7

*******************************************************************************/
import java.util.Scanner;
public class ex08
{
	public static void main(String[] args) {
		//Declarar variáveis
		Scanner ler = new Scanner (System.in);
		double altura,pesoidealh,pesoidealm;
         String sexo;
         
         //Entrada de dados
        System.out.println("Entre com a altura");
            altura = ler.nextDouble();
       
        System.out.println("Entre com o sexo");
           sexo = ler.next();
       
           
        //Saída
           
        if (sexo == "f"){
        pesoidealm = (62.1*altura) - 44.7;
           System.out.println ("O peso ideal será: " + pesoidealm);
        }else{
        pesoidealh = (72.7* altura) - 58;
           System.out.println ("O peso ideal será: " + pesoidealh);
        }
	}
}

