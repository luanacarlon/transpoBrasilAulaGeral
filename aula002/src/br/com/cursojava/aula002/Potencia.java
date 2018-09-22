//7) Escreva um programa que solicite um numero e em seguida calcule o valor do numero elevado a potencia de 2.

package br.com.cursojava.aula002;

import java.util.Scanner;

public class Potencia {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um numero");
		double numero = Double.parseDouble(teclado.nextLine());
		System.out.println("Este número elevado a potência de 2 é: " + numero * numero);
		teclado.close();
	}

}
