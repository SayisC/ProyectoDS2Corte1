package co.edu.unbosque.model;

public class Tesis extends Publicacion {

	private String facultad;
	private String universidad;
	private String grado;

	public Tesis() {

	}

	public Tesis(String facultad, String universidad, String grado) {
		super();
		this.facultad = facultad;
		this.universidad = universidad;
		this.grado = grado;
	}

	public Tesis(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible, String facultad, String universidad, String grado) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		this.facultad = facultad;
		this.universidad = universidad;
		this.grado = grado;
	}

	public Tesis(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		// TODO Auto-generated constructor stub
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	@Override
	public String toString() {
		return super.toString() + "Tesis [facultad=" + facultad + ", universidad=" + universidad + ", grado=" + grado
				+ "]";
	}

}
