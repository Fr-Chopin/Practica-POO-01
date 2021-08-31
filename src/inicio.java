import javax.swing.JOptionPane;

public class inicio {

	public static void main(String[] args) {
//		Monitor pantalla = new Monitor();
//		String nombre;
//		String apellido;
//		String mensaje;
//		
//		nombre = JOptionPane.showInputDialog("Ingrese su nombre");
//		apellido = JOptionPane.showInputDialog("Ingrese su apellido");
//		
//		pantalla.imprimir();
//		pantalla.imprimirNombre(nombre);
//		mensaje = pantalla.imprimirNombreYApellido(nombre, apellido);
//		
//		System.out.println(mensaje);
		
//		-------------------------------------------------------------------------
		
//		Persona nazareno = new Persona();
//		String mensaje;
//		int edadActual;
//		
//		nazareno.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad actual"));
//		mensaje = nazareno.esMayorDeEdad(nazareno.edad);
//		System.out.println(mensaje);
//		
//		nazareno.anioDeNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento"));
//		edadActual = nazareno.calcularEdad(nazareno.anioDeNacimiento);
//		System.out.println("Tu edad actual es: " + edadActual);
//		
//		-------------------------------------------------------------------------
		
//		Calculadora calculator2000 = new Calculadora();
//		int primerNumero;
//		int segundoNumero;
//		int suma, resta, multiplicacion;
//		int numeroMayor, numeroMenor;
//		
//		primerNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er numero: "));
//		segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2do numero: "));
//		
//		suma = calculator2000.sumar(primerNumero, segundoNumero);
//		resta = calculator2000.restar(primerNumero, segundoNumero);
//		multiplicacion = calculator2000.multiplicar(primerNumero, segundoNumero);
//		numeroMayor = calculator2000.calcularMayor(primerNumero, segundoNumero);
//		numeroMenor = calculator2000.calcularMenor(primerNumero, segundoNumero);
//		
//		System.out.println("La suma de " + primerNumero + " y " + segundoNumero + " es: " + suma);
//		System.out.println("La resta es: " + resta);
//		System.out.println("La multiplicación es: " + multiplicacion);
//		System.out.println("El mayor es: " + numeroMayor);
//		System.out.println("El menor es: " + numeroMenor);
//		
//		-------------------------------------------------------------------------

		Programador genius = new Programador();
		String mensaje;
		int cantidadQueSeRepite;
		
		mensaje = JOptionPane.showInputDialog("Ingresar mensaje");
		cantidadQueSeRepite = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de veces que se va a repetir el mensaje"));
		
		genius.repetirMensaje(mensaje, cantidadQueSeRepite);
		

		
		int numerador;
		int denominador;
		boolean permisoDeDivision;
		
		numerador = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numerador"));
		denominador = Integer.parseInt(JOptionPane.showInputDialog("Ingresar denominador"));
		
		permisoDeDivision = genius.sePuedeDividir(numerador, denominador);
		
		System.out.println(permisoDeDivision);
		
	}

}
