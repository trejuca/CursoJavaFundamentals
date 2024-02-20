package mx.org.banxico.cursojava.modulo8;

public class Circulo extends FiguraBidimensional {

	private double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	@Override
	public double calcularPerimetro() {
		return Math.PI * 2 * radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", area = " + super.getArea() + ", " +
				"perimetro = " + super.getPerimetro() + "]";
	}
	
}
