package br.com.fila.teste;

import br.com.fila.Fila;

public class Teste {

	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		fila.enfileira(3);
		fila.enfileira(1);
		fila.enfileira(2);
		
		System.out.println(fila);
		fila.desinfileira();
		fila.enfileira(4);
		fila.enfileira(5);
		fila.desinfileira();
		fila.desinfileira();
		
		/*System.out.println(fila.espiar());
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		
		System.out.println(fila);*/

	}

}
