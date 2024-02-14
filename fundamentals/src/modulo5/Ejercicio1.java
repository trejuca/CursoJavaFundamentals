package modulo5;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número de cinco dígitos
        System.out.print("Ingrese un número de cinco dígitos: ");
        int numero = scanner.nextInt();
        
        if (numero >= 10000 && numero <= 99999) {

        	String palindromo = "";
        	
        	while (numero > 0) {
        		palindromo += (numero % 10); 
        		numero /= 10; 
        	}
        	
        	if (Integer.parseInt(palindromo) == numero) {
        		System.out.println("El numero introducido es un palindromo");
        	} else {
        		System.out.println("El numero introducido NO es un palindromo");
        	}
        } else {
        	System.out.println("Numero incorrecto");
        }
	}
}
