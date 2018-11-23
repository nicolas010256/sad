package entity;

public class AreaAtuacao {
	private Area area;
	private Orientador orientador;

	public AreaAtuacao(Area area, Orientador orientador) {
		this.area = area;
		this.orientador = orientador;
	}

	public Area getArea() {
		return area;
	}

	public Orientador getOrientador() {
		return orientador;
	}

}
