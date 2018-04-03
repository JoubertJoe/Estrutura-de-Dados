package br.com.prontoSocorro;

import javax.swing.JOptionPane;

public class TesteProntoSocorro {
	static ProntoSocorro pAN = new ProntoSocorro();

	private static void menu() {

		int opcao = Integer
				.parseInt(JOptionPane.showInputDialog("|\tMENU :\n|\t1- Cadastro de Pacientes\n|\t2- Ver Clientese"));
		if (opcao != 0) {
			switch (opcao) {
			case 1:
				pAN.CadastroDePacientes();

				break;
			case 2:
				pAN.verFila();

			default:
				menu();
				break;
			}

		}
		menu();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		// pAN.cadastroDeMedicos();

	}

}
