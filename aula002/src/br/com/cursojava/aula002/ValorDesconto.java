//3) Escreve um programa que solicite o valor de um produto e o percentual de desconto, em seguida calcule e 
//apresente o valor de desconto e o valor do produto com o desconto aplicado.

package br.com.cursojava.aula002;

import java.util.Scanner;

public class ValorDesconto {
	public static void main(String[] args) {
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Qual o valor do produto?");
		double preco = Double.parseDouble(teclado.nextLine());
		System.out.println("Qual a porcentagem de desconto?");
		double desconto = Double.parseDouble(teclado.nextLine());
		System.out.println("O valor do desconto é " + (desconto / 100) * preco);
		System.out.println("O valor do produto com desconto é " + (preco - (desconto / 100) * preco));
		teclado.close();
	}
}
