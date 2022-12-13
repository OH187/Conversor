package ConversorTemperaturas;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConvertirTemperaturas {
	
		//Celsius a
		public void CelsiusAFarenheit(double valor) {
			double resultado = (valor * 1.8) + 32;
			DecimalFormat decimal = new DecimalFormat("#.00");				
			JOptionPane.showMessageDialog(null, valor + " grados °Celsius equivalen a " + decimal.format(resultado) + " grados °Farenheit");
		}		
		public void CelsiusAKelvin(double valor) {
			double resultado = valor + 273.15;
			DecimalFormat decimal = new DecimalFormat("#.00");				
			JOptionPane.showMessageDialog(null, valor + " grados °Celsius equivalen a " + decimal.format(resultado) + " grados °kelvin");
		}
		
		//Farenheit a
		public void FarenheitACelsius(double valor) {
			double resultado = (valor-32) *  0.5556;
			DecimalFormat decimal = new DecimalFormat("#.00");				
			JOptionPane.showMessageDialog(null, valor + " grados °Farenheit equivalen a " + decimal.format(resultado) + " grados °Celsius");
		}		
		public void FarenheitAKelvin(double valor) {
			double op1 = (valor-32) + 273.15;
			double resultado = 0.5556 * op1;
			DecimalFormat decimal = new DecimalFormat("#.00");				
			JOptionPane.showMessageDialog(null, valor + " grados °Farenheit equivalen a " + decimal.format(resultado) + " grados °Kelvin");
		}
		
		//Kelvin a
		public void KelvinACelsius(double valor) {
			double resultado = valor-273.15;
			DecimalFormat decimal = new DecimalFormat("#.00");				
			JOptionPane.showMessageDialog(null, valor + " grados °Kelvin equivalen a " + decimal.format(resultado) + " grados °Celsius");
		}		
		
		public void KelvinAFarenheit(double valor) {
			double operacion1 = (valor-273.15) * 1.8;
			double resultado = operacion1 + 32;
			DecimalFormat decimal = new DecimalFormat("#.00");				
			JOptionPane.showMessageDialog(null, valor + " grados °kelvin equivalen a " + decimal.format(resultado) + " grados °Farenheit");
		}
		
		
}
