package co.edu.unbosque.model;

public class LiteratureReview extends Publicacion {

	private boolean esReferenciado;

	public LiteratureReview() {
		// TODO Auto-generated constructor stub
	}

	public LiteratureReview(boolean esReferenciado) {
		super();
		this.esReferenciado = esReferenciado;
	}

	public LiteratureReview(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible, boolean esReferenciado) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		this.esReferenciado = esReferenciado;
	}

	public LiteratureReview(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		// TODO Auto-generated constructor stub
	}

	public boolean isEsReferenciado() {
		return esReferenciado;
	}

	public void setEsReferenciado(boolean esReferenciado) {
		this.esReferenciado = esReferenciado;
	}

	@Override
	public String toString() {
		return super.toString() + "Tiene referencias = " + esReferenciado + "]";
	}

}
