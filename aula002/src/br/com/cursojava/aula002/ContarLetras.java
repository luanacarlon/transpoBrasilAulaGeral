//17) Crie um programa que solicite o nome do usuário e em seguida verifique se o nome informado possui ao menos 3 letras. (String.length)
//Se o nome possuir menos que 3 letras apresente uma mensagem informando que o nome informádo é inválido.


package br.com.cursojava.aula002;

import java.util.Scanner;

public class ContarLetras {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva um nome");
		String nome = teclado.nextLine();
		if (nome.length() < 3) {
			System.out.println("Nome invalido");
		} else {
			System.out.println("Belo nome!");
		}
		teclado.close();
	}

}
