//11) Escreva um programa que solicite 10 notas e em seguida apresente as notas informadas juntamente com a maior e a menor.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExercicioOnze {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] notas = new int[10];
		int notaMin = 999999;
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
		
		System.out.println("Nota máxima: " + notaMax);
		System.out.println("Nota mínima: " + notaMin);
	
		
		teclado.close();
	}

}
