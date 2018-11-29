package entity;

public class Mensagem {

	private long id;

	private String conteudo;


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

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}


}
