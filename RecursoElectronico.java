/**
 * Interfaz que define el comportamiento de los recursos electrónicos en la biblioteca.
 * Todos los recursos electrónicos deben implementar esta interfaz.
 */
package co.edu.unbosque.model;

public interface RecursoElectronico {
    
    /**
     * Constante que indica que el recurso está digitalizado.
     */
    public final boolean ESTA_DIGITAL = true;
    
    /**
     * Método para acceder al recurso electrónico.
     * @param estaDisponible Indica si el recurso está disponible para acceso por medio de url
     * @return Mensaje con la información de acceso o denegación
     */
    public String acceder(boolean estaDisponible);
}
