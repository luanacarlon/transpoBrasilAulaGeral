//18) Escreva um programa que solicite o ano de nascimento de usuário, e em seguida escreva uma mensagem informando se o ano
//informado foi um ano bissexto. São bissexto todos os anos múltiplos de 400,  também são bissextos todos os anos multiplos de 
//4 e que não são múltiplos de 100. 

package br.com.cursojava.aula002;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Que ano você nasceu?");
		int ano = Integer.parseInt(teclado.nextLine());	
		
		if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println("Ano bissexto");
			
		} else {
			System.out.println("Não é bissexto");
		}

		teclado.close();
	}

}
