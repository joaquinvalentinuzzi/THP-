package ar.edu.ort.as.thp.tarea;

35. Realizá un programa que permita ingresar nombre y
edad de un grupo de personas (para cada una, nombre y edad). 
La carga termina cuando en el nombre de la persona se ingresa un asterisco ('*'). 
Mostrar al final cómo se llama la persona más joven. 
import java.util.Scanner;

public class Ejercicio35 {
	final static Scanner input = new Scanner(System.in);

	final static String SALIDA = "*";

	public static void main(String[] args) {

		int edadMinima = Integer.MAX_VALUE, edad = 0;
		String nombre, nombreJoven = null;

		System.out.println("ingrese el nombre");
		nombre = input.nextLine();

		while (!nombre.equals(SALIDA)) {

			System.out.println("Ingrese la edad");
			edad = Integer.parseInt(input.nextLine());

			if (edad < edadMinima) {
				edadMinima = edad;
				nombreJoven = nombre;

				System.out.println("ingrese el nombre");
				nombre = input.nextLine();

				
			}

		}

		
		if (edadMinima == Integer.MAX_VALUE) {
			System.out.println("No se ingreso datos");
		}else {		System.out.println(nombreJoven + " es la persona mas joven con " + edadMinima);
}

	}

}
