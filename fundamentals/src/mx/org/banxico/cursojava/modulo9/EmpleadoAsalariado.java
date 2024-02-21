package mx.org.banxico.cursojava.modulo9;

public class EmpleadoAsalariado extends Empleado {

	//Atributos
	private double salarioSemanal;
	
	//Contrusctores
	public EmpleadoAsalariado() {
		super();
	}

	public EmpleadoAsalariado(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	public EmpleadoAsalariado(
			double salarioSemanal,
			String primerNombre, 
			String apellidoPaterno, 
			String nss) {
		super(primerNombre, apellidoPaterno, nss);
		this.salarioSemanal = salarioSemanal;
	}

	// Metodos que se van a sobreescribir o implementar
	@Override
	public double calcularSueldo() {
		return salarioSemanal;
	}

//	@Override
//	public double obtenerMontoPago() {
//		return calcularSueldo();
//	}
	
	// Metodos de clase
	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public String toString() {
		return "EmpleadoAsalariado [salarioSemanal=" + salarioSemanal + "]";
	}
	
	@Override
	public boolean equals(Object object) {
		
		//Comparar los objetos
		if (this == object) {
			return false;
		}
		
		// Verificar si el objeto como argumento no es nulo
		// y que sea una instancia de la misma clase
		if (object == null || this.getClass() != object.getClass()) {
			return false;
		}
		
		// Comparar cada una de las propiedades
		EmpleadoAsalariado ea = (EmpleadoAsalariado)object;
		
		return ea.getPrimerNombre().equals(this.getPrimerNombre()) && 
				ea.getApellidoPaterno().equals(this.getApellidoPaterno()) &&
				ea.getNss().equals(this.getNss()) &&
				ea.getSalarioSemanal() == this.getSalarioSemanal();

	}
}
