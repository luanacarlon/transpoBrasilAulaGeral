//13) Escreva um programa que solicite a um numero inteiro e diga se é impar ou par.

package br.com.cursojava.aula002;

import java.util.Scanner;

public class ImparPar {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escreva um numero inteiro");
		int numero = Integer.parseInt(teclado.nextLine());
		int resto = numero % 2;
		if (resto == 1) {
			System.out.println("Impar");
		} else {
			System.out.println("Par");
		}
		
		teclado.close();
		
	

	}

}
