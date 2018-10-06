//7) Escreva um programa que solicite dois números ao usuario, onde o segundo numero deve ser maior que o primeiro. 
//Em seguida escreva os numeros contidos entre o primeiro e o segundo numero digitado.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva um número");
		int num1 = Integer.parseInt(teclado.nextLine());
		int num2 = 0;
		while (num2 < num1) {
		System.out.println("Escreva um número maior que o de antes");
		num2 = Integer.parseInt(teclado.nextLine());
		}
		for (; num1 < num2; num1++) {
			
			System.out.print(num1 + " ");
	
		}
		teclado.close();

	}

}
