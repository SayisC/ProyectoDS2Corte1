package co.edu.unbosque.model;

public class Critica extends Publicacion {

	private String queSeCritica;
	private float calificacion;

	public Critica() {
		super();
	}

	public Critica(String queSeCritica, float calificacion) {
		super();
		this.queSeCritica = queSeCritica;
		this.calificacion = calificacion;
	}
	public Critica(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible, String queSeCritica, float calificacion) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		this.queSeCritica = queSeCritica;
		this.calificacion = calificacion;
	}
	
	public Critica(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		// TODO Auto-generated constructor stub
	}
	
	public String getQueSeCritica() {
		return queSeCritica;
	}
	public void setQueSeCritica(String queSeCritica) {
		this.queSeCritica = queSeCritica;
	}
	public float getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Critica [queSeCritica=" + queSeCritica + ", calificacion=" + calificacion + "]";
	}
	
	
}

