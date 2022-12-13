package ConversorMonedas;

import java.io.UnsupportedEncodingException;
import javax.swing.JOptionPane;
import ConversorTemperaturas.OpcionesTemperaturas;
public class Principal {

	public Principal() {};
	
	//Preguntamos si desea realizar la operacion
	public static int Opciones() {

		//Preguntamos si quiere hacer otra operacion
		int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operacion?");
		System.out.println(seleccion);
		
		//Realizamos las operaciones dependiendo de la decision del usuario
		if(JOptionPane.OK_OPTION == seleccion) {
			main(null);
		}else {
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}	
		return seleccion;
	}
	
  
	 //Operacion principal
	public static void main (String[] args){
		OpcionesMonedas monedasOpcion = new OpcionesMonedas(); //Instanciando para poder usar los metodos de la clase
		OpcionesTemperaturas temperaturasOpcion = new OpcionesTemperaturas();
		
		//Mostramos las opciones iniciales
		String opciones = (String) JOptionPane.showInputDialog(null,
				"Seleccione una opción", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, 
				new Object[] {"Conversor de Moneda", 
							  "Conversor de Temperatura"}, 
			"Seleccion");
		if(opciones != null) {
		//Segun las opciones
		switch(opciones){
			case "Conversor de Moneda": {	
				String opcion = JOptionPane.showInputDialog("Ingrese un valor a convertir");
				
				//Si no escribe un numero siempre estara mostrando este while
				if(opcion != null) {
					while(!Validacion.isNumber(opcion)) {		
						opcion = JOptionPane.showInputDialog(null,
								"Valor no aceptado. Por favor inserte un numero");
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}
				
				try {
					if(opcion == null ) {	
						return;
					}					
							//Si no hay error hacer lo siguiente
							double valorRecibido = Double.parseDouble(opcion);
							monedasOpcion.ConvertirMonedas(valorRecibido);
							Opciones();
							
					} catch (NullPointerException me){
					 //throw new RuntimeException(me);
					String msg = me.getMessage(); 
		            System.out.println("Exception " + msg);
		            me.printStackTrace();
				}				
				break;						
		}
		
		case "Conversor de Temperatura": {
			String opcion = JOptionPane.showInputDialog("Ingrese un valor a convertir");
			
			//Si no escribe un numero siempre estara mostrando este while
			if(opcion != null) {
				while(!Validacion.isNumber(opcion)) {		
					opcion = JOptionPane.showInputDialog(null,
							"Valor no aceptado. Por favor inserte un numero");
				}
				
			}else {
				JOptionPane.showMessageDialog(null, "Programa terminado");
			}
			
			try {
				if(opcion == null ) {	
					return;
				}
					//Si no hay error hacer lo siguiente
					double valorRecibido = Double.parseDouble(opcion);
									
					//if( valorRecibido == 1)
					temperaturasOpcion.ConvertirTemperaturas(valorRecibido);
					Opciones();
				
						
				} catch (NullPointerException me){
				 //throw new RuntimeException(me);
				String msg = me.getMessage(); 
	            System.out.println("Exception " + msg);
	            me.printStackTrace();
			}				
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " );
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Programa terminado");
		}
	}
	
}
