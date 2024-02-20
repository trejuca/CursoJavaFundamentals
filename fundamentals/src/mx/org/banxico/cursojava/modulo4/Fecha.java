package mx.org.banxico.cursojava.modulo4;

public class Fecha {

	// Atributos de clase
	private int dia;
	private int mes;
	private int anio;
	
	//Constructores
	public Fecha() {

	}
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}


	// Metodos setter y getter
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		//return "Fecha " + dia + "/" + mes + "/" + anio;
		return String.format("Fecha %d/%d/%d", dia, mes, anio);
	}
	
}
