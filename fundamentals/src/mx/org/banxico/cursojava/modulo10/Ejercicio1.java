package mx.org.banxico.cursojava.modulo10;

import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int x[] = {1, 5, 6, 9, 10, 10, 11};

		System.out.println(busquedaBinaria(x, 0, x.length - 1, 1));
	}
	
	public static int busquedaBinaria(
			int arreglo[], 
			int inicioArreglo, 
			int finArreglo, 
			int numBusqueda){
		
        if (finArreglo >= inicioArreglo) {
        	//calculo mitad arreglo
        	//0+(6-0)
            int mitad = inicioArreglo + (finArreglo - inicioArreglo) / 2;
            //comparo si el elemento de la mitad es el numbusq
            if (arreglo[mitad] == numBusqueda) {
                return mitad;
            }//comparo si el elemento mitad es mayor a numbusq, para saber a que rango del arreglo voy
            else if (arreglo[mitad] > numBusqueda) {
            	//busco del lado/rango izquierdo
                return busquedaBinaria(arreglo, inicioArreglo, mitad - 1, numBusqueda);
            }else {
            	//busco rango derecho
            	return busquedaBinaria(arreglo, mitad + 1, finArreglo, numBusqueda);
            }
        }
        return -1;
    }
	
	public static void ordenar() {
		
		int arreglo[] = {6,5,1,2,3,4};
		int comparacionesTotales = 0;
		boolean hayPermutacion = false;
		
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length - (i + 1); j++) {
				if (arreglo[j] > arreglo[j + 1]) {
					int temp = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = temp;
					hayPermutacion = true;
				}
				comparacionesTotales++;
			}

			System.out.println(Arrays.toString(arreglo) + 
					", Comparaciones: " + comparacionesTotales);
			comparacionesTotales = 0;
			
			if (!hayPermutacion) {
				break;
			}
			hayPermutacion = false;
		}
	}
}
