package mx.org.banxico.cursojava.modulo9;

import mx.org.banxico.cursojava.modulo4.Estudiante;

public class MainEquals {

	public static void main(String[] args) {
		
//		String valor1 = new String("hola2");
//		String valor2 = new String("hola2");
//		
//		// Comparan los objetos, no el contenido
//		System.out.println((valor1 == valor2));
//		// Con el metodo equals se comparan contenidos
//		System.out.println((valor1.equals(valor2)));
		
		
		EmpleadoAsalariado empleado1 = new EmpleadoAsalariado(
				100.00, "Juan", "Trejo", "ABCD");
		
		EmpleadoAsalariado empleado2 = new EmpleadoAsalariado(
				100.00, "Juan", "Trejo", "ABCD");
		
		
		// Comparan los objetos, no el contenido
		// System.out.println((empleado1 == empleado2));
		// Con el metodo equals se comparan contenidos
		System.out.println((empleado1.equals(empleado2)));
		
	}
}
