package co.edu.unbosque.model;

public class Libro extends Publicacion {

	private int numPaginas;
	private String edicion;
	private String prologo;
	
	public Libro() {
		super();
	}

	public Libro(int numPaginas, String edicion, String prologo) {
		super();
		this.numPaginas = numPaginas;
		this.edicion = edicion;
		this.prologo = prologo;
	}
	public Libro(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible, int numPaginas, String edicion, String prologo) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		this.numPaginas = numPaginas;
		this.edicion = edicion;
		this.prologo = prologo;
	}
	
	public Libro(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		// TODO Auto-generated constructor stub
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getPrologo() {
		return prologo;
	}
	public void setPrologo(String prologo) {
		this.prologo = prologo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Libro [numPaginas=" + numPaginas + ", edicion=" + edicion + ", prologo=" + prologo + "]";
	}
	
	
}
