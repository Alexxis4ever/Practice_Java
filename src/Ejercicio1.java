import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public void inicio() {
		
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		
		int positivos=0;
		int negativos=0;
		int suma=0;
		int promedio=0;
		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros que desea agregar"));
		
		
		for (int i = 0; i < cantidad; i++) {
			
			int nNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "+(i+1)));
			listaNumeros.add(nNumeros);
			
			
			suma=(suma)+nNumeros;
			
			
			if (nNumeros>0) {
				positivos++;
			} else {
				negativos++;
			}
		}
		
		promedio = suma / cantidad;
		
		System.out.println(listaNumeros);
		
		
		System.out.println("La suma de todos los numeros es: "+suma);
		
		System.out.println("El promedio de numeros es: "+promedio);
		
		System.out.println("La cantidad de numeros negativos es: "+negativos);
		
		System.out.println("La cantidad de numeros positivos es: "+positivos);

		
		System.out.println("****************************");
		
		
		
	}

}
