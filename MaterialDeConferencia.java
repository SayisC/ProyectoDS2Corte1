package co.edu.unbosque.model;

public class MaterialDeConferencia extends Publicacion{

	// Atributos
	private int numeroAudiencia;
	private int duracion;

	public MaterialDeConferencia() {
		// TODO Auto-generated constructor stub
	}

	public MaterialDeConferencia(int numeroAudiencia, int duracion) {
		super();
		this.numeroAudiencia = numeroAudiencia;
		this.duracion = duracion;
	}

	public MaterialDeConferencia(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible, int numeroAudiencia, int duracion) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		this.numeroAudiencia = numeroAudiencia;
		this.duracion = duracion;
	}

	public MaterialDeConferencia(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		// TODO Auto-generated constructor stub
	}

	public int getNumeroAudiencia() {
		return numeroAudiencia;
	}

	public void setNumeroAudiencia(int numeroAudiencia) {
		this.numeroAudiencia = numeroAudiencia;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "MaterialDeConferencia [numeroAudiencia=" + numeroAudiencia + ", duracion=" + duracion + "]";
	}
}
