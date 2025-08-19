Aquí está el código con el JavaDoc completo:

```java
package co.edu.unbosque.view;

import java.util.Scanner;

/**
 * Clase que proporciona métodos para interactuar con la consola,
 * permitiendo la lectura de diferentes tipos de datos y la escritura de mensajes.
 */
public class Consola {

	private Scanner sc;
	
	/**
	 * Constructor que inicializa el objeto Scanner para leer la entrada estándar.
	 */
	public Consola() {
		sc = new Scanner(System.in);
	}
	
	/**
	 * Lee un número entero desde la consola.
	 * @return El valor entero leído.
	 */
	public int leerEntero() {
		return sc.nextInt();
	}
	
	/**
	 * Lee un número flotante desde la consola.
	 * @return El valor flotante leído.
	 */
	public float leerFlotante() {
		return sc.nextFloat();
	}
	
	/**
	 * Lee un número double desde la consola.
	 * @return El valor double leído.
	 */
	public double leerDoble() {
		return sc.nextDouble();
	}
	
	/**
	 * Lee un número long desde la consola.
	 * @return El valor long leído.
	 */
	public long leerLargo() {
		return sc.nextLong();
	}
	
	/**
	 * Lee una línea completa de texto desde la consola.
	 * @return La línea de texto leída.
	 */
	public String leerLineaEntera() {
		return sc.nextLine();
	}
	
	/**
	 * Lee una palabra desde la consola (hasta encontrar un espacio o salto de línea).
	 * @return La palabra leída.
	 */
	public String leerPalabra() {
		return sc.next();
	}
	
	/**
	 * Lee un solo carácter desde la consola.
	 * @return El primer carácter de la siguiente entrada.
	 */
	public char leerLetra() {
		return sc.next().charAt(0);
	}
	
	/**
	 * Escribe una línea de texto en la consola con salto de línea al final.
	 * @param texto El texto a escribir.
	 */
	public void escribirLineaConSalto(String texto) {
		System.out.println(texto);
	}
	
	/**
	 * Escribe una línea de texto en la consola sin salto de línea al final.
	 * @param texto El texto a escribir.
	 */
	public void escribirLineaSinSalto(String texto) {
		System.out.print(texto);
	}
	
	/**
	 * Descarta el resto de la línea actual en el buffer de entrada.
	 * Útil para limpiar el buffer después de leer datos numéricos.
	 */
	public void quemarLinea() {
		sc.nextLine();
	}
	
	/**
	 * Lee un valor booleano desde la consola.
	 * Considera "si" (case insensitive) como true, cualquier otra entrada como false.
	 * @return true si la entrada contiene "si", false en caso contrario.
	 */
	public boolean leerBooleano() {
		String entrada = leerLineaEntera();
		if (entrada.toLowerCase().contains("si")) {
			return true;
		} else return false;
	}
}
