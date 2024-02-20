package mx.org.banxico.cursojava.modulo8;

public class MainFigura {

	public static void main(String[] args) {
		
		Figura figura = new Figura();
		figura.setArea(0.0);
		figura.setPerimetro(0.0);
		System.out.println("####### Figura #######");
		System.out.println("Area: " + figura.calcularArea());
		System.out.println("Perimetro: " + figura.calcularPerimetro());
		System.out.println();
		
		//Shift + Alt + R
		//Cuadrado
		Cuadrado cuadrado = new Cuadrado();
		cuadrado.setLado(1.5);
		System.out.println("####### Cuadrado #######");
		System.out.println("Area: " + cuadrado.calcularArea());
		System.out.println("Perimetro: " + cuadrado.calcularPerimetro());
		System.out.println();
		
		//Circulo
		Circulo circulo = new Circulo();
		circulo.setRadio(3.9);
		System.out.println("####### Circulo #######");
		System.out.println("Area: " + circulo.calcularArea());
		System.out.println("Perimetro: " + circulo.calcularPerimetro());
		System.out.println();
		
		//Triangulo
		Triangulo triangulo = new Triangulo();
		triangulo.setBase(1.7);
		triangulo.setAltura(5.8);
		System.out.println("####### Triangulo #######");
		System.out.println("Area: " + triangulo.calcularArea());
		System.out.println("Perimetro: " + triangulo.calcularPerimetro());
		System.out.println();
	}
}
