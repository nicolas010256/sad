package entity;

import java.util.Date;

public class Trabalho {

	private long id;

	private String tema;

	private String titulo;

	private String metodologia;

	private String relevancia;

	private byte[] arquivo;

	private Date data_criacao;


	public Trabalho(String tema, String titulo, String metodologia, String relevancia, Date data_criacao) {
		this.tema = tema;
		this.titulo = titulo;
		this.metodologia = metodologia;
		this.relevancia = relevancia;
		this.data_criacao = data_criacao;
	}

	public Trabalho(long id, String tema, String titulo, String metodologia, String relevancia, Date data_criacao) {
		this.id = id;
		this.tema = tema;
		this.titulo = titulo;
		this.metodologia = metodologia;
		this.relevancia = relevancia;
		this.data_criacao = data_criacao;
	}

	public long getId() {
		return id;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMetodologia() {
		return metodologia;
	}

	public void setMetodologia(String metodologia) {
		this.metodologia = metodologia;
	}

	public String getRelevancia() {
		return relevancia;
	}

	public void setRelevancia(String relevancia) {
		this.relevancia = relevancia;
	}

	public void setArquivo(byte[] arquivo){
		this.arquivo = arquivo;
	}

	public byte[] getArquivo(){
		return arquivo;
	}

	public Date getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}
}
