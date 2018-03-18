/*
 * 
 */
package br.com.estruturadados;

import java.util.Arrays;

public class VetorObjetos {

	private Object[] elementos;
	private int tamanho;

	public VetorObjetos(int capacidade) {
		elementos = new Object[capacidade];
		tamanho = 0;
	}

	// outros métodos

	public void adiciona(Object elemento) throws Exception {
		aumentaCapacidade();
		if (tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
		} else {
			throw new Exception("Vetor já está cheio");
		}
	}

	public void adiciona(int posicao, Object elemento) throws Exception {
		aumentaCapacidade();
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao inválida");
		}
		for (int i = tamanho - 1; i >= posicao; i--) {
			elementos[i + 1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;
	}

	private void aumentaCapacidade() {
		if (tamanho == elementos.length) {
			Object[] elementosNovos = new Object[elementos.length * 2];
			for (int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = elementos[i];
			}
			elementos = elementosNovos;
		}
	}

	public String toString() {
		return Arrays.toString(elementos);
	}

	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao inválida");
		}
		return elementos[posicao];
	}

}
