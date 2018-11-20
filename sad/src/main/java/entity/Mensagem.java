package entity;

import java.util.ArrayList;
import java.util.List;

public class Mensagem {

	private long id;

	private String conteudo;

	private List<Anexo> anexos = new ArrayList<Anexo>();

	private Atividade atividade;

	public Mensagem (long id, String conteudo){
		this.id = id;
		this.conteudo = conteudo;
	}

	public Mensagem (String conteudo){
		this.conteudo = conteudo;
	}

	public long getId() {
		return id;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
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
