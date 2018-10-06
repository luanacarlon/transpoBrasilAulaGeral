//5) Escreva um programa que apresente o resultado da soma dos 50 primeiros numeros inteiros positivos. Utilize o for.

package br.com.cursojava.aula004;

public class ExercicioCinco {
	
	public static void main(String[] args) {
		int soma = 0;
		for(int num = 0; num <=50; num ++ ){
			soma = soma + num;
		
		}	System.out.println(soma + " ");
		
	}

}
