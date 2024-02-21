package mx.org.banxico.cursojava.modulo6;

import java.util.Scanner;

public class Ejercicio3 {
	public static int generaNumAleatorio() {

		return (int) (Math.random() * 1000);

	}

	public static void main(String[] args) {

		int juego = 1;

		while (juego == 1) {

			int numero = generaNumAleatorio();
			int intento = 0;
			int contador = 0; // contador de intentos

			// System.out.println("num aleatorio: " + numero);
			while (numero != intento) {

				Scanner scanner = new Scanner(System.in);
				System.out.println("Adivina el num: ");
				intento = scanner.nextInt();

				if (intento > numero) {
					System.out.println("Demasiado alto");

				} else {
					System.out.println("Demasiado bajo");
				}
				contador++;
			}

			System.out.println("Felicidades, adivinaste en: " + contador + " intentos");
			Scanner scannerJuego = new Scanner(System.in);
			System.out.println("Quieres volver a jugar?: (1:si / otro:no)");
			juego = scannerJuego.nextInt();

		}
		System.out.println("Juego finalizado, vuelve pronto");
	}
}
