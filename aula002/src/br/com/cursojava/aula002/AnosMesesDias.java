//6) Escreva um programa que solicite a idade do usuario em dias e em seguida calcule e apresente o valor da idade em anos, meses e dias.
//Ex: idade = 396, retorna entao, 1 ano, 1 mes e 1 dia
//Ano = 360 Mes = 30 Dia = 1


package br.com.cursojava.aula002;

import java.util.Scanner;

public class AnosMesesDias {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual sua idade em dias?");
		int idade = Integer.parseInt(teclado.nextLine());
		
		int restoDias =  idade % 360;	
		int idadeAnos = idade / 360;
	    int idadeMeses = restoDias / 30;
		int idadeDias = restoDias % 30;
		
		System.out.println("Você tem " + idadeAnos + " ano(s), " + idadeMeses + " mes(es) e " + idadeDias + " dia(s)!" );
	
		teclado.close();
		
	}
	

}
