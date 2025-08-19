/**
 * Clase que representa una biografía en la biblioteca.
 * Extiende de Publicacion y añade información específica de biografías.
 */
package co.edu.unbosque.model;

public class Biografia extends Publicacion {

    /**
     * Indica si la biografía es una autobiografía (escrita por el mismo personaje).
     */
    private boolean esAutobiografia;

    /**
     * Constructor por defecto de Biografia.
     */
    public Biografia() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Constructor básico de Biografia.
     * @param esAutobiografia Indica si es autobiografía
     */
    public Biografia(boolean esAutobiografia) {
        super();
        this.esAutobiografia = esAutobiografia;
    }

    /**
     * Constructor completo de Biografia.
     * @param titulo Título de la biografía
     * @param autor Autor de la biografía
     * @param formato Formato de la biografía
     * @param idioma Idioma de la biografía
     * @param fechaDePublicacion Fecha de publicación
     * @param estaDisponible Disponibilidad de la biografía
     * @param esAutobiografia Indica si es autobiografía
     */
    public Biografia(String titulo, String autor, String formato, String idioma, String fechaDePublicacion,
            boolean estaDisponible, boolean esAutobiografia) {
        super(titulo, autor, formato, idioma, fechaDePublicacion, estaDisponible);
        this.esAutobiografia = esAutobiografia;
    }

    /**
     * Constructor alternativo de Biografia.
     * @param titulo Título de la biografía
     * @param autor Autor de la biografía
     * @param formato Formato de la biografía
     * @param idioma Idioma de la biografía
     * @param fechaDePublicacion Fecha de publicación
     * @param estaDisponible Disponibilidad de la biografía
     */
    public Biografia(String titulo, String autor, String formato, String idioma, String fechaDePublicacion,
            boolean estaDisponible) {
        super(titulo, autor, formato, idioma, fechaDePublicacion, estaDisponible);
        // TODO Auto-generated constructor stub
    }

    /**
     * Verifica si la biografía es autobiográfica.
     * @return true si es autobiografía, false en caso contrario
     */
    public boolean isEsAutobiografia() {
        return esAutobiografia;
    }

    /**
     * Establece si la biografía es autobiográfica.
     * @param esAutobiografia true para indicar que es autobiografía
     */
    public void setEsAutobiografia(boolean esAutobiografia) {
        this.esAutobiografia = esAutobiografia;
    }

    /**
     * Representación en String de la biografía.
     * @return Cadena con todos los detalles de la biografía
     */
    @Override
    public String toString() {
        return super.toString() + " + ¿Es una autobiografía?: " + esAutobiografia;
    }
}
