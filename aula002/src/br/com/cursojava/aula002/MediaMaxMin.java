//8) Escreva um programa que solicite 3 notas e em seguida calcule e apresente os seguintes dados:
//a) valor da maior nota (Math.max)
//b) valor da menor nota (Math.min)

package br.com.cursojava.aula002;

import java.util.Scanner;

public class MediaMaxMin {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a terceira nota");
		double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a segunda nota");
		double nota3 = Double.parseDouble(teclado.nextLine());
		
		double min = Math.min(Math.min(nota1, nota2), nota3);
		double max = Math.max(Math.max(nota1, nota2), nota3);

		System.out.println("O menor número é:"+ min);
		System.out.println("O maior número é:"+ min);
		teclado.close();
		
	}

}


