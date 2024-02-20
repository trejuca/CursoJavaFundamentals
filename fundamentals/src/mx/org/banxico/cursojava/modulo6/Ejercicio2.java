package mx.org.banxico.cursojava.modulo6;

public class Ejercicio2 {

	public void imprimir(int x) {
		System.out.println(x);
		if (x > 0) {
			imprimir(x - 1);
		}
		return;
	}
	
	public static void main(String[] args) {
		Ejercicio2 dos = new Ejercicio2();
		dos.imprimir(10);
	}
}
