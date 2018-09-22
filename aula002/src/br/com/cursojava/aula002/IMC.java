//4) Escreva um programa que solicite o peso e altura de uma pessoas e em seguida calcule o vaor do IMC, 
//onde IMC =  peso / (altura * altura).

package br.com.cursojava.aula002;

import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual sua altura?");
		double altura = Double.parseDouble(teclado.nextLine());
		System.out.println("Qual seu peso?");
		double peso = Double.parseDouble(teclado.nextLine());	
		System.out.println("Seu IMC é " + peso / (altura * altura));
		

		
		teclado.close();
		
	}

}
