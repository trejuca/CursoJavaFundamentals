package mx.org.banxico.cursojava.modulo6;

import mx.org.banxico.cursojava.modulo4.Estudiante;

public class Ejercicio1 {

	public static void saludar(Estudiante estudiante) {
		estudiante.setCalificacion(5);
		System.out.println(estudiante.getCalificacion());
	}
	public static void main(String[] args) {
		Estudiante juan = new Estudiante();
		juan.setCalificacion(10);
		saludar(juan);
		System.out.println(juan.getCalificacion());
	}
}
