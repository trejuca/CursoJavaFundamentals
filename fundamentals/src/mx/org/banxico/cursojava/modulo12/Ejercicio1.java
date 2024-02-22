package mx.org.banxico.cursojava.modulo12;

public class Ejercicio1 {

	public static void main(String[] args) {
		try {
			dividirPorCero();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	
	public static int metodo1() {
		return metodo2();
	}
	
	public static int metodo2() {
		return metodo3();
	}
	
	public static int metodo3() {
		return dividirPorCero();
	}
	public static int dividirPorCero() {
		return 1 / 0;
	}
}
