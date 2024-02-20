package mx.org.banxico.cursojava.modulo5;

public class Ejercicio2 {

	
	public static void main(String[] args) {
	
		// Variable para almacenar el calculo
		int factorial = 0;
		// Variable para almacenar el numero que le sigue
		// factorial - 1
		int siguiente = 0;
		// Variable para almcacenar la salida como cadena
		String salida = "";
		
		for (int i = 5; i >= 2; i--) {
			salida += String.format("%d x", i);
			factorial = i;
			for (int j = i; j >= 1 ; j--) {
				siguiente = j - 1;
				
				if (siguiente > 0) {
					factorial *= siguiente;
					salida += String.format(" %d x", siguiente);
				} else {
					salida = salida.replaceAll(".$", "");
					salida += String.format(" = %d", factorial);
				}
				
			}

			salida += "\n";
//			System.out.println("Factorial de: " + i + 
//					"! : " + factorial);
		}
		System.out.println(salida);
	}
}
