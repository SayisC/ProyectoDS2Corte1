package co.edu.unbosque.model;

public class Video extends Publicacion {

	private String duracion;
	private boolean tieneSubtitulos;

	public Video() {
		// TODO Auto-generated constructor stub
	}

	public Video(String duracion, boolean tieneSubtitulos) {
		super();
		this.duracion = duracion;
		this.tieneSubtitulos = tieneSubtitulos;
	}
	
	public Video(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible, String duracion, boolean tieneSubtitulos) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		this.duracion = duracion;
		this.tieneSubtitulos = tieneSubtitulos;
	}

	public Video(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		// TODO Auto-generated constructor stub
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public boolean isTieneSubtitulos() {
		return tieneSubtitulos;
	}

	public void setTieneSubtitulos(boolean tieneSubtitulos) {
		this.tieneSubtitulos = tieneSubtitulos;
	}

	@Override
	public String toString() {
		return super.toString() + " Cuanto dura el video? = " + duracion + ", Tiene subtitulos? = " + tieneSubtitulos + "]";
	}

	
}

