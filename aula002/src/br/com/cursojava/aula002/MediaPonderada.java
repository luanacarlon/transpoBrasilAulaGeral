//9) Escreva um programa que solicite 3 notas e em seguida calcule media ponderada aplicando 
//pesos 2, 3 e 5 respectivamente. No final apresente a m�dia.

package br.com.cursojava.aula002;

import java.util.Scanner;

public class MediaPonderada {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua 1� nota");
		double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe sua 2� nota");
		double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe sua 3� nota");
		double nota3 = Double.parseDouble(teclado.nextLine());
		System.out.println("Sua m�dia � " + (nota1 * 2 +  nota2 * 3 + nota3 * 5) / 10);
		teclado.close();
		
	}

}
