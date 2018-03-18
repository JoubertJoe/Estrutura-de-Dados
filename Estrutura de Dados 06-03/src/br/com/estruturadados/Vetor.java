
package br.com.estruturadados;

import java.util.Arrays;
/**
 * 
 * @author Joubert 
 *
 */

public class Vetor {

	private String[] elementos;
	int tamanho;

	public Vetor(int capacidade) {

		this.elementos = new String[capacidade];
		this.tamanho = 0;

	}

	/**
	 * Método responsável por inserir um novo elemento na ultima posição.
	 * 
	 * @param elemento
	 * @throws Exception
	 *             O Vetor está cheio!
	 */
	public void adiciona(String elemento) throws Exception {
		aumentaCapacidade();
		if (tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
		} else {
			throw new Exception("Vetor já está cheio");
		}
	}

	public void adiciona(int posicao, String elemento) throws Exception {
		aumentaCapacidade();
		if (!(posicao >= 0 && posicao <= tamanho)) {
			throw new IllegalArgumentException("Posicao inválida");
		}
		for (int i = tamanho - 1; i >= posicao; i--) {
			elementos[i + 1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;
	}

	public int tamanho() {
		return this.tamanho;
	}

	public String toString() {
		return Arrays.toString(elementos);
	}

	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao inválida");
		}
		return elementos[posicao];
	}

	private void aumentaCapacidade() {
		if (tamanho == elementos.length) {
			String[] elementosNovos = new String[elementos.length * 2];
			for (int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = elementos[i];
			}
			elementos = elementosNovos;
		}
	}

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		for (int i = posicao; i < tamanho; i++) {
			elementos[i] = elementos[i + 1];
		}
		tamanho--;
	}

}