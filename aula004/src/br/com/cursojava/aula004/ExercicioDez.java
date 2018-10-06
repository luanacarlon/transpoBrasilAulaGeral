//10) Escreva um programa que solicte 5 nomes e depois apresente eles na sequencia inversa.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExercicioDez {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[5];
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Escreva um nome");
			nomes[i] = teclado.nextLine();

		}
		System.out.println(nomes[4]);
		System.out.println(nomes[3]);
		System.out.println(nomes[2]);
		System.out.println(nomes[1]);
		System.out.println(nomes[0]);

		teclado.close();
	}

}
