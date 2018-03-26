package br.com.palindromo;

import javax.swing.JOptionPane;

import br.com.pilha.Pilha;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palindromo = JOptionPane.showInputDialog("Insira a Palavra");
		// Caso de usar frases como 'O romano acata amores a damas amadas e Roma ataca o
		// namoro'
		// A frase deve ser escrita sem espeaços ou acentos
		// assim : "OromanoacataamoresadamasamadaseRomaatacaonamoro"

		try {
			conferePalindromo(palindromo);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro : " + e);
		}

	}

	public static void conferePalindromo(String palavra) {
		StringBuilder teste = new StringBuilder();
		Pilha pilhaPalavra = new Pilha<Character>();

		for (int i = 0; i < palavra.length(); i++) {
			pilhaPalavra.empilha(palavra.charAt(i));

		}
		for (int i = 0; i < palavra.length(); i++) {
			teste.append(pilhaPalavra.desempilha());
		}

		if (teste.toString().equalsIgnoreCase(palavra)) {
			JOptionPane.showMessageDialog(null, palavra.toUpperCase() + " é um Palíndromo!");
		} else {
			JOptionPane.showMessageDialog(null, palavra.toUpperCase() + " não é um Palíndromo");
		}

	}
}