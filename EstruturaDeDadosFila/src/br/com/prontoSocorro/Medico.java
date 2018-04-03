package br.com.prontoSocorro;

public class Medico {
	String nome;
	String cRM;
	String especialidade;
	String usuario;
	String senha;
	int id;

	Medico(String nome, String cRM, String especialidade, String usuario, String senha, int id) {
		super();
		this.nome = nome;
		this.cRM = cRM;
		this.especialidade = especialidade;
		this.usuario = usuario;
		this.senha = senha;
		this.id = id;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getcRM() {
		return cRM;
	}

	public void setcRM(String cRM) {
		this.cRM = cRM;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getId() {
		return this.id;
	}

}
