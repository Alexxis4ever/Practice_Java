import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio4 {

	ArrayList<Integer> array1 = new ArrayList<Integer>();
	ArrayList<Integer> array2 = new ArrayList<Integer>();
	
	int datoA=0, datoB=0, valorDeX=0;
	
	public void inicio() {
		
		String  preg ="";
		
		do {
			hallarValorDeX();
			preg = JOptionPane.showInputDialog("Desea continuar? ingrese si");
			
			
		} while (preg.equalsIgnoreCase("si"));
		
		
		
	}

	private void hallarValorDeX() {
		
		datoA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de A"));
		array1.add(datoA);
		
		datoB = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de B"));
		array2.add(datoB);
		
		
		
		for (int i = 0; i < array1.size(); i++) {
			
			valorDeX = array1.get(i) + (array2.get(i)*2*array1.get(i));
			
		}
		
		System.out.println("El valor de X es: "+valorDeX);
		
		
		
		
		
		
		
		
	}

}
