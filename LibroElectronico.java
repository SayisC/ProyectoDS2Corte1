package co.edu.unbosque.model;

public class LibroElectronico extends Publicacion{
	
	private int numeroPaginas;
	private String prologo;
	private int tamanioArchivo;
	
	public LibroElectronico() {
		// TODO Auto-generated constructor stub
	}

	public LibroElectronico(int numeroPaginas, String prologo, int tamanioArchivo) {
		super();
		this.numeroPaginas = numeroPaginas;
		this.prologo = prologo;
		this.tamanioArchivo = tamanioArchivo;
	}

	public LibroElectronico(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible, int numeroPaginas, String prologo, int tamanioArchivo) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		this.numeroPaginas = numeroPaginas;
		this.prologo = prologo;
		this.tamanioArchivo = tamanioArchivo;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getPrologo() {
		return prologo;
	}

	public void setPrologo(String prologo) {
		this.prologo = prologo;
	}

	public int getTamanioArchivo() {
		return tamanioArchivo;
	}

	public void setTamanioArchivo(int tamanioArchivo) {
		this.tamanioArchivo = tamanioArchivo;
	}

	@Override
	public String toString() {
		return super.toString() +"LibroElectronico [numeroPaginas=" + numeroPaginas + ", prologo=" + prologo + ", tamanioArchivo="
				+ tamanioArchivo + "]";
	}
	
	
}

