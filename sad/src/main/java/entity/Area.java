package entity;

public class Area {

	private long id;

	private String nome;

	public Area (long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Area(String nome) {
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
