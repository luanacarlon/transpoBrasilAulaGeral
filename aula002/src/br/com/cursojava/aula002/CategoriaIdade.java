/*14) Escreva um programa que soicite a idade do usuário e apresente uma classificação de acordo com a tabela abaixo
   idade >=18 "Categoria adulto"
   idade entre 14 e 17 "Categoria Juvenil"
   idade entre 12 e 13 "Categoria Infanto Juvenil"
   idade entre 9 e 11 "Categoria Infantil"
   idade menor que 9 "Categoria Mirim"    */

package br.com.cursojava.aula002;

import java.util.Scanner;

public class CategoriaIdade {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual sua idade?");
		
		int idade = Integer.parseInt(teclado.nextLine());
		
		if (idade >= 18) {
			System.out.println("Categoria Adulto");
		} else if (idade < 18 || idade >= 17 ){
			System.out.println("Categoria  Juvenil");
		} else if (idade < 17 || idade >= 14 ){
			System.out.println("Categoria  Infanto Juvenil");
		} else if (idade <14 || idade >= 12) {
			System.out.println("Categoria Infantil");
		} else {
			System.out.println("Categoria Mirim");
		}
		
		teclado.close();
	}

}
