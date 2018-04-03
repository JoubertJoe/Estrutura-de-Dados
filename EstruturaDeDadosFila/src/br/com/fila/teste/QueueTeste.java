package br.com.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTeste {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList();
		
		fila.add(3);
		fila.add(2);
		fila.add(1);
		
		System.out.println(fila);
		
		fila.remove();
		
		System.out.println(fila);
		
		System.out.println(fila.peek());

	}

}
