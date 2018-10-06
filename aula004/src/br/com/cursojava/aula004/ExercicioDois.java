//2) Escreva um programa que apresente o meno abaixo até que o usuario digite 'S';
//A - Abrir arquivo
//B - Procurar arquivo 
//C - Download do arquivo
//D - Upload do arquivo
//S - Sair

package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String aux = "";
		
		do{ 
			System.out.println("A - Abrir arquivo");
			System.out.println("B - Procurar arquivo ");
			System.out.println("C - Download do arquivo");
			System.out.println("D - Upload do arquivo");
			System.out.println("S - Sair");
			
			aux = teclado.nextLine();
			
			if (aux.equals("A")) {
				System.out.println("A - Abrir arquivo");
				
			} else if (aux.equals("B")) {
				System.out.println("B - Procurar arquivo ");
				
			} else if (aux.equals("C")) {
				System.out.println("C - Download do arquivo");
				
			} else if (aux.equals("D")) {
				System.out.println("D - Upload do arquivo");
				
			} else if (aux.equals("S")){ 
				System.out.println("Efetuando logoff");
				
			} else {
				System.out.println("Valor inválido!");
			}						
			
		}while (!aux.equals("S"));
		
		System.out.println("Aplicação encerrada.");
		
		teclado.close();
	}

}
