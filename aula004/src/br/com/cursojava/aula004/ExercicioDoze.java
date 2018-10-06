//12) Escreva um programa que solicte 10 notas e em seguida calcule a media. O programa deve apresentar todas as notas 
//q possuem valor igual ou maior q a media.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExercicioDoze {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] notas = new int[10];
		int soma = 0;
		int resultado = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Escreva uma nota");
			notas[i] = Integer.parseInt(teclado.nextLine());

		}
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
			resultado = soma / 10;
		}

		System.out.println("A média é " + resultado);
		

		teclado.close();
	}

}
