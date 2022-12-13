package ConversorMonedas;

public class Validacion {

	//Validamos si es un numero
	public static boolean isNumber(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
}
