public class Calculadora {
	
	public int sumar(int primerNumero, int segundoNumero) {
		int suma;
		suma = primerNumero + segundoNumero;
		return suma;
	}
	
	
	public int restar(int primerNumero, int segundoNumero) {
		int resta;
		resta = primerNumero - segundoNumero;
		return resta;
	}
	
	
	public int multiplicar(int primerNumero, int segundoNumero) {
		int multiplicacion;
		multiplicacion = primerNumero * segundoNumero;
		return multiplicacion;
	}
	
	
	public int calcularMayor(int primerNumero, int segundoNumero) {
		int mayor;
		
		if (primerNumero > segundoNumero) {
			mayor = primerNumero;
		}else {
			mayor = segundoNumero;
		}
		
		return mayor;
	}
	
	
	public int calcularMenor(int primerNumero, int segundoNumero) {
		int menor;
		
		if (primerNumero < segundoNumero) {
			menor = primerNumero;
		}else {
			menor = segundoNumero;
		}
		
		return menor;
	}
}