package entity;

public class Referencia {

	private long id;

	private String referencia;

	private String tipo;

	Trabalho trabalho;

	public Referencia(long id, String referencia, String tipo){
		this.id = id;
		this.referencia = referencia;
		this.tipo = tipo;
	}

	public Referencia(String referencia, String tipo){
		this.referencia = referencia;
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Trabalho getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(Trabalho trabalho) {
		this.trabalho = trabalho;
	}

}
