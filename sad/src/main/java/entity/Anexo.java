package entity;

public class Anexo {

	private long id;

	private byte[] arquivo;

	private String nome;

	private String tipo;

	public Anexo(long id, String nome, String tipo) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
	}

	public Anexo(String nome, String tipo, byte[] arquivo) {
		this.arquivo = arquivo;
		this.nome = nome;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}