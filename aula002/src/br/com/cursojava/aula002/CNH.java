//11) Escreva um programa que solicite a idade do usuario e em seguida escreva uma mensagem informando 
//se ele tem ou nao idade para fazer CNH.


package br.com.cursojava.aula002;

import java.util.Scanner;

public class CNH {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual sua idade?");
		int idade = Integer.parseInt(teclado.nextLine());
		if (idade >= 18) {
			System.out.println("Pode fazer CNH");
		} else {
			System.out.println("Não pode fazer CNH");
		}	
		teclado.close();
		
	}
}
