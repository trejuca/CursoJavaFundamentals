package mx.org.banxico.cursojava.modulo7;


public class Persona {

	private String id;
	private String name;
	//Composicion
	
	private Persona() {

	}
	

	
	// Clase interna anonima
	protected class Subpersona {
		
		private String password; 
		
		public static void main(String[] args) {
			new Persona();
		}
	}
}

