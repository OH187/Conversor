package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesMonedas {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
		//Dando opciones de conversion
		String opciones = (String) (JOptionPane.showInputDialog(null,
				"Seleccione una opción", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, 
				new Object[] {"Pesos a Dólar", 
							  "Pesos a Euros", 
							  "Pesos a Libras",
							  "Pesos a Yen", 
							  "Pesos a Won Coreano", 
							  "Dólar a Pesos",
							  "Euros a Pesos",
							  "Libras a Pesos",
							  "Yen a Pesos",
							  "Won Coreano a Pesos",}, 
				"Seleccion"));
		
		
		if(opciones != null) {
				switch (opciones) {
				case "Pesos a Dólar": {
					monedas.ConvertirPesosColombianosADolar(valor);	
					break;
					
				}
				case "Pesos a Euros": {
					monedas.ConvertirPesosColombianosAEuro(valor);
					break;
				}
				case "Pesos a Libras": {
					monedas.ConvertirPesosColombianosALibras(valor);
					break;
				}
				case "Pesos a Yen": {
					monedas.ConvertirPesosColombianosAYen(valor);
					break;
				}
				case "Pesos a Won Coreano": {
					monedas.ConvertirPesosColombianosAWonCoreano(valor);
					break;
				}
				case "Dólar a Pesos": {
					monedas.ConvertirDolaresAPesosColombiano(valor);
					break;
				}
				case "Euros a Pesos": {
					monedas.ConvertirEurosAPesosColombiano(valor);
					break;
				}
				case "Libras a Pesos": {
					monedas.ConvertirLibrasAPesosColombiano(valor);
					break;
				}
				case "Yen a Pesos": {
					monedas.ConvertirYenAPesosColombiano(valor);
					break;
				}
				case "Won Coreano a Pesos": {
					monedas.ConvertirWonCoreanoAPesosColombiano(valor);
					break;
			}
				default:
					throw new IllegalArgumentException("Unexpected value: " + opciones);
		}
				//Tomamos el null del boton cancelar y cerramos el programa
	}else {
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}
	}

}
