package br.com.estruturadados.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.estruturadados.Contato;
import br.com.estruturadados.Lista;

public class TesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Contato> lista = new ArrayList<Contato>();

		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");
		lista.add(c1);
		lista.add(0, c1);
		lista.add(c3);

		System.out.println(lista);
		System.out.println(lista.size());

		// lista.remove(c1);
		// lista.remove(0);
		// lista.get(0);
		// System.out.println(lista.toString());
		// System.out.println(lista.size());
		// System.out.println(lista.isEmpty());

		for (Contato contato : lista) {
			System.out.println(contato);
		}
		// ---------------------------------Lista
		System.out.println("\n\nLista : ");

		// Lista list = new Lista<String>(10);
			Lista joeList = new Lista<>(10);

		try {

			joeList.adiciona("I'm the father of your death");
			joeList.adiciona("I bring forth the ancient evil");
			joeList.adiciona("I control his every breath");
			joeList.adiciona("I instigate your misfortune");
			joeList.adiciona("With the birth of killing trolls");
			joeList.adiciona("I awaken armageddon");
			joeList.adiciona("Feeding on a thousand souls");
			joeList.adiciona("Awaken");
			joeList.adiciona("Awaken");
			joeList.adiciona(666);

			System.out.println("Busca : Elemento posição 02 : [" + joeList.busca(2).toString() + "]");

			System.out.println("Elementos contidos na joeLista :\n" + joeList.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
