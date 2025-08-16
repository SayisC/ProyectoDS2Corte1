package co.edu.unbosque.model;

public class RecursoElectronico extends Publicacion{
	
	public RecursoElectronico() {
		// TODO Auto-generated constructor stub
	}

	public RecursoElectronico(String titulo, String autor, String formato, String idioma, String fechaPublicacion,
			boolean estaDisponible) {
		super(titulo, autor, formato, idioma, fechaPublicacion, estaDisponible);
	}

	@Override
	public String toString() {
		return super.toString() + "RecursoElectronico ";
	}
	
}
