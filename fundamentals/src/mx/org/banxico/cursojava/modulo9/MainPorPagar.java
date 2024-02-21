package mx.org.banxico.cursojava.modulo9;

public class MainPorPagar {

	public static void main(String[] args) {
		
		PorPagar empleadoAsalariado = new EmpleadoAsalariado(
				100000.0, "Juan", "Trejo", "1234");
		
		// No se puede usar el metodo setSalarioSemanal
		// por que no existe en la interfaz PorPagar
		//empleadoAsalariado.setSalarioSemanal(100);
		
		System.out.println(empleadoAsalariado.obtenerMontoPago());
	}
}
