package br.com.prontoSocorro;

import javax.swing.JOptionPane;

import br.com.fila.Fila;
import br.com.fila.NovoFila;

public class ProntoSocorro {
	/*
	 * Ultilizar a FILA para controlar a entrada de Paciente
	 * 
	 * Lembrando da Prioridade do atendimento(condição)
	 * 
	 * AZUL < Verde < Amarelo < Vermelho
	 * 
	 * Visão do médico > Chamar Paciente > Imprimir fila de atendimento
	 * 
	 * 
	 *
	 */

	NovoFila<Paciente> filaDeAtendimento = new NovoFila<Paciente>();
	Fila<Medico> filaDeMedicos = new Fila<Medico>();

	void cadastroDeMedicos() {
		JOptionPane.showMessageDialog(null, "Registro de Medicos :");
		String nomeMedico = JOptionPane.showInputDialog("Insira o nome do Médico");

		String cRM = JOptionPane.showInputDialog("Insira o CRM do Médico");

		String especialidade = JOptionPane.showInputDialog("Insira a especialidade do Médico");

		String usuario = JOptionPane.showInputDialog("Insira o Usuario do Médico");

		String senha = JOptionPane.showInputDialog("Insira a senha do Médico");

		Medico novoMedico = new Medico(nomeMedico, cRM, especialidade, usuario, senha, filaDeMedicos.tamanho() + 1);

		filaDeMedicos.enfileira(novoMedico);
		JOptionPane.showMessageDialog(null,
				"Médico " + novoMedico.getNome() + "criado\nNúmero de ID = " + novoMedico.getId());

	}

	void CadastroDePacientes() {

		JOptionPane.showMessageDialog(null, "Registro de Pacientes :");
		String nomePaciente = JOptionPane.showInputDialog("Insira o nome do Paciente");
		String email = JOptionPane.showInputDialog("Insira o email do Paciente");
		try {
			double temperatura = (Double.parseDouble(JOptionPane.showInputDialog("Insira a temperatura do Paciente")));
			double pressao = (Double.parseDouble(JOptionPane.showInputDialog("Insira a pressão arterial do Paciente")));
			int prioridade = (Integer.parseInt(JOptionPane.showInputDialog(
					"Insira a prioridade do paciente :\n1 - AZUL\n2 - Verde\n3 - Amaerlo\n4 - Vermelho ")));
			Paciente novoPaciente = new Paciente(nomePaciente, email, temperatura, pressao, prioridade,
					filaDeAtendimento.tamanho() + 1);
			if (!filaDeAtendimento.estaVazia()) {
				addListaEspera(novoPaciente);
			} else {
				filaDeAtendimento.enfileira(novoPaciente);
			}

			verFila();
			JOptionPane.showMessageDialog(null,
					"Paciente " + novoPaciente.getNome() + "criado\nNúmero de ID = " + novoPaciente.getId());

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, " Erro : " + e + "\n Tente registrar novamente");

		}

	}

	void addListaEspera(Paciente paciente) {

		if (!(filaDeAtendimento.espiar() == paciente)) {
			if ((paciente.getPrioridade() <= filaDeAtendimento.espiar().getPrioridade())) {
				filaDeAtendimento.enfileira(paciente);

			} else {
				int i = filaDeAtendimento.tamanho() - 1;
				do {
					if (paciente.prioridade < filaDeAtendimento.espiar().getPrioridade()) {
						filaDeAtendimento.desinfileira();
					} else {
						filaDeAtendimento.enfileira(paciente, i);
					}
					i--;
				} while (paciente.prioridade > filaDeAtendimento.espiar().getPrioridade());

			}
		} else {

		}
	}

	void verFila() {
		JOptionPane.showMessageDialog(null, filaDeAtendimento.toString());

	}

	void chamarPaciente() {

	}
}
