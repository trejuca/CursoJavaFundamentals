package mx.org.banxico.cursojava.modulo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import mx.org.banxico.cursojava.modulo4.Estudiante;
import mx.org.banxico.cursojava.modulo9.EmpleadoAsalariado;
import mx.org.banxico.cursojava.modulo9.PorPagar;

public class EjerciciosLista {

	public static void main(String[] args) {
		ejercicio7();
	}
	
	public static void ejercicio8() {
		
		List<EmpleadoAsalariado> empleados = new ArrayList<>();
		
		empleados.add(new EmpleadoAsalariado(100,"Juan", "Trejo", "ABCD"));
		empleados.add(new EmpleadoAsalariado(200,"Zamara", "Hernandez", "ABCD"));
		empleados.add(new EmpleadoAsalariado(300,"Laura", "Rosales", "ABCD"));
		empleados.add(new EmpleadoAsalariado(400,"Pablo", "Luna", "ABCD"));
		
		
		Collections.sort(empleados, new Comparator<EmpleadoAsalariado>() {
			public int compare(EmpleadoAsalariado o1, EmpleadoAsalariado o2) {
				return o1.getPrimerNombre().compareTo(
						o2.getPrimerNombre());
			}
		});
		
		for(EmpleadoAsalariado asalariado: empleados) {
			System.out.println(asalariado.getPrimerNombre());
		}
	}
	
	/**
	 * Ordenar la lista de objetos de tipo Estudiante 
	 * de manera ascendente y descendente
	 */
	public static void ejercicio7() {
		
		// Crear la lista
		List<Estudiante> estudiantes = new ArrayList<>();
		// Crear los objetos estudiante
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Juan");
		estudiante1.setCalificacion(5);
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Pedro");
		estudiante2.setCalificacion(10);
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setNombre("Pablo");
		estudiante3.setCalificacion(9);
		Estudiante estudiante4 = new Estudiante();
		estudiante4.setNombre("Laura");
		estudiante4.setCalificacion(6);
		Estudiante estudiante5 = new Estudiante();
		estudiante5.setNombre("Brenda");
		estudiante5.setCalificacion(6);
		Estudiante estudiante6 = new Estudiante();
		estudiante6.setNombre("Brenda");
		estudiante6.setCalificacion(10);
		Estudiante estudiante7 = new Estudiante();
		estudiante7.setNombre("Zamara");
		estudiante7.setCalificacion(6);
		
		// Agregar los objetos a la lista
		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);
		estudiantes.add(estudiante3);
		estudiantes.add(estudiante4);
		estudiantes.add(estudiante5);
		estudiantes.add(estudiante6);
		estudiantes.add(estudiante7);
		
		Collections.sort(estudiantes, new Estudiante());
		
		for(Estudiante estudiante: estudiantes) {
			System.out.println(estudiante);
		}
	}
	/*
	 * Ordenar la lista de elementos de tipo String
	 */
	public static void ejercicio5() {
		
		List<String> nombres = new ArrayList<>();
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Paco");
		nombres.add("Juan");
		nombres.add("Lalo");
		nombres.add("Laura");
		nombres.add("Zamara");
		
		// Ordenar la lista de valores en forma descendente
		//Collections.sort(nombres, Collections.reverseOrder());;
		Collections.reverse(nombres);
		System.out.println(nombres);
	}
	
	/**
	 * Cambiar y obtener elementos de la lista por 
	 * medio de su indice
	 */
	public static void ejercicio4() {
		
		List<Estudiante> estudiantes = new ArrayList<>();
		// Crear los objetos estudiante
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Juan");
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Pedro");

		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);
		
		// Actualizar los objetos de la lista
		for(Estudiante estudiante: estudiantes) {
			estudiante.setNombre("Nombre cambiado");
		}
		
		// Actualizar los objetos en la lista
		Estudiante reemplazo = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			reemplazo = new Estudiante();
			reemplazo.setCalificacion(5);
			reemplazo.setNombre("Estudiante reemplazado");
			
			estudiantes.set(i, reemplazo);
		}
		
		System.out.println(estudiantes);
	}
	
	/**
	 * Crear una lista de objetos de tipo Estudiante 
	 * e iterar la lista
	 */
	public static void ejercicio2() {
		// Crear la lista
		List<Estudiante> estudiantes = new ArrayList<>();
		// Crear los objetos estudiante
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Juan");
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Pedro");
		Estudiante estudiante3 = new Estudiante();
		estudiante3.setNombre("Pablo");
		Estudiante estudiante4 = new Estudiante();
		estudiante4.setNombre("Laura");
		// Agregar los objetos a la lista
		estudiantes.add(estudiante1);
		estudiantes.add(estudiante2);
		estudiantes.add(estudiante3);
		estudiantes.add(estudiante4);
		// Iterar sobre la lista
		for(Estudiante estudiante: estudiantes) {
			//System.out.println(estudiante.getNombre());
		}
		// Ejercicio 3 Convertir la lista de tipo Estudiante a String.
		// automaticamente se manda a llamar el metodo toString
		System.out.println(estudiantes);
	}
	
	/**
	 * Crear una lista de objetos tipo String 
	 * e iterar la lista
	 */
	public static void ejercicio1() {
		
		//estereotipo <>
		List<String> nombres = new ArrayList<>();
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Paco");
		nombres.add("Juan");
		
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println("Nombre: " + nombres.get(i));
		}
		
		for(String nombre: nombres) {
			System.out.println("Nombre: " + nombre);
		}
	}
	

}
