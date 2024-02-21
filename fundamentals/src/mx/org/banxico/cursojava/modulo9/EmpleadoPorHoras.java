package mx.org.banxico.cursojava.modulo9;

public class EmpleadoPorHoras extends Empleado {

	private double sueldo;
	private int horas;
	
	
	public EmpleadoPorHoras() {
		super();
	}

	public EmpleadoPorHoras(double sueldo, int horas) {
		this.sueldo = sueldo;
		this.horas = horas;
	}

	
	public EmpleadoPorHoras(
			double sueldo, 
			int horas,
			String primerNombre, 
			String apellidoPaterno, 
			String nss) {
		super(primerNombre, apellidoPaterno, nss);
		this.sueldo = sueldo;
		this.horas = horas;
	}

	@Override
	public double calcularSueldo() {
		if (horas <= 40) {
			return sueldo * horas;
		} else if (horas > 40) {
			return 40 * sueldo + (horas - 40) *  sueldo * 1.5;
		} else {
			return 0.0;
		}
	}
	
//	@Override
//	public double obtenerMontoPago() {
//		return calcularSueldo();
//	}
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
}
