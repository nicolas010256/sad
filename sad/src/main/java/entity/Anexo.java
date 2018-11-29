package entity;

public class Anexo {

	private long id;

	private byte[] arquivo;

	private String tipo;

	public Anexo(long id, byte[] arquivo, String tipo) {
		this.id = id;
		this.arquivo = arquivo;
		this.tipo = tipo;
	}

	public Anexo(byte[] arquivo, String tipo) {
		this.arquivo = arquivo;
		this.tipo = tipo;
	} 

	public long getId() {
		return id;
	}

	public byte[] getArquivo() {
		return arquivo;
	}

	public void setArquivo(byte[] arquivo) {
		this.arquivo = arquivo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}