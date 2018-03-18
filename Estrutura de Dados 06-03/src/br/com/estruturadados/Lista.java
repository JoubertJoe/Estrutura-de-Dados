
package br.com.estruturadados;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *@author Joubert Joe Vieira Lellis
 */

/**
 * The Class Lista.
 * 
 * The list is one type of structure that can be used to add any type of
 * objects.
 * 
 * A lista é um tipo de estrutura que pode ser usada para adicionar qualquer
 * tipo de objeto.
 *
 * @param <T>
 *            the generic type
 * 
 *            O tipo Genérico.
 */
public class Lista<T> {

	/**
	 * The elements of the array
	 * 
	 * Os elementos do Vetor.
	 */
	private T[] elementos;

	/**
	 * The Size of the array.
	 * 
	 * O tamanho do Vetor.
	 */
	private int tamanho;

	/**
	 * Instantiates a new List.
	 *
	 * Instancia uma nova Lista
	 * 
	 * @param capacidade
	 *            the capacity of the new list (Uses Size)
	 * 
	 *            A capacidade da nova lista (A partir do tamanho)
	 */
	public Lista(int capacidade) {
		elementos = (T[]) new Object[capacidade];
		tamanho = 0;
	}

	/**
	 * Method overload
	 * 
	 * Sobrecarga de método
	 * 
	 * Instantiates a new list.
	 * 
	 * Instancia uma nova Lista.
	 * 
	 * @param capcidade
	 *            the capcity
	 * 
	 *            A capacidade
	 * @param tipoClasse
	 *            the tipe of the class.
	 * 
	 *            O tipo da classe.
	 */
	public Lista(int capcidade, Class<T> tipoClasse) {
		elementos = (T[]) Array.newInstance(tipoClasse, capcidade);

	}

	/**
	 * Adiciona.
	 * 
	 * Add one elemento into the List
	 * 
	 * Adiciona um elemento dentro da lista.
	 *
	 * @param elemento
	 *            the element inside the List.
	 * 
	 *            O elemtndo dentro da lista.
	 * @throws Exception
	 *             the exception : List is full.
	 * 
	 *             exceção : A lista está cheia.
	 */
	public void adiciona(T elemento) throws Exception {
		// aumentaCapacidade();
		if (tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
		} else {
			throw new Exception("Lista já está cheia (Overflow)");
		}
	}

	/**
	 * Adiciona.
	 *
	 * Method overload.
	 *
	 * Sobrecarga de método.
	 * 
	 * Add one elemento into the List
	 * 
	 * Adiciona um elemento dentro da lista.
	 *
	 * @param posicao
	 *            the position where will be added.
	 * 
	 *            A posição onde vai ser adicionado.
	 * 
	 * @param elemento
	 * 
	 *            the element to be added
	 * 
	 * 
	 *            O elemento a ser adicionado
	 * @throws Exception
	 *             the exception when position is invalid.
	 * 
	 *             A exceção quando a posição for inválida.
	 */
	public void adiciona(int posicao, T elemento) throws Exception {
		// aumentaCapacidade();
		if (!(posicao >= 0 && posicao <= tamanho)) {
			throw new IllegalArgumentException("Posicao inválida");
		}
		for (int i = tamanho - 1; i >= posicao; i--) {
			elementos[i + 1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;
	}

	/**
	 * Tamanho da Lista.
	 * 
	 * Size of the List.
	 *
	 * @return the size in Integer.
	 */
	public int tamanho() {
		return this.tamanho;
	}

	/**
	 * Show the elements in String Type
	 * 
	 * Mostra os elementos em tipo String.
	 * 
	 * Output in String
	 * 
	 * Saída em String
	 */
	public String toString() {
		return Arrays.toString(elementos);
	}

	/**
	 * Busca.
	 * 
	 * Search any element inside the List.
	 * 
	 * Busca qualquer elemento dentro da Lista.
	 *
	 * @param posicao
	 *            the position.
	 * 
	 *            A posição.
	 * @return the t
	 * 
	 *         Generic Type
	 * 
	 *         Tipo Genérico
	 */
	public T busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao inválida");
		}
		return elementos[posicao];
	}
	/*
	 * private void aumentaCapacidade() { if (tamanho == elementos.length) { T[]
	 * elementosNovos = new T[elementos.length * 2]; for (int i = 0; i <
	 * elementos.length; i++) { elementosNovos[i] = elementos[i]; } elementos =
	 * elementosNovos; } }
	 */

	/**
	 * Removes the element inside the List.
	 * 
	 * Reomve um elemento dentro da Lista
	 *
	 * @param posicao
	 *            the position of the element to be removed.
	 * 
	 *            A posição do elemento a ser removido.
	 * 
	 */
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		for (int i = posicao; i < tamanho; i++) {
			elementos[i] = elementos[i + 1];
		}
		tamanho--;
	}

	/**
	 * Increment the capacity of the List.
	 * 
	 * Aumenta capacidade da lista.
	 * 
	 * 
	 */
	private void aumentaCpacidade() {
		if (tamanho == elementos.length) {
			T[] elementosNovos = (T[]) Array.newInstance(elementos.getClass(), elementos.length * 2);
			for (int i = 0; i < elementos.length; i++) {
				elementosNovos[i] = elementos[i];
			}
			elementos = elementosNovos;
		}
	}

}
