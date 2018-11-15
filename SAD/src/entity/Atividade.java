package entity;

import java.util.ArrayList;
import java.util.List;

public class Atividade {

	private long id;

	private String titulo;

	private String descricao;

	private String status;

	private List<Mensagem> mensagens = new ArrayList<Mensagem>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

}
