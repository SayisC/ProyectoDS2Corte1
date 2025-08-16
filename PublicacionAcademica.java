package co.edu.unbosque.model;

public class PublicacionAcademica extends Publicacion {
	
	private String institucion;
	
	
	public PublicacionAcademica() {
		// TODO Auto-generated constructor stub
	}


	public PublicacionAcademica(String institucion) {
		super();
		this.institucion = institucion;
	}


	public PublicacionAcademica(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible, String institucion) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
		this.institucion = institucion;
	}


	public String getInstitucion() {
		return institucion;
	}


	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}


	@Override
	public String toString() {
		return super.toString() +"PublicacionAcademica [institucion=" + institucion + "]";
	}
	
	
	
	
}

