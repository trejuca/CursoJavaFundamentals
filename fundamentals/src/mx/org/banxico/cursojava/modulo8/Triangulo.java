package mx.org.banxico.cursojava.modulo8;

public class Triangulo extends FiguraBidimensional {

	private double base;
	private double altura;
	//private double hipotenusa;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}	
	
	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}
	@Override
	public double calcularPerimetro() {
		return (3 * base);
	}
	@Override
	public String toString() {
		return "Triangulo [base=" + base + 
					", altura=" + altura + 
					", area = " + super.getArea() + 
					", perimetro = " + super.getPerimetro() + "]";
	}
}
