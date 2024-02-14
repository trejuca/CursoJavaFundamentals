package modulo3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número de cinco dígitos
        System.out.print("Ingrese un número de cinco dígitos: ");
        int numero = scanner.nextInt();

        // Verificar si el número tiene exactamente cinco dígitos
        if (numero >= 10000 && numero <= 99999) {
            // Obtener los dígitos individuales
            int digito1 = numero / 10000;
            int digito2 = (numero % 10000) / 1000;
            int digito3 = (numero % 1000) / 100;
            int digito4 = (numero % 100) / 10;
            int digito5 = numero % 10;

            // Imprimir los dígitos separados por tres espacios
            System.out.printf(
        		"Dígitos separados: %d %d %d %d %d", 
        		digito1, digito2, digito3, digito4, digito5);
        } else {
            System.out.println(
        		"Por favor, ingrese un número de cinco dígitos.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
