package br.com.estruturadados.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.estruturadados.Contato;
import br.com.estruturadados.Lista;
import br.com.estruturadados.Vetor;
import br.com.estruturadados.VetorObjetos;

public class TesteVetor {

	public static void main(String[] args) {

		/*
		 * Vetor vet = new Vetor(5); try { vet.adiciona("Gotinha");
		 * vet.adiciona("Peninha"); vet.adiciona("TIJOLINHO!!!"); } catch (Exception e)
		 * { e.printStackTrace(); } // System.out.println(vet.tamanho());
		 * System.out.println(vet.toString()); // System.out.println(vet.busca(2));
		 * vet.remove(0); System.out.println(vet.toString());
		 * 
		 */

		VetorObjetos vetor = new VetorObjetos(5);

		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");

		try {
			vetor.adiciona(c1);
			vetor.adiciona(c2);
			vetor.adiciona(c3);
		} catch (Exception e) { // TODO: handle exception

			e.printStackTrace();

		}

	}

}