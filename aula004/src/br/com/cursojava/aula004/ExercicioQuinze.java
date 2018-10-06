//15) Escreva um programa que solicite o valorde 10 produtos e em seguida escreva  o valor dos produtos aplicando 10% de desconto.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExercicioQuinze {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int[] notas = new int[10];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Escreva o preco de um produto");
			notas[i] = Integer.parseInt(teclado.nextLine());

		}
		for (int i = 0; i < notas.length; i++) {

			System.out.println("Produto com desconto: " + (notas[i] - ( notas[i] * 0.01)));

		}

		teclado.close();
	}
	
	

}
