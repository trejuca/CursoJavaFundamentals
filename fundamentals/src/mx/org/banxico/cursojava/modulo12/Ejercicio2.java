package mx.org.banxico.cursojava.modulo12;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		try {
			System.out.println("Antes de lanzar la excepcion");
			throw new ArithmeticException();
		} catch (Exception e) {
			System.out.println("Excepcion atrapada");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Continua el programa");
	}
}
