package ConversorMonedas;

import java.text.DecimalFormat;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	//Conversor
		private static void Conversion(double valor , double monedaAConvertir, String nombreMoneda) {
				double resultado = valor / monedaAConvertir;
				DecimalFormat decimal = new DecimalFormat("#.00");
				//resultado =(double) Math.round(resultado *100)/100; //reducir decimales				
				JOptionPane.showMessageDialog(null, "El valor convertido es: " + decimal.format(resultado) + nombreMoneda);
		}
	
	//Monedas
	public void ConvertirPesosColombianosADolar(double valor) {
		Conversion(valor, 4825.87, " dólares estadounidenses"); //segundo paramatro es el valor de pesos en 1 dólar
	}
	
	public void ConvertirPesosColombianosAEuro(double valor) {
		Conversion(valor, 5089.77, " euros");
	}
	
	public void ConvertirPesosColombianosALibras(double valor) {
		Conversion(valor, 5937.68 , " libras esterlinas");
	}
	
	public void ConvertirPesosColombianosAYen(double valor) {
		Conversion(valor, 35.23, " yenes japonéses");
	}
	
	public void ConvertirPesosColombianosAWonCoreano(double valor) {
		Conversion(valor, 3.70, " wones surcoreanos");
	}
	
	public void ConvertirDolaresAPesosColombiano(double valor) {
		Conversion(valor, 0.00021, " pesos colombianos");
	}
	
	public void ConvertirEurosAPesosColombiano(double valor) {
		Conversion(valor, 0.00020, " pesos colombianos");
	}
	
	public void ConvertirLibrasAPesosColombiano(double valor) {
		Conversion(valor, 0.00017, " pesos colombianos");
	}
	
	public void ConvertirYenAPesosColombiano(double valor) {
		Conversion(valor, 0.028, " pesos colombianos");
	}
	
	public void ConvertirWonCoreanoAPesosColombiano(double valor) {
		Conversion(valor, 0.27, " pesos colombianos");
	}
}

