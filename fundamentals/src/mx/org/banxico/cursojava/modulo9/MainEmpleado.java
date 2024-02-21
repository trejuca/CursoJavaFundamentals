package mx.org.banxico.cursojava.modulo9;

public class MainEmpleado {

	public static void main(String[] args) {
		
		//Empleado empleado = new Empleado();
		
		Empleado empleado1 = new EmpleadoAsalariado();
		Empleado empleado2 = new EmpleadoPorHoras();
		Empleado empleado3 = new EmpleadoPorComision();
		Empleado empleado4 = new EmpleadoBaseMasComision();
		
//		empleado1.calcularSueldo();
//		empleado2.calcularSueldo();
//		empleado3.calcularSueldo();
//		empleado4.calcularSueldo();
		
		// Forma 1 para determinar el tipo de objeto
//		System.out.println(empleado1.getClass());
//		System.out.println(empleado2.getClass());
//		System.out.println(empleado3.getClass());
//		System.out.println(empleado4.getClass());
		
		// Forma 2 atraves de castear un objeto
		
		// Lanza una excepcion ya que EmpleadoPorComision no es un EmpleadoAsalariado
		//EmpleadoAsalariado empleadoAsalariado = (EmpleadoAsalariado)empleado3;
		
		// Un EmpleadoBaseMasComision es un EmpleadoPorComision. Todo Ok!
		//EmpleadoPorComision empleadoPorComision = (EmpleadoPorComision)empleado4;
		
		// Lanza una excepcion ya que EmpleadoPorComision no es un EmpleadoBaseMasComision
		// EmpleadoBaseMasComision empleadoPorComision2 = (EmpleadoBaseMasComision)empleado3;
		
		// Forma 3 atraves de la palabra reservada instanceof
		
		if (empleado4 instanceof EmpleadoAsalariado) {
			System.out.println("empleado4 es un EmpleadoAsalariado");
		} else {
			System.out.println("empleado4 NOO es un EmpleadoAsalariado");
		}

	}
}
