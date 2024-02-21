package mx.org.banxico.cursojava.modulo9;

import java.util.Objects;

public class EmpleadoPorComision extends Empleado {

	private double ventasBrutas;
	private double tarifaComision;
	
	public EmpleadoPorComision() {
		super();
	}

	public EmpleadoPorComision(double ventasBrutas, double tarifaComision) {
		this.ventasBrutas = ventasBrutas;
		this.tarifaComision = tarifaComision;
	}

	
	public EmpleadoPorComision(
			double ventasBrutas, 
			double tarifaComision,
			String primerNombre, 
			String apellidoPaterno, 
			String nss) {
		super(primerNombre, apellidoPaterno, nss);
		this.ventasBrutas = ventasBrutas;
		this.tarifaComision = tarifaComision;
	}

	@Override
	public double calcularSueldo() {
		return tarifaComision * ventasBrutas;
	}
	
//	@Override
//	public double obtenerMontoPago() {
//		return calcularSueldo();
//	}
	
	public double getVentasBrutas() {
		return ventasBrutas;
	}
	public void setVentasBrutas(double ventasBrutas) {
		this.ventasBrutas = ventasBrutas;
	}
	public double getTarifaComision() {
		return tarifaComision;
	}
	public void setTarifaComision(double tarifaComision) {
		this.tarifaComision = tarifaComision;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tarifaComision, ventasBrutas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpleadoPorComision other = (EmpleadoPorComision) obj;
		return Double.doubleToLongBits(tarifaComision) == Double.doubleToLongBits(other.tarifaComision)
				&& Double.doubleToLongBits(ventasBrutas) == Double.doubleToLongBits(other.ventasBrutas);
	}
	
	
}
