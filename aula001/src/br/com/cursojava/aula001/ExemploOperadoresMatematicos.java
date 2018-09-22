package br.com.cursojava.aula001;

public class ExemploOperadoresMatematicos {
	
	public static void main(String[] args){
		
		int numero1 = 10;
		int numero2 = 2;
		int numero3 = 3;
		double numero4 = 3;
		
		//print f é impressão formatada, ex %d é quando quer imprimir um valor inteiro decimal, %f é flutuante (real)
		// Precisa de 3 parametros, cada virgula indica um parametro
		
		System.out.printf("%d + %d = %d \n", numero1, numero2, numero1 + numero2);
		System.out.printf("%d - %d = %d \n", numero1, numero2, numero1 - numero2);
		System.out.printf("%d * %d = %d \n", numero1, numero3, numero1 * numero3);
		System.out.printf("%d / %d = %d \n", numero1, numero3, numero1 / numero3);
		System.out.printf("%d / %f = %f \n", numero1, numero4, numero1 / numero4);
		System.out.printf("%d %% %d = %d \n", numero1, numero3, numero1 % numero3);
		System.out.printf("++ %d = %d \n", numero1, ++numero1);
		System.out.printf("-- %d = %d \n", numero1, --numero1);
	}
}
