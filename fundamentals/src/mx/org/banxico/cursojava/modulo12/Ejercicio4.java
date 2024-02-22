package mx.org.banxico.cursojava.modulo12;

public class Ejercicio4 {

	public static void main(String[] args) {
		Conexion.abrirConexion();
	}
}

class Conexion {
	
	static void abrirConexion() {
		try {
			int division = 10/ 5;
		} catch (ArithmeticException e) {
			System.out.println("No se pudo establecer la conexion a la BD");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("No se pudo establecer la conexion a la BD");
			e.printStackTrace();
		} finally {
			cerrarConexion();
		}
	}
	
	static void cerrarConexion() {
		System.out.println("Cerrando la conexion a la BD...");
	}
}
