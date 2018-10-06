package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int codigo = 0;
		do { 
			System.out.println("1 - Cadastrar produtos.");
			System.out.println("2 - Listar produtos.");
			System.out.println("3 - Remover produtos.");
			System.out.println("4 - Sair.");
			codigo = Integer.parseInt(teclado.nextLine());
			switch (codigo) {
			case 1:
				System.out.println("Escolheu a op��o 'Cadastrar Produtos'.");
				break;
			case 2:
				System.out.println("Escolheu a op��o 'Listar Produtos'.");
				break;
			case 3:
				System.out.println("Escolheu a op��o 'Remover Produtos'.");
				break;
			case 4:
				System.out.println("Executando logoff...");
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}
		} while (codigo != 4);

		System.out.println("Fim da aplica��o.");
		teclado.close();

	}
}
