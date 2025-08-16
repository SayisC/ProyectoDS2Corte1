package co.edu.unbosque.model;

public class Biografia extends Publicacion {

	private boolean esAutobiografia;

	public Biografia() {
		// TODO Auto-generated constructor stub
	}

	public Biografia(boolean esAutobiografia) {
		super();
		this.esAutobiografia = esAutobiografia;
	}

	public Biografia(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible, boolean esAutobiografia) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		this.esAutobiografia = esAutobiografia;
	}

	public Biografia(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		// TODO Auto-generated constructor stub
	}

	public boolean isEsAutobiografia() {
		return esAutobiografia;
	}

	public void setEsAutobiografia(boolean esAutobiografia) {
		this.esAutobiografia = esAutobiografia;
	}

	@Override
	public String toString() {
		return super.toString() + "Es una autobiografía? = " + esAutobiografia + "]";
	}
}

