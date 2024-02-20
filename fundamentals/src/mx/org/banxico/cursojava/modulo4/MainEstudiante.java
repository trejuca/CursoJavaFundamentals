package mx.org.banxico.cursojava.modulo4;


public class MainEstudiante {

	public static void main(String[] args) {
		
		
		// Creando o instanciando
		// un objeto de tipo Estudiante
		Estudiante juan = new Estudiante(
				"XYZ","Pablo","Perez",20,10);
		
		Estudiante pedro = new Estudiante(
				"XYZ","Pedro","Perez",20,10);
		
//		juan.setMatricula("ZDER");
//		juan.setEdad(20);
//		juan.setPrimerApellido("Trejo");
//		juan.setNombre("Juan");
//		juan.setCalificacion(juan.calcularCalificacion());
		
		System.out.println(juan);
		System.out.println(pedro);
		
	}
}
