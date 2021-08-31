public class Monitor {

	public void imprimir() {
		System.out.println("Hola mundo!");
	}
	public void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es " + nombre);
	}
	public String imprimirNombreYApellido(String nombre, String apellido) {
		String mensaje;
		
		mensaje = "Me llamo " + nombre + " " + apellido;
		
		return mensaje;
	}
}