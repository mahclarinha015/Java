/******************************************************************************

Ex04- A empresa XKW concedeu um bônus de 20%
do valor do salário a todos os funcionários com tempo de trabalho na empresa
igual ou superior a 5 anos e de 10% aos demais. Faça um algoritmo que receba o
salário e o tempo de serviço de um funcionário, calcule e mostre o valor do
bônus recebido por ele.

*******************************************************************************/
import java.util.Scanner;
public class Ex04
{
	public static void main(String[] args) {
	//Declarar variaveis
     double salario,bonus,tempo,salariocombonus;
Scanner ler = new Scanner(System.in);

System.out.println("Entre com o salario: ");
salario = ler.nextDouble();

System.out.println("Entre com o tempo de serviço: ");
tempo = ler.nextDouble();



  //Saída
  System.out.println ("O salario será: " + salario);
  if (tempo >= 5){
  bonus = salario * 20/100;
  salariocombonus = salario + ( salario * 0.2);
  System.out.println("O bonus será de:" + bonus);
   System.out.println("O salario com bônus será de:" + salariocombonus);
 
  }
  else if (tempo <5){
  bonus = salario *10/100;
  salariocombonus = salario + (salario*0.1);
   System.out.println("O bonus será de:" + bonus);
   System.out.println("O salario com bônus será de:" + salariocombonus);
  }
       
       
   }
   }
  
	
	
	
