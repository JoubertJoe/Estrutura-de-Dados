package br.com.fila;

public class NovoFila<T> extends EstruturaEstatica<T> {

	public NovoFila(int capacidade) {
		super(capacidade);
	}

	public NovoFila() {
	}

	public void enfileira(T elemento) {
		super.adiciona(elemento);
	}

	public void enfileira(T elemento, int posicao) {
		super.adiciona(posicao, elemento);
	}

	public T espiar() {
		if (this.estaVazia()) {
			return null;
		}
		return elementos[0];
	}

	public T desinfileira() {
		if (this.estaVazia()) {
			return null;
		}
		T objetoRemovido = this.elementos[0];
		this.remove(0);
		return objetoRemovido;
	}

}
