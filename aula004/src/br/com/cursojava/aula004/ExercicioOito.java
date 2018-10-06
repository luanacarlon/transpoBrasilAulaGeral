
package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite uma palavra");
		String palavra = teclado.nextLine();
		String resultado = "";
		for (int contador = 0; contador < palavra.length(); contador++) {
			resultado += palavra.charAt(contador);
			System.out.println(resultado + " ");
		}

		teclado.close();
	}

}
