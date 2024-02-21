package mx.org.banxico.cursojava.modulo6;

import java.util.Scanner;

public class Ejercicio4 {

	public static int factorial(int n) {

		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un num: ");
		int numero = scanner.nextInt();

		System.out.println("El factorial de " + numero + " es: " + factorial(numero));

	}
}
