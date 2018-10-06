//9) Escreva um programa que solicite 5 notas e depois mostre elas.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExercicioNove {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int[] notas = new int[5];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Escreva uma nota");
			notas[i] = Integer.parseInt(teclado.nextLine());	
			
		} 
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		
		teclado.close();
	}

}
