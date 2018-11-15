package entity;

import java.util.ArrayList;
import java.util.List;

public class Trabalho {

	private long id;

	private String tema;

	private String titulo;

	private String metodologia;

	private String relevancia;

	private List<Aluno> alunos = new ArrayList<Aluno>();

	private TipoTrabalho tipoTrabalho;

	private List<Referencia> referencias = new ArrayList<Referencia>();

	private Orientador orientador;

	private List<Atividade> atividades = new ArrayList<Atividade>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public Orientador getOrientador() {
		return orientador;
	}

	public void setOrientador(Orientador orientador) {
		this.orientador = orientador;
	}

	public List<Referencia> getReferencias() {
		return referencias;
	}

	public void setTipoTrabalho(TipoTrabalho tipoTrabalho) {
		this.tipoTrabalho = tipoTrabalho;
	}

	public TipoTrabalho getTipoTrabalho() {
		return tipoTrabalho;
	}
	
	public List<Atividade> getAtividades() {
		return atividades;
	}

}
