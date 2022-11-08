import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Ejercicio1 ej1 = new Ejercicio1();
		Ejercicio2 ej2 = new Ejercicio2();
		Ejercicio3 ej3 = new Ejercicio3();
		Ejercicio4 ej4 = new Ejercicio4();
		
		String menu="MENU EJERCICIOS\n";
		menu+="1. Ejercicio 1\n";
		menu+="2. Ejercicio 2\n";
		menu+="3. Ejercicio 3\n";
		menu+="4. Ejercicio 4\n";
		menu+="5. Salir\n";
		menu+="Elije una de las opciones";
		
		
		int cod=0;
		
		do {
			
			cod = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (cod) {
			
			case 1:
				ej1.inicio();
				break;
				
			case 2:
				ej2.inicio();
				break;
				
			case 3:
				ej3.inicio();
				break;
				
			case 4:
				ej4.inicio();
				break;
				
			case 5:
				System.out.println("Hasta luego");
				break;
				
			default: System.out.println("El codigo no existe");
				break;
			}
			
			
		} while (cod!=5);

	}

}
