package mx.org.banxico.cursojava.modulo9;

public abstract class Empleado implements PorPagar {

	private String primerNombre;
	private String apellidoPaterno;
	private String nss;	
	
	public Empleado() {
		super();
	}

	public Empleado(String primerNombre, String apellidoPaterno, String nss) {
		super();
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.nss = nss;
	}
	
	protected abstract double calcularSueldo();
	
	@Override
	public double obtenerMontoPago() {
		return calcularSueldo();
	}
	
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getNss() {
		return nss;
	}
	public void setNss(String nss) {
		this.nss = nss;
	}
}
