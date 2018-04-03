package br.com.fila;

public class Fila<T> extends EstruturaEstatica<T> {
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	
	public Fila() {}
	
	public void enfileira(T elemento) {
		super.adiciona(elemento);
	}
	
	public T espiar() {
		if(this.estaVazia()) {
			return null;
		}
		return elementos[0];
	}
	
	public T desinfileira() {
		if(this.estaVazia()) {
			return null;
		}
		T objetoRemovido = this.elementos[0];
		this.remove(0);
		return objetoRemovido;
	}
	
	
}
