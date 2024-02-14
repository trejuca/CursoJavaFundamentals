package modulo4;

public class PruebaEstudiante {

	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setId(1);
		estudiante1.setNombre("Juan");
		estudiante1.setPrimerApellido("Perez");
		estudiante1.setSegundoApellido("Gonzales");
		
		// Imprimir a el estado del objeto estudiante
		System.out.println(estudiante1.toString());
		// Calcular e imprimir el promedio del estudiante
		System.out.println(estudiante1.calcularPromedio(125, 20));
	}
}
