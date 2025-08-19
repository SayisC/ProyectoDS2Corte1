/**
 * Super clase que representa una publicacion generica en la biblioteca.
 * Contiene los atributos comunes a todas las publicaciones.
 */
package co.edu.unbosque.model;

public class Publicacion {
	
	// Atributos y metodos con sus respectivos Javadoc
    /**
     * Titulo de la publicacion.
     */
	private String titulo;
	
	/**
     * Autor de la publicacion.
     */
	private String autor;
	
	/**
     * Formato en el que esta disponible la publicacion.
     */
	private String formato;
	
	/**
     * Idioma de la publicacion.
     */
	private String idioma;
	
	/**
     * Fecha de publicacion del material.
     */
	private String fechaDePublicacion;
	
	/**
     * Indica si la publicacion está disponible para prestamo.
     */
	private boolean estaDisponible;
	
	
	/**
     * Constructor por defecto de Publicacion.
     */
	public Publicacion() {
		// TODO Auto-generated constructor stub
	}

	
	/**
     * Constructor completo de Publicacion.
     * @param titulo Titulo de la publicacion
     * @param autor Autor de la publicacion
     * @param formato Formato de la publicacion
     * @param idioma Idioma de la publicacion
     * @param fechaDePublicacion Fecha de publicacion
     * @param estaDisponible Disponibilidad de la publicacion
     */
	public Publicacion(String titulo, String autor, String formato, String idioma, String fechaDePublicacion,
			boolean estaDisponible) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.idioma = idioma;
		this.fechaDePublicacion = fechaDePublicacion;
		this.estaDisponible = estaDisponible;
	}

	
	 // Getters y setters
    /**
     * Obtiene el titulo de la publicacion.
     * @return El titulo de la publicacion
     */
	public String getTitulo() {
		return titulo;
	}

	 /**
     * Establece el titulo de la publicacion.
     * @param titulo El nuevo titulo de la publicacion
     */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
     * Obtiene el autor de la publicacion.
     * @return El autor de la publicacion
     */
	public String getAutor() {
		return autor;
	}

	/**
     * Establece el autor de la publicacion.
     * @param autor El nuevo autor de la publicacion
     */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
     * Obtiene el formato de la publicacion.
     * @return El formato de la publicacion
     */
	public String getFormato() {
		return formato;
	}

	/**
     * Establece el formato de la publicacion.
     * @param formato El nuevo formato de la publicacion
     */
	public void setFormato(String formato) {
		this.formato = formato;
	}

	/**
     * Obtiene el idioma de la publicacion.
     * @return El idioma de la publicacion
     */
	public String getIdioma() {
		return idioma;
	}

	/**
     * Establece el formato de la publicacion.
     * @param formato El nuevo formato de la publicacion
     */
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	/**
     * Obtiene la fecha de publicacion del material.
     * @return La fecha de publicacion del material 
     */
	public String getFechaDePublicacion() {
		return fechaDePublicacion;
	}

	/**
     * Establece fecha de publicacion del material.
     * @param fechaDePublicacion La nueva fecha de la publicacion
     */
	public void setFechaDePublicacion(String fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}

	/**
     * Obtiene si el material esta disponible.
     * @return Respuesta de v/f si ahi disponibilidad
     */
	public boolean isEstaDisponible() {
		return estaDisponible;
	}

	/**
     * Establece si hay disponibilidad de la publicacion.
     * @param estaDisponile La nueva disponibilidad de la publicacion
     */
	public void setEstaDisponible(boolean estaDisponible) {
		this.estaDisponible = estaDisponible;
	}

	 /**
     * Representación en String de la publicación.
     * @return Cadena con todos los detalles de la publicación
     */
	@Override
	public String toString() {
		return "El titulo es: " + titulo + ", El autor es = " + autor + ", El formato es: " + formato + ", El idioma es: " + idioma
				+ ", La fecha en la cual se publico el articulo es: " + fechaDePublicacion + ", ¿Esta disponible la publicación? = " + estaDisponible;
	}
	
	

}

