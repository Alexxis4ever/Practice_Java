import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	HashMap<String,Double> datos = new HashMap<String,Double>();
	
	double Porcomision = 0;
	double comision = 0;

	public void inicio() {

		int Ecantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos empleados quiere agregar?"));
		
		for (int i = 0; i < Ecantidad; i++) {
			String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
			double ventas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ventas"));
			datos.put(nombre, ventas);
		}

		String menu = "MENU TIPO DE VENDEDOR\n";
		menu+= "1. TIPO VENDEDOR: A - 8%\n";
		menu+= "2. TIPO VENDEDOR: B - 6%\n";
		menu+= "3. TIPO VENDEDOR: C - 4%\n";
		menu+= "4. TIPO VENDEDOR: D - 2%\n";
		menu+= "5. Salir\n";
		menu+= "Elija una opcion";
		
		int cod = 0;

		
		do{
			cod=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch(cod) {
			case 1: Porcomision = 0.08;
			break;
			
			case 2: Porcomision = 0.06;
			break;
			
			case 3: Porcomision = 0.04; 
			break;
			
			case 4: Porcomision = 0.02; 
			break;
			
			case 5: 
			break;
			
			default: System.out.println("Codigo no existe");
			break;
			}
			
			procesos();
			
		}while(cod!=5);
		
	}

	private void procesos() {
		
		int cantidadMayor = 0;
		double sumaComisiones = 0;
		
		for(Map.Entry<String,Double> element : datos.entrySet()) {
			
			comision = Porcomision * element.getValue();
			
			System.out.println("Nombre: "+element.getKey()+ " Comision: "+comision);
			
			 sumaComisiones = (sumaComisiones)+comision;
			
			if(comision>=500000) {
				cantidadMayor++;
			}
			
			System.out.println("Comision : "+comision);
			System.out.println("--------------------------------");
					
		};
		
		System.out.println("Concepto de comision "+sumaComisiones);
		System.out.println("Empleados con una comision mayor a $500.000 : "+cantidadMayor);	
		System.out.println("----------------------------------------------");
		
		
	}

}