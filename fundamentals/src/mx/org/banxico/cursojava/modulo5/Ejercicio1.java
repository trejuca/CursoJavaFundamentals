package mx.org.banxico.cursojava.modulo5;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero de 5 digitos: ");
		int numero = scanner.nextInt();
		int temp = numero;
		
		// && AND logico
		// || OR logico
		if (numero >= 10000 && numero <= 99999) {
			
			String palindromo = "";
			
			//12345
			while(numero > 0) {
				palindromo += numero % 10;
				numero /= 10;
			}
			// If normal
//			if (Integer.parseInt(palindromo) == temp) {
//				System.out.println("El numero intorducido es un palindromo");
//			} else {
//				System.out.println("El numero introducido NO es un palindromo");
//			}
			
			// If ternario / If reducido
			String mensaje = (Integer.parseInt(palindromo) == temp)
					? "El numero es un palindromo"
					: "El numero NOOOO es un palindromo";
			
			System.out.println(mensaje);
			
		} else {
			System.out.println("El numero introducido no es valido.");
		}
	}
}
