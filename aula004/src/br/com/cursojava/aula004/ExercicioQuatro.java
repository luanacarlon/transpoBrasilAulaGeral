//4) Escreva um programa que apresente os numeros pares entre 100 e 200.

package br.com.cursojava.aula004;

public class ExercicioQuatro {

	public static void main(String[] args) {

		for (int num = 99; num <= 200; num++) {
			if (num % 2 != 0) {
				continue;
			}
			System.out.println(num + " ");

		}

	}
}
