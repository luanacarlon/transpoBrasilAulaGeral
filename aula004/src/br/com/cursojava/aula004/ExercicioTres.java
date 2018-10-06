//3) Escreva um programa que solcite uma palavra e em seguida apresente a palavra de modo inverso (de trás pra frente). 
//Utilize o programa do-while para criar a palavra.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExercicioTres {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
			System.out.println("Digite uma palavra");
			String palavra = teclado.nextLine();
			String inverso = "";
			int index = palavra.length()-1;
			if (index > -1) {
			do {	
				inverso += palavra.charAt(index--);			
		} while (index >= 0);
		
	}
		System.out.println("O inverso da palavra é " + inverso);
		teclado.close();
}

}
