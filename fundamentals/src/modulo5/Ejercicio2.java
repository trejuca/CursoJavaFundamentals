package modulo5;

import java.util.Iterator;

public class Ejercicio2 {

	public static void main(String[] args) {

		int factorial = 0;
		int siguiente = 0;
		String salida = "";

		for (int i = 5; i >= 2; i--) {
			salida += String.format("%d x", i);
			factorial = i;
			for (int f = i; f >= 1; f--) {
				siguiente = f - 1;
				if (siguiente > 0) {
					factorial *= siguiente;
					salida += String.format(" %d x", siguiente);
				} else {
					salida = salida.replaceAll(".$", "");
					salida += " = " + factorial;
				}
			}
			salida += "\n";
		}
		System.out.println(salida);
	}
}
