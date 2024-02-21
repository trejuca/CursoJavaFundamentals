package mx.org.banxico.cursojava.modulo4;

import java.util.Comparator;

// Javabeans
// POJOs (Plain Old Java Object)
// Entity
public class Estudiante implements Comparator<Estudiante> {

	public static final String NOMBRE_ESCUELA = "Escuela 5 de Mayo";
	
	String matricula;
	String nombre;
	String primerApellido;
	int edad;
	int calificacion;
	// Composicion - Un Estudiante "tiene una" Materia
	Materia materias;
	
	
	// Es un metodo para poder
	// inicializar el objeto
	public Estudiante() {
		
	}
	
	public Estudiante(
			String matricula, 
			String nombre, 
			String primerApellido, 
			int edad, 
			int calificacion) {

		this.matricula = matricula;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.edad = edad;
		this.calificacion = calificacion;
	}


	public int calcularCalificacion() {
		// Se hace un casteo de un valor 
		// double a un valor entero; es decir,
		// se crea una copia
		return (int)(Math.random() * 10);
	}
	
	public int calcularCalificacion(int numeroMaterias) {
		// Se hace un casteo de un valor 
		// double a un valor entero; es decir,
		// se crea una copia
		return (int)(Math.random() * 10) / numeroMaterias;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	@Override
	public String toString() {
		return "Estudiante [matricula=" + matricula + ", nombre=" + nombre + ", primerApellido=" + primerApellido
				+ ", edad=" + edad + ", calificacion=" + calificacion + "]";
	}
	public String toString(String algo) {
		return "Estudiante [matricula=" + matricula + ", nombre=" + nombre + ", primerApellido=" + primerApellido
				+ ", edad=" + edad + ", calificacion=" + calificacion + "]";
	}

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		
		int porCalificacion = Integer.compare(o1.getCalificacion(), o2.getCalificacion());
		
		if (porCalificacion == 0) {
			return o1.getNombre().compareTo(o2.getNombre());
		}
		return porCalificacion;
	}
}
