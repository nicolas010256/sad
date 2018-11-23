package entity;

import java.util.ArrayList;
import java.util.List;

public class Orientador {

	private long id;

	private String nome;

	private String email;

	private String senha;

	private byte[] foto;

	private List<Trabalho> trabalhos = new ArrayList<Trabalho>();
	
	private List<AreaAtuacao> areasAtuacao =  new ArrayList<AreaAtuacao>();

	public Orientador(long id, String email, String senha, String nome) {
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
	}

	public Orientador(String email, String senha, String nome) {
		this.email = email;
		this.senha = senha;
		this.nome = nome;
	}

	public long getId() {
		return id;
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

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public List<AreaAtuacao> getAreasAtuacao() {
		return areasAtuacao;
	}

	public void setAreasAtuacao(List<AreaAtuacao> areaAtuacao) {
		this.areasAtuacao = areaAtuacao;
	}

	public List<Trabalho> getTrabalhos() {
		return trabalhos;
	}

	public void setTrabalhos(List<Trabalho> trabalhos) {
		this.trabalhos = trabalhos;
	}

}