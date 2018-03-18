/*
 * 
 */
package br.com.barzinho;

// TODO: Auto-generated Javadoc
/**
 *  @author Joubert Joe Vieira Lellis
 * Classe peidos onde são armazenados o nome o valor dos pedidos feitos em um
 * bar.
 */
public class Pedidos {

	/** O pedido feito. */
	String pedidoFeito;

	/** O preço. */
	double preco;

	/**
	 * Instancia um novo pedido.
	 *
	 * @param pedidoFeito
	 *            O pedido feito
	 * @param preco
	 *            O preço
	 */
	Pedidos(String pedidoFeito, double preco) {
		super();
		this.pedidoFeito = pedidoFeito;
		this.preco = preco;
	}

	/**
	 * Gets O pedido feito.
	 *
	 * @return O pedido feito
	 */
	public String getPedidoFeito() {
		return pedidoFeito;
	}

	/**
	 * Define o pedido feito.
	 *
	 * @param pedidoFeito
	 *            O new pedido feito
	 */
	public void setPedidoFeito(String pedidoFeito) {
		this.pedidoFeito = pedidoFeito;
	}

	/**
	 * retorna o preco.
	 *
	 * @return O preco
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * Define o preco.
	 *
	 * @param preco
	 *            O novo preco
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}

	/**
	 * Sobrescrita do método toString para imprimir em Pedidos e Valores (sem isso o
	 * método imprimiria o objeto como um valor de memória)
	 */
	public String toString() {
		return ("Pedido : " + getPedidoFeito() + " Preço : " + getPreco());
	}
}
