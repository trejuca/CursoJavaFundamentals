package modulo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modulo4.Estudiante;

public class Colecciones {
    public static void main(String[] args) {

    }
    
    public static void ejercicio6() {
        List<String> listaNombres = new ArrayList();
        listaNombres.add("Juan");
        listaNombres.add("Pedro");
        listaNombres.add("Pablo");
        listaNombres.add("Paco");
        
        for (int i = 0; i < listaNombres.size(); i++) {
            System.err.println("Clave: " + i + ", Valor: " + listaNombres.get(i));
        }
    }
    
    public static void ejercicio1() {
        
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Juan");
        listaNombres.add("Pedro");
        listaNombres.add("Pablo");
        listaNombres.add("Paco");
        
        for (int i = 0; i < listaNombres.size(); i++) {
            System.err.println("Nombre: " + listaNombres.get(i));
        }   
        
        //Ejercicio 5
        //Collections.sort(listaNombres, Collections.reverseOrder());
        Collections.reverse(listaNombres);
        System.err.println("--------------------------");
        
        for (int i = 0; i < listaNombres.size(); i++) {
            System.err.println("Nombre: " + listaNombres.get(i));
        }    
    }
    
    public static void ejercicio2() {
        
        List<Estudiante> estudiantes = new ArrayList();
        
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Maria");
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Laura");
        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Lorena");
        Estudiante estudiante4 = new Estudiante();
        estudiante4.setNombre("Vanessa");
        
        estudiantes.add(estudiante1); //0
        estudiantes.add(estudiante2); //1
        estudiantes.add(estudiante3); //2
        estudiantes.add(estudiante4); //3
        
        // FOR - EACH
        for (Estudiante estudiante : estudiantes) {
            System.err.println("nombre: " + estudiante.getNombre());
        }
        
        // Ejercicio 3
        //System.err.println("Lista convertida a String: " + estudiantes);
        
        //Ejercicio 4
        Estudiante lorena = estudiantes.get(2);
        lorena.setNombre("Paquita");
        
        System.err.println("Nombre modificado: " +  estudiantes.get(2));
    }
}
