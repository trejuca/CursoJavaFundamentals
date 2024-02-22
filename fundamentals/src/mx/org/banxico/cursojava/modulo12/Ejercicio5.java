package mx.org.banxico.cursojava.modulo12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		abrirArchivo("hola.txt");
		/*try {
			abrirArchivo("saludos.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		System.out.println("Hola como estas");
	}
	
	public static void abrirArchivo(String nombreArchivo) 
		throws FileNotFoundException, IOException {
		
		//Trato de abrir el archivo
		FileReader archivo = new FileReader(nombreArchivo);
		
		//Escribo las lineas para leer el archivo
		
		// Trato de cerrar el archivo
		archivo.close();
		//throw new ArithmeticException();
	}
}
