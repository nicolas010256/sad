package entity;

import java.util.ArrayList;
import java.util.List;

public class Atividade {

	private long id;

	private String titulo;

	private String descricao;

	private String status;

	private Trabalho trabalho;

	private List<Mensagem> mensagens = new ArrayList<Mensagem>();

	public Atividade(long id, String titulo, String descricao, String status) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.status = status;
	}

	public Atividade(String titulo, String descricao, String status) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public Trabalho getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(Trabalho trabalho) {
		this.trabalho = trabalho;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescticao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public void setMensagens(List<Mensagem> mensagens) {
		this.mensagens = mensagens;
	}

}
