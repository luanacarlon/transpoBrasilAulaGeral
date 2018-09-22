package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploLeitor {
	
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in); // quando "chamo" o new eu crio um objeto do tipo Scanner, e o parametro � System.in
		                                          //(que � a classe que representa as informa��es basicas do Java)
		                                          //System.in = entrada e System.out = sa�da
		                                          //n�o usar nextInt, nextDouble... em entrada de dados pelo scanner, pois pode dar bugs
		
		System.out.println("Ol�, informe seu nome completo, por favor");
		String nome = teclado.nextLine(); //retorna a proxima linha processada, nextLine sempre retorna STRING
		System.out.printf("O nome informado foi %s \n", nome); //%s � referente a uma string
		teclado.close(); //teclado = null : teclado aponta para nada e n�o para o Scanner, mas n�o fecha o recurso, ent�o continua gastando
		                 // processamento do Java
		
		
		
		
		
		
	}

}
