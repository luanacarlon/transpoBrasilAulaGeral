/*15) Escreva um  que solicite o valor do salário de uma pessoa. Em seguida o 
    deve calcular o valor de desconto do inss (11%). Caso o salário com o desconto do inss já
    aplicado seja maior que 1800, deve-se aplicar a seguinte tabela de descontos IR.
     A) Salário maior que 1800 e menor ou igual 2400 percentual IR = 7.5%
     B) Salário maior que 2400 e menor ou igual 3600 percentual IR = 24%
     B) Salário superior a 3600 percentual IR = 32%
    Ao final o  deve apresentar o valor do salario inicial, o valor do desconto do
     inss, o valor e o percentual do desconto de IR e o valor do salário Líquido.
*/
package br.com.cursojava.aula002;

import java.util.Scanner;

public class SalarioIR {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu salario!");
		double salario = Double.parseDouble(teclado.nextLine());
		double novoSalario = salario - (salario * 0.11);
		
		if (novoSalario <= 1800) {
			
			System.out.println("Seu salário com 11% de INSS fica: R$ " + novoSalario);
			System.out.println("Seu salário não tem desconto de IR");
			
		} else if (novoSalario > 1800 || novoSalario <= 2400 ) {
			System.out.println("Seu salário com 11% de INSS fica: R$ " + novoSalario);
			System.out.println("Seu salário com desconto do IR é: R$ " + (novoSalario - (novoSalario * 0.075)));
		} else if (novoSalario > 2400 || novoSalario <= 3600 ) {
			System.out.println("Seu salário com 11% de INSS fica: R$ " + novoSalario);
			System.out.println("Seu salário com desconto do IR é: R$ " + (novoSalario - (novoSalario * 0.24)));
		} else {
			System.out.println("Seu salário com 11% de INSS fica: R$ " + novoSalario);
			System.out.println("Seu salário com desconto do IR é: R$ " + (novoSalario - (novoSalario * 0.32)));
		}
		
		teclado.close();
		
	}

}
