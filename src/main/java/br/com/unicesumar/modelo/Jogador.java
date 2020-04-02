package br.com.unicesumar.modelo;

public class Jogador {

	private Long id;
	private String nome;
	private int senha;

	public Jogador() {
		super();

	}


	public Jogador(Long id, String nome, int senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
