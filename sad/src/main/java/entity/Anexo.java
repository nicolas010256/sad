package entity;

public class Anexo {

	private long id;

	private String local;

	private String tipo;

	public Anexo(long id, String local, String tipo) {
		this.id = id;
		this.local = local;
		this.tipo = tipo;
	}

	public Anexo(String local, String tipo) {
		this.local = local;
		this.tipo = tipo;
	} 

	public long getId() {
		return id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}