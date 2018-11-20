package entity;

public class Area {

	private long id;

	private String nome;

	private String descricao;

	public Area (long id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Area(String nome, String descricao) {
		this.nome = nome;
		this.setDescricao(descricao);
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
