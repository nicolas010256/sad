package entity;

public class Aluno {

	private long id;

	private String nome;

	private String email;

	private String senha;

	private byte[] foto;

	private float notaTG1;

	private float notaTG2;

	private Trabalho trabalho;

	private Curso curso;

	public Aluno(String email, String senha, String nome) {
		this.email = email;
		this.senha = senha;
		this.nome = nome;
	}

	public Aluno(long id, String email, String senha, String nome) {
		this.id = id;
		this.email = email;
		this.senha = senha;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public float getNotaTG1() {
		return notaTG1;
	}
	
	public void setNotaTG1(float notaTG1) {
		this.notaTG1 = notaTG1;
	}
	
	public float getNotaTG2() {
		return notaTG2;
	}

	public void setNotaTG2(float notaTG2) {
		this.notaTG2 = notaTG2;
	}

	public Trabalho getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(Trabalho trabalho) {
		this.trabalho = trabalho;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
