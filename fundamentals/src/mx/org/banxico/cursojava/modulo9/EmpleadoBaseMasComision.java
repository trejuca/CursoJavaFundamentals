package mx.org.banxico.cursojava.modulo9;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

	private double salarioBase;

	
	public EmpleadoBaseMasComision() {
		super();
	}

	
	public EmpleadoBaseMasComision(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	
	public EmpleadoBaseMasComision(double ventasBrutas, double tarifaComision) {
		super(ventasBrutas, tarifaComision);
	}
	
	public EmpleadoBaseMasComision(
			double salarioBase,
			double ventasBrutas, 
			double tarifaComision, 
			String primerNombre,
			String apellidoPaterno, 
			String nss) {
		super(ventasBrutas, tarifaComision, primerNombre, apellidoPaterno, nss);
		this.salarioBase = salarioBase;
	}

	
	@Override
	public double calcularSueldo() {
		return super.calcularSueldo() + salarioBase;
	}


	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
}
