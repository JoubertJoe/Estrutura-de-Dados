package br.com.pilha.teste;

import br.com.pilha.Pilha;

public class Teste {

	public static void main(String[] args) {
		int tamanhoPilha = 10;
		Pilha<Integer> pilha = new Pilha<Integer>(tamanhoPilha);
		System.out.println("| - EMPILHANDO : ");
		
		for (int i = 0; i < tamanhoPilha; i++) {
			pilha.empilha(i);
		//	System.out.println(pilha.topo());

		}
		
		System.out.println(pilha.toString());
		
		
		System.out.println("| - DESEMPILHANDO : ");
		for (int i = 0; i < 10; i++) {

			pilha.desempilha();
			System.out.println(pilha.topo());
			
			

		}
	}

		
}





