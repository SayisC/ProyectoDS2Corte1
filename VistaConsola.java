.package co.edu.unbosque.view;
import java.util.Scanner;
public class Consola {

	// NO CAMBIAR CONSOLA
		private Scanner sc;
		
		public Consola () {
			sc = new Scanner(System.in);
		}
		
		public byte leerByte() {
			return sc.nextByte();
		}
		public short leerShort () {
			return sc.nextShort();
		}
		public int leerNumeroEntero() {
			return sc.nextInt();	
		}
		public float leerFlotante() {
			return sc.nextFloat();	
		}
		public double leerDoble() {
			return sc.nextDouble();	
		}
		public long leerLong() {
			return sc.nextLong();	
		}
		public char leerChar() {
			return sc.next().charAt(0);
		}
		public boolean leerBooleano() {
			String entrada = leerLineaCompleta();
			if (entrada.toLowerCase().contains("si") || entrada.toLowerCase().contains("Si")) {
				return true;
			}else {
				return false;
			}
		}
		public String leerLineaCompleta() {
			return sc.nextLine();
		}
		public String leerPalabra() {
			return sc.next();
		}
		public void escribirLineaConSalto(String texto) {
			System.out.println(texto);
		}
		public void escribirLineaSinSalto(String texto) {
			System.out.print(texto);
		}
		public void quemarLinea() {
			sc.nextLine();
		}


}
