/*12) Escreva um programa que solicite 4 notas e em seguida calcule a media das notas. 
 * O programa deve apresentar uma mensagem para o usuario de acordo com o valor da media, conforme a tabela abaixo
* Media maior ou igual a 9 = "Conceito A"
* Media maior ou igual a 8 = "Conceiro B"
* Media maior ou igual a 6 = "Conceito C"
* Media maior ou igual a 5 = "Conceito D"
* Media menor que 5 = Insuficiente */


package br.com.cursojava.aula002;

import java.util.Scanner;

public class ConceitoNota {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe sua 1ª nota");
		double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe sua 2ª nota");
		double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe sua 3ª nota");
		double nota3 = Double.parseDouble(teclado.nextLine());
		System.out.println("Informe sua 4ª nota");
		double nota4 = Double.parseDouble(teclado.nextLine());
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 9 || media <= 10 ) {
			System.out.println("Conceito A");	
			
		} else if ( media >= 8 || media < 9 ) {
			System.out.println("Conceito B");
			
		} else if ( media >= 6 || media < 8 ) {
			System.out.println("Conceito C");
			
		} else if ( media >= 5 || media < 6 ) {
			System.out.println("Conceito D");
			
		} else {
			System.out.println("Insuficiente");
		}
		
		teclado.close();
		
	}

}
