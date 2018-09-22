//2) Escreva um programa que solicite o valor da base e altura de um retangulo e apresente o valor da area e do perimetro do retangulo.

package br.com.cursojava.aula002;

import java.util.Scanner;

public class Retangulo {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a base do retangulo");
		double base = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe a altura do retangulo");
		double altura = Double.parseDouble(teclado.nextLine());
		System.out.println("A área é " + base * altura  + " e o perímetro é " + 2 * (base + altura) );
		teclado.close();
	}

}
