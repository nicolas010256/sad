package entity;

import java.util.ArrayList;
import java.util.List;

public class Mensagem {

	private long id;

	private String conteudo;

	private List<Anexo> anexos = new ArrayList<Anexo>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public List<Anexo> getAnexos() {
		return anexos;
	}

}
