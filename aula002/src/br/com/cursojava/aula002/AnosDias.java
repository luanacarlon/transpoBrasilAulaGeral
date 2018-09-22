package br.com.cursojava.aula002;

import java.util.Scanner;

public class AnosDias {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual sua idade em anos?");
		int anos = Integer.parseInt(teclado.nextLine());
		System.out.println("Sua idade é " + anos * 365 + " dias");
	
		teclado.close();
		
	}

}


