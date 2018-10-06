//6) Escreva um programa que solicite um numero entre 1 e 20, e em seguida apresente o valor do fatorial do numero informado.
//O programa deve valida os numeros informados solicitando um numero correto sempre que for digitado um numero fora 
//do intervalo de 1 e 20. Utilize do-while e for.

package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int resultado = 1;
		do {
			System.out.println("Digite um número de 1 a 20, por favor");
			numero = Integer.parseInt(teclado.nextLine());
		}while (numero < 1 || numero > 20);
		for(int aux = 1; aux <= numero; aux++ ){	
		resultado *= aux;
		}
		System.out.println("O Fatorial é " + resultado);

		
		teclado.close();
	}

}
