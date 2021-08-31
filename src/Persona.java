public class Persona {
	public int edad;
	public int anioDeNacimiento;
	
	public String esMayorDeEdad (int edad) {
		String mensaje;
		
		if (edad >= 18) {
			mensaje = "Es mayor de edad";
		}else {
			mensaje = "No es mayor de edad";
		}
		
		return mensaje;
	}
	
	public int calcularEdad (int anioDeNacimiento) {
		int edadActual = 2021;
		
		edadActual = edadActual - anioDeNacimiento;
		
		return edadActual;
	}
}