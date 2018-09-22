//18) Escreva um programa que solicite o ano de nascimento de usu�rio, e em seguida escreva uma mensagem informando se o ano
//informado foi um ano bissexto. S�o bissexto todos os anos m�ltiplos de 400,  tamb�m s�o bissextos todos os anos multiplos de 
//4 e que n�o s�o m�ltiplos de 100. 

package br.com.cursojava.aula002;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Que ano voc� nasceu?");
		int ano = Integer.parseInt(teclado.nextLine());	
		
		if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println("Ano bissexto");
			
		} else {
			System.out.println("N�o � bissexto");
		}

		teclado.close();
	}

}
