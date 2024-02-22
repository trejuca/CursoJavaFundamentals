package mx.org.banxico.cursojava.modulo12;

public class Ejercicio3 {

	public static void main(String[] args) {
		try {
			Lanza.lanzaExcepcion();
		} catch (Exception e) {
			System.out.println("Se atrapa la excepcion en la clase Ejercicio3");
			e.printStackTrace();
		}
	}
}

class Lanza {
	
	static void lanzaExcepcion() {
		try {
			int division = 10/ 0;
		} catch (Exception e) {
			System.out.println("Se atrapa la excepcion el la clase Lanza");
			e.printStackTrace();
			throw e;
		}
	}
}