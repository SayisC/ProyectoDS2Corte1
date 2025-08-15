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

	public Biografia(String titulo, String autor, String formato, String idioma, int fechaDePublicacion,
			boolean esAutobiografia) {
		super(titulo, autor, formato, idioma, fechaDePublicacion);
		this.esAutobiografia = esAutobiografia;
	}

	public Biografia(String titulo, String autor, String formato, String idioma, int fechaDePublicacion) {
		super(titulo, autor, formato, idioma, fechaDePublicacion);
		// TODO Auto-generated constructor stub
	}

	public boolean isEsAutobiografia() {
		return esAutobiografia;
	}

	public void setEsAutobiografia(boolean esAutobiografia) {
		this.esAutobiografia = esAutobiografia;
	}
}
