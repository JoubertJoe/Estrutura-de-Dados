package br.com.prontoSocorro;

public class Paciente {

	String nome;
	String email;
	double temperatura;
	double pressao;
	int prioridade;
	int id;

	Paciente(String nome, String email, double temperatura, double pressao, int prioridade, int id) {
		super();
		this.nome = nome;
		this.email = email;
		this.temperatura = temperatura;
		this.pressao = pressao;
		this.prioridade = prioridade;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getPressao() {
		return pressao;
	}

	public void setPressao(double pressao) {
		this.pressao = pressao;
	}

	public String getCorPrioridade() {
		if (this.prioridade == 0) {
			return "AZUL";
		} else if (this.prioridade == 1) {
			return "VERDE";
		}
		if (this.prioridade == 2) {
			return "AMARELO";
		} else
			return "VERMELHO";

	}

	public int getPrioridade() {
		return this.prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public int getId() {
		return this.id;
	}

	/**
	 * Sobrescrita do método toString para imprimir em Pedidos e Valores (sem isso o
	 * método imprimiria o objeto como um valor de memória)
	 */
	public String toString() {
		return ("|Nome: " + this.getNome() + "| Email: " + this.getEmail() + "| Temperatura: " + this.getTemperatura()
				+ "| Pressão: " + this.getPressao() + "| Prioridade: " + this.getCorPrioridade() + "| Id: "
				+ this.getId() + "|");
	}
}
