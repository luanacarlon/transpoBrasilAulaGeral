//1) Escreva um programa que solicite a idade do usuario e em seguida apresente o valor informado. Caso o usuario tenha digitado um valor negativo o programa deve 
//apresentar uma mensagem informando que o valor é invalido e deve solicitar a idade novamente.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idade = 0;
		do {
			System.out.println("Qual sua idade em anos?");
			idade = Integer.parseInt(teclado.nextLine());
			if (idade < 0) {
				System.out.println("Idade inválida!");
			} else {
				System.out.println("Sua idade é " + idade);
			}
		}while (idade < 0);		
		teclado.close();
	}

}

