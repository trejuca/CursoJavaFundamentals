package mx.org.banxico.cursojava.modulo12;

/**
 * Crear una excepcion personalizada
 * 
 * @author jc
 *
 */
public class Ejercicio6Exception extends Exception {

	private static final String MENSAJE_DEFAULT = "Este es el mensaje default del Ejercicio 6";
	
	public Ejercicio6Exception() {
		super(MENSAJE_DEFAULT);
	}
	
	public Ejercicio6Exception(String message) {
		super(message);
	}
}
