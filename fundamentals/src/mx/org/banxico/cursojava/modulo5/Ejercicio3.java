package mx.org.banxico.cursojava.modulo5;

import java.util.Scanner;

import mx.org.banxico.cursojava.modulo4.Estudiante;

/**
 * 
 * Implementar un programa que permita crear diez objetos Estudiante e 
 * imprimir el promedio de la clase. (30 min)


• Implementar un programa que permita crear objetos Estudiante hasta 
que el usuario teclee un numero negativo e imprima el promedio de la 
clase.

• Contar el número de resultados de estudiantes.

• Mostrar un resumen de los resultados de los estudiantes, indicando el 
número de estudiantes que aprobaron y el número de estudiantes que 
reprobaron.

• Si más de ocho estudiantes aprobaron el examen, imprimir el mensaje 
Aumentar la colegiatura
 * 
 * @author jc
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Estudiante estudiante = null;
		int centinela = 0;
		int contador = 0;
		int estudiantesAprobaron = 0;
		int estudiantesReprobaron = 0;
		int acumulado = 0;
		
		while(centinela >= 0) {
			
			estudiante = new Estudiante();
			estudiante.setCalificacion(estudiante.calcularCalificacion());
			
			acumulado += estudiante.getCalificacion();
			contador++;
			
			if (estudiante.getCalificacion() >= 6) {
				estudiantesAprobaron++;
			} else {
				estudiantesReprobaron++;
			}
				
				
			Scanner scanner = new Scanner(System.in);
			System.out.println("Introduce un numero negativo para terminar: ");
			centinela = scanner.nextInt();
		}
		
		
		System.out.println("Se evaluaron: " + contador + " estudiantes");
		System.out.println("Aprobaron " + estudiantesAprobaron);
		System.out.println("Reprobaron " + estudiantesReprobaron);
		
		if (estudiantesAprobaron > 8) {
			System.out.println("Aprobaron mas de 8 estudiantes. Aumentar colegiatura.");
		}
		System.out.println("El promedio de la clase es: " + (acumulado / contador));
	}
}
