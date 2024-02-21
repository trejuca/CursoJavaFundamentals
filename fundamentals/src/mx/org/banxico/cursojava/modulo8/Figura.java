package mx.org.banxico.cursojava.modulo8;

public abstract class Figura {

	private double area;
	private double perimetro;
	
	public Figura() {
		
	}
	
	public Figura(double area, double perimetro) {
		this.area = area;
		this.perimetro = perimetro;
	}

	public  abstract double calcularArea();
	public abstract double calcularPerimetro();
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	// No seria necesario el metodo toString en Figura
	// ya que la clase esta marcada como Abstract 
//	@Override
//	public String toString() {
//		return "Figura [area=" + area + ", perimetro=" + perimetro + "]";
//	}
	
}
