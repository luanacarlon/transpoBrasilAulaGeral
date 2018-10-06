//14) Escreva um programa que solicite 10 notas e em seguida calcule e apresente o valor da media das notas, 
//juntamente com as notas que possuem o valor menor e amedia.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExercicioQuatorze {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int[] notas = new int[10];
		int notaMin = 999999;
		int soma = 0;
		int resultado = 0;
		int notaMax = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Escreva uma nota");
			notas[i] = Integer.parseInt(teclado.nextLine());

		}
		for (int i = 0; i < notas.length; i++) {

			System.out.println("Nota: " + notas[i]);

			notaMax = Math.max(notaMax, notas[i]);
			notaMin = Math.min(notaMin, notas[i]);

		}
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
			resultado = soma / 10;
		}
		System.out.println("Nota máxima: " + notaMax);
		System.out.println("Nota mínima: " + notaMin);
		System.out.println("Média: " + resultado);

		teclado.close();
	}

}
