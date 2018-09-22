package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploLeitor {
	
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in); // quando "chamo" o new eu crio um objeto do tipo Scanner, e o parametro é System.in
		                                          //(que é a classe que representa as informações basicas do Java)
		                                          //System.in = entrada e System.out = saída
		                                          //não usar nextInt, nextDouble... em entrada de dados pelo scanner, pois pode dar bugs
		
		System.out.println("Olá, informe seu nome completo, por favor");
		String nome = teclado.nextLine(); //retorna a proxima linha processada, nextLine sempre retorna STRING
		System.out.printf("O nome informado foi %s \n", nome); //%s é referente a uma string
		teclado.close(); //teclado = null : teclado aponta para nada e não para o Scanner, mas não fecha o recurso, então continua gastando
		                 // processamento do Java
		
		
		
		
		
		
	}

}
