package mx.org.banxico.cursojava.modulo12;

public class Ejercicio6Main {

	public static void main(String[] args) {
		
		try {
			probarExcepcion();
		} catch (Ejercicio6Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void probarExcepcion() throws Ejercicio6Exception {
		throw new Ejercicio6Exception("Este mensaje es modificado");
	}
}
