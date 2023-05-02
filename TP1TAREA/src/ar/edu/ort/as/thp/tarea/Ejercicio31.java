package ar.edu.ort.as.thp.tarea;

/*31. Realizá un programa que permita validar una opción ingresada.
 *  Se le preguntará al usuario si desea continuar con alguna operación de la forma 
 *  "¿Deseás continuar? [S/N]". Se espera que el usuario ingrese una 'S' o una 'N' (incluir las minúsculas).
 *   La opción debe ser ingresada tanto como sea necesario hasta que quede comprendida dentro de las posibilidades 
 *   esperadas. Realizá este ejercicio en dos versiones (A y B): con ciclo while y con ciclo do-while.*/

import java.util.Scanner;

public class Ejercicio31 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		char operacion;
		//-----------CON WHILE------------------

		System.out.println("CON WHILE");

		System.out.println("¿Deseás continuar? [S/N]");
		operacion = Character.toUpperCase(input.nextLine().charAt(0));

		while (operacion != 'N') {

			if (operacion == 'S') {
				System.out.println("SE CONTINUA  CON EL PROCESO");

			} else {
				System.out.println("Error, opcion ingresada no valida");
			}

			System.out.println("¿Deseás continuar? [S/N]");
			operacion = Character.toUpperCase(input.nextLine().charAt(0));

		}
		System.out.println("FIN DEL PROGRAMA CON WHILE");

		//-----------CON DO WHILE------------------
		
		System.out.println("CON DO WHILE");
		
		
		do {

			System.out.println("¿Deseás continuar? [S/N]");
			operacion = Character.toUpperCase(input.nextLine().charAt(0));

			if (operacion == 'S') {
				System.out.println("SE CONTINUA  CON EL PROCESO");

			} else  if (operacion == 'N'){
				
			}else {
				System.out.println("Error, opcion ingresada no valida");
			}

			
		} while (operacion != 'N');
		
		System.out.println("FIN DEL PROGRAMA CON DO-WHILE");

		input.close();
	}


}
