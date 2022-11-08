import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public void inicio() {

		
		ArrayList<Integer> arrayA = new ArrayList<Integer>();
		ArrayList<Integer> arrayB = new ArrayList<Integer>();
		ArrayList<Integer> arrayC = new ArrayList<Integer>();
		
		int tamañoListas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de las listas"));
		
		
		JOptionPane.showMessageDialog(null,"Llenado del ArrayList A","ARREGLO",JOptionPane.WARNING_MESSAGE);
		
		for (int i = 0; i < tamañoListas; i++) {
			
			int numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "+(i+1)));
			
			
			if (numeros<0) {
				i--;
				JOptionPane.showMessageDialog(null, "No se permiten datos negativos.", "ERROR", JOptionPane.ERROR_MESSAGE );
			} else {
				arrayA.add(numeros);
			}
		}
		
		
		
		
		JOptionPane.showMessageDialog(null,"Llenado del ArrayList B","ARREGLO",JOptionPane.WARNING_MESSAGE);
		
		for (int i = 0; i < tamañoListas; i++) {
			
			int numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "+(i+1)));
			
			
			
			if (numeros<0) {
				i--;
				JOptionPane.showMessageDialog(null, "No se permiten datos negativos.", "ERROR", JOptionPane.ERROR_MESSAGE );
			} else {
				arrayB.add(numeros);
			}
		}
		
		
		for (int i = 0; i < arrayA.size(); i++) {
			
			arrayC.add(arrayA.get(i)*arrayB.get(i));
			
		}
		
		System.out.println("Datos lista A: "+arrayA);
		System.out.println("Datos lista B: "+arrayB);
		
		System.out.println();
		
		System.out.println("El resultado de la multiplicacion de 2 listas del mismo tamaño es: "+arrayC);
		
		System.out.println("*********************************");
		

		
	}

}
