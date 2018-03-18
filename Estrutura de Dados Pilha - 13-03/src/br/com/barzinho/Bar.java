
package br.com.barzinho;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.pilha.*;

/**
 * 
 * @author Joubert Joe Vieira Lellis
 * 
 * CRIAR UM SISTEMA DE RESTAURANTE PEDIDOS IMPLEMENTADOS EM UMA PILHA PEDIDOS
 * SERÁ UM OBJETO CONTENDO 'NOME' E 'VALOR'
 * 
 * É PRECISO UM OPERADOR COM :
 * 
 * 1 INSERE PEDIDO
 * 
 * 2 PEDIDO A SER ENTREGUE
 * 
 * 3 FINALIZAR PEDIDO
 * 
 * 4 VERIFICAR QUANTIDADE DE PEDIDOS
 * 
 * 
 */

public class Bar {

	/** Scanner, usado para pegar valores diretamente do Teclado */

	Scanner sc1 = new Scanner(System.in);

	/** Pilha de pedidos. */
	Pilha<Pedidos> pilhaDePedidos = new Pilha<Pedidos>();

	/** Valor bruto de todos os pedidos, até os que foram entrgue. */
	double brutoDaNoite = 0;

	/**
	 * Menu contendo opções do programa.
	 */
	public void menu() {
		System.out.println(
				"\n| - Menu \n| - Opções : \n| - 1 Inserir Pedido:\n| - 2  Conferir Ultimo Pedido:\n| - 3 Ver pilha de peididoss:\n"
						+ "| - 4 Finalizar Pedido:\n| - 5 Soma dos pedidos \n| - 6 ENCERRA \n\n- ESCOLHA SUA OPÇÃO : ");

		try {
			int scannerDoMenu = sc1.nextInt();
			switch (scannerDoMenu) {
			case 1:

				String pedidoString = JOptionPane.showInputDialog("Qual o pedido?");
				Double valorDouble = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor?"));
				brutoDaNoite = brutoDaNoite + valorDouble;
				inserePedido(pedidoString, valorDouble);
				break;

			case 2:
				if (!pilhaDePedidos.estaVazia())
					System.out.println("O último pedido feito foi : " + pedidoASerEntregue().getPedidoFeito() + "\n\n");
				else
					System.out.println("Sem pedidos!");

				menu();
				break;

			case 3:
				if (!pilhaDePedidos.estaVazia())
					System.out.println(pilhaDePedidos.toString());
				else
					System.out.println("Sem pedidos!");

				menu();
				break;

			case 4:
				if (!pilhaDePedidos.estaVazia())
					entregarPedido();
				else
					System.out.println("Sem pedidos!");
				menu();
				break;

			case 5:

				System.out.println("Valor bruto dos pedidos : " + brutoDaNoite);
				menu();
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("| - Selecione uma opção :");
				menu();

			}

		} catch (Exception e) {
			System.out.println(e);
			menu();
		}
		sc1.close();
	}

	/**
	 * Insere pedido na pilha de pedidos.
	 *
	 * @param pedido
	 *            O nome do pedido
	 * @param pedidoValor
	 *            O valor do pedido
	 */
	public void inserePedido(String pedido, double pedidoValor) {

		Pedidos pedidoFeito = new Pedidos(pedido, pedidoValor);
		pilhaDePedidos.empilha(pedidoFeito);
		menu();

	}

	/**
	 * Pedido A ser entregue.
	 *
	 * @return O topo da pilha de pedidos
	 */
	public Pedidos pedidoASerEntregue() {

		return pilhaDePedidos.topo();

	}

	/**
	 * Entregar pedido.
	 * 
	 * Desempilha o pedido e mostra na tela o seu conteúdo.
	 */
	public void entregarPedido() {

		System.out.println("peididos : " + pilhaDePedidos.desempilha() + " entregue!");

	}

}
