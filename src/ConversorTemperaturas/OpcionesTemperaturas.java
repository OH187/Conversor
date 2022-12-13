package ConversorTemperaturas;

import javax.swing.JOptionPane;

public class OpcionesTemperaturas {
	ConvertirTemperaturas temperaturas = new ConvertirTemperaturas();
	
	public void ConvertirTemperaturas(double valor) {
		
		//Dando opciones de conversion
		String opciones =  (String) (JOptionPane.showInputDialog(null,
				"Seleccione una opción", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, 
				new Object[] {"Celsius a kelvin", 
							  "Celsius a Fahrenheit", 
							  "Fahrenheit a Celsius",
							  "Fahrenheit a Kelvin", 
							  "Kelvin a Fahrenheit", 
							  "Kelvin a Celsius"}, 
				"Seleccion"));
		
		//Tomamos el boton cancelar, si se oprime cerramos el programa
		if(opciones != null) {
			switch (opciones) {
			case "Celsius a kelvin":{
				temperaturas.CelsiusAKelvin(valor);
				break;
			}
			case "Celsius a Fahrenheit":{
				temperaturas.CelsiusAFarenheit(valor);
				break;
			}
			case "Fahrenheit a Celsius":{
				temperaturas.FarenheitACelsius(valor);
				break;
			}
			case "Fahrenheit a Kelvin":{
				temperaturas.FarenheitAKelvin(valor);
				break;
			}
			case "Kelvin a Fahrenheit":{
				temperaturas.KelvinAFarenheit(valor);
				break;
			}
			case "Kelvin a Celsius":{
				temperaturas.KelvinACelsius(valor);
				break;
			}		
			default:
				throw new IllegalArgumentException("Unexpected value: " + opciones);
			}
				
			//Aqui cerramos
		}else {
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}
	}
}

