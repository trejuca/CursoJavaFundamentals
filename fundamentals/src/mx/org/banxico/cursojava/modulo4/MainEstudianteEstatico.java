package mx.org.banxico.cursojava.modulo4;

public class MainEstudianteEstatico {

	public static void main(String[] args) {
		
		Estudiante juan = new Estudiante();
		Estudiante pedro = new Estudiante();
		Estudiante pablo = new Estudiante();
		
		System.out.println(Estudiante.NOMBRE_ESCUELA);

	}
}
