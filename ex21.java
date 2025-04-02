/******************************************************************************

21.Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A – Azul, P- Preto, V- Verde e C- Castanho)
e a cor dos cabelos (P – Preto, C- Castanho, L – Louro e R-Ruivo) de 20 pessoas e que calcule e mostre: A quantidade 
de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;
A média das idades das pessoas com altura inferior a 1,50;
A porcentagem de pessoas com olhos azuis entre a s pessoas analisadas;
A quantidade de pessoas ruivas que não possuem olhos azuis; 
*******************************************************************************/
import java.util.Scanner;
public class ex21
{
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
		
	  int quantidadePessoasMais50ePesoMenor60 = 0;
        int somaIdadesComAlturaMenor150 = 0;
        int quantidadeComAlturaMenor150 = 0;
        int quantidadeOlhosAzuis = 0;
        int quantidadePessoasRuivasSemOlhosAzuis = 0;
        int totalPessoas = 20;

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");

            // Entrada de dados
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            System.out.print("Cor dos olhos (A – Azul, P- Preto, V- Verde, C- Castanho): ");
            char corOlhos = scanner.next().charAt(0);
            System.out.print("Cor dos cabelos (P – Preto, C- Castanho, L – Loiro, R – Ruivo): ");
            char corCabelos = scanner.next().charAt(0);

            // Processamento
            if (idade > 50 && peso < 60) {
                quantidadePessoasMais50ePesoMenor60++;
            }

            if (altura < 1.50) {
                somaIdadesComAlturaMenor150 += idade;
                quantidadeComAlturaMenor150++;
            }

            if (corOlhos == 'A') {
                quantidadeOlhosAzuis++;
            }

            if (corCabelos == 'R' && corOlhos != 'A') {
                quantidadePessoasRuivasSemOlhosAzuis++;
            }
        }

        double mediaIdadesComAlturaMenor150 = 0;
        if (quantidadeComAlturaMenor150 > 0) {
            mediaIdadesComAlturaMenor150 = (double) somaIdadesComAlturaMenor150 / quantidadeComAlturaMenor150;
        }

        double porcentagemOlhosAzuis = (double) quantidadeOlhosAzuis / totalPessoas * 100;

        // Saída de dados
        System.out.println("\nResultados:");
        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + quantidadePessoasMais50ePesoMenor60);
        System.out.println("Média das idades das pessoas com altura inferior a 1,50 metros: " + mediaIdadesComAlturaMenor150);
        System.out.println("Porcentagem de pessoas com olhos azuis: " + porcentagemOlhosAzuis + "%");
        System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis: " + quantidadePessoasRuivasSemOlhosAzuis);
	}
}
