package mx.org.banxico.cursojava.modulo8;

public class FiguraBidimensional extends Figura {

	@Override
	public String toString() {
		return "FiguraBidimensional [area = " + super.calcularArea() + ", " +
				"perimetro = " + super.getPerimetro() + "]";
	}

}
