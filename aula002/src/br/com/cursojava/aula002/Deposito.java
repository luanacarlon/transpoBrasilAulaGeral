/*16) Escreva um  que apresente o menu abaixo:
    1 - Depositar
    2 - Sacar
    3 - Verificar Saldo

    Em seguida conforme o n�mero digitado apresente uma das mensagens abaixo:
    codigo: 1 mensagem: Voc� Escolheu a op��o Depositar
    codigo: 2 mensagem: Voc� Escolheu a op��o Sacar
    codigo: 3 mensagem: Voc� Escolheu a op��o Verificar Saldo */


package br.com.cursojava.aula002;

import java.util.Scanner;

public class Deposito {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("1) Depositar \n"
				+ "2) Sacar \n"
				+ "3) Verificar Saldo");
		int numero = Integer.parseInt(teclado.nextLine());
		if (numero == 1) {
			System.out.println("Voce escolheu a op��o Depositar");
		} else if (numero ==2){
			System.out.println("Voce escolheu a op��o Sacar");
		} else {
			System.out.println("Voce escolheu a op��o Verificar Saldo");
		}
		
		teclado.close();
	}

}
