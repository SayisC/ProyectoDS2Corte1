package co.edu.unbosque.model;

public class LiteratureReview extends Publicacion{

	private boolean esReferenciado;
	
	public LiteratureReview() {
		// TODO Auto-generated constructor stub
	}

	public LiteratureReview(boolean esReferenciado) {
		super();
		this.esReferenciado = esReferenciado;
	}

	public LiteratureReview(String titulo, String autor, String formato, String idioma, int fechaDePublicacion,
			boolean esReferenciado) {
		super(titulo, autor, formato, idioma, fechaDePublicacion);
		this.esReferenciado = esReferenciado;
	}

	public LiteratureReview(String titulo, String autor, String formato, String idioma, int fechaDePublicacion) {
		super(titulo, autor, formato, idioma, fechaDePublicacion);
		// TODO Auto-generated constructor stub
	}

	public boolean isEsReferenciado() {
		return esReferenciado;
	}

	public void setEsReferenciado(boolean esReferenciado) {
		this.esReferenciado = esReferenciado;
	}	
}
