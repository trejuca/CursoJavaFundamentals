package mx.org.banxico.cursojava.modulo11;

import java.util.HashMap;
import java.util.Map;

public class EjerciciosMapas {

	public static void main(String[] args) {
		ejercicio1();
	}
	
	public static void ejercicio1() {
		
		Map<String,String> mapa = new HashMap<>();
		mapa.put("nombre", "Juan");
		mapa.put("apellido", "Trejo");
		mapa.put("edad", "30");
		mapa.put("nombre","Carlos");
		mapa.put("calle","Calle 1");
		mapa.put("colonia","Colonia 1");
		mapa.put("password","hola123");

		
		for(Map.Entry<String, String> entrada: mapa.entrySet()) {
			System.out.println("Clave: " + entrada.getKey() + 
				", valor: " + entrada.getValue());
		}
		System.out.println("-------------------");
		System.out.println();
		
		mapa.remove("password");
		mapa.put("colonia", "20 de noviembre");
		
		for(Map.Entry<String, String> entrada: mapa.entrySet()) {
			System.out.println("Clave: " + entrada.getKey() + 
				", valor: " + entrada.getValue());
		}
	}
}
