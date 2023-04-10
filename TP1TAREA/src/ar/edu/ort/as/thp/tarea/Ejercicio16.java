package ar.edu.ort.as.thp.tarea;
/*16. Realizá un programa que permita ingresar la cantidad de inscriptos a una conferencia y
la cantidad de asientos disponibles en el auditorio. Debes indicar si alcanzan los asientos, 
Si los asientos no alcanzaran indicar cuántos faltan para que todos los inscriptos puedan sentarse*/
import java.util.Scanner;

public class Ejercicio16 {
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int inscriptos, sillas, sillasFaltantes, sillasSobrantes;
		
		System.out.println("Ingrese la cantidad de inscriptos");
		inscriptos = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la cantidad de sillas");
		sillas = Integer.parseInt(input.nextLine());
		
		
		if (sillas != inscriptos) {
			if (sillas < inscriptos) {
				sillasFaltantes = inscriptos - sillas;
				System.out.println("La cantidad de sillas que falntan es de: " + sillasFaltantes);
				
			} else {
				sillasSobrantes = sillas - inscriptos;
				System.out.println("La cantidad de sillas que Sobran es de: " + sillasSobrantes);

			}
			
			
		} else {
			System.out.println("La cantidad de sillas es igual a la cantidad de inscriptos");

		}
	
		
		input.close();
	}

}
