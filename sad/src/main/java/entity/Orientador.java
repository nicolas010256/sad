package entity;

import java.util.ArrayList;
import java.util.List;

public class Orientador {

	private long id;

	private String nome;

	private String email;

	private String senha;

	private List<Trabalho> trabalhos = new ArrayList<Trabalho>();
	
	private List<AreaAtuacao> areasAtuacao =  new ArrayList<AreaAtuacao>();

	public Orientador(String email, String senha, String nome) {
		this.email = email;
		this.senha = senha;
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<AreaAtuacao> getAreasAtuacao() {
		return areasAtuacao;
	}

	public List<Trabalho> getTrabalhos() {
		return trabalhos;
	}

}
