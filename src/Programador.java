public class Programador {
	
	public void repetirMensaje(String mensaje, int cantidadQueSeRepite) {
		for (int i = 0; i < cantidadQueSeRepite; i++ ) {
			System.out.println(mensaje);
		}
	}
	
	public boolean sePuedeDividir (int primerNumero,int segundoNumero) {
		boolean permisoDeDivision;
		
		if (segundoNumero != 0) {
			permisoDeDivision = true;
		}else {
			permisoDeDivision = false;
		}
		
		return permisoDeDivision;
	}
}