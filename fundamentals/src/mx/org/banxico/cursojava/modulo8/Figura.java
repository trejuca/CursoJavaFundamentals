package mx.org.banxico.cursojava.modulo8;

public class Figura {

	private double area;
	private double perimetro;
	
	public double calcularArea() {
		return 0.0;
	}
	
	public double calcularPerimetro() {
		return 0.0;
	}
	
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

	@Override
	public String toString() {
		return "Figura [area=" + area + ", perimetro=" + perimetro + "]";
	}
	
}
