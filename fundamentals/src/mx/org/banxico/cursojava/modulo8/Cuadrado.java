package mx.org.banxico.cursojava.modulo8;

public class Cuadrado extends FiguraBidimensional {

	private double lado;

	
	public Cuadrado() {
		super();
	}

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public Cuadrado(double lado, double area, double perimetro) {
		super(area, perimetro);
		this.lado = lado;
	}


	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public double calcularPerimetro() {
		return 4 * lado;
	}
	
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", area = " + super.getArea() + ", " +
				"perimetro = " + super.getPerimetro() + "]";
	}
}
