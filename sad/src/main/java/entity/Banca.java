package entity;

import java.util.Date;

public class Banca {

	private long id;

	private Date dataHorario;

	private String local;

	private float nota;

	public Banca(long id, Date dataHorario, String local, float nota) {
		this.id = id;
		this.dataHorario = dataHorario;
		this.local = local;
		this.nota = nota;
	}

	public Banca(Date dataHorario, String local, float nota) {
		this.dataHorario = dataHorario;
		this.local = local;
		this.nota = nota;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataHorario() {
		return dataHorario;
	}

	public void setDataHorario(Date dataHorario) {
		this.dataHorario = dataHorario;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

}
