package br.com.cursojava.aula002;

public class ExemploBoxUnbox {
	
	public static void main(String[] args) {
		
		//box: tenho um primitivo e vou apontar numa ref do tipo obj
		//unbox: � processo contrario, qdo preciso pegar o valor primitivo dentro do obj e executar uma fun��o dentro dele
		
		
		//pr� java 5
		int numero = 10;
		Integer wrapper = new Integer(numero);
		int num = wrapper.intValue();
		num++;
		wrapper = new Integer(num);
		
		//p�s java 5
		
		int numero2 = 10;
		Integer wrapper2 = numero2;
		wrapper2++;
	

	}

}
