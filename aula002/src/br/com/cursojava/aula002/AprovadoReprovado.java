//10) Escreva um programa que solicite 3 notas e em seguida calcule a media das notas. 
//Se a media for maior ou igual a 7 escreva a mensagem "Aprovado", senão, escreva "Reprovado"

package br.com.cursojava.aula002;

import java.util.Scanner;

public class AprovadoReprovado {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a 1ª nota");
		double nota1 = Double.parseDouble(teclado.nextLine()); 
		System.out.println("Digite a 2ª nota");
		double nota2 = Double.parseDouble(teclado.nextLine()); 
		System.out.println("Digite a 3ª nota");
		double nota3 = Double.parseDouble(teclado.nextLine()); 
		double media = (nota1 + nota2 + nota3) / 3;
		if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		teclado.close();
	}

}
