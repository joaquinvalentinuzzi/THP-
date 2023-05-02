package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

/*
 * 33. Realizá un programa que permita al usuario ingresar números hasta que se introduzca un 0. 
La computadora debe mostrar el número máximo y el número mínimo.
 */
public class Ejercicio33 {
	final static Scanner input = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		int numero, numeroMaximo = Integer.MIN_VALUE, numeroMinimo = Integer.MAX_VALUE;
	
		
		do {
			
		
		System.out.println("Ingrese un numero (o ingrese 0 para salir)");
		numero = Integer.parseInt(input.nextLine());
		
		if (numero !=0) {
			
			if (numero > numeroMaximo) {
				numeroMaximo = numero;
				
			} 
			
			if (numero < numeroMinimo) {
				numeroMinimo = numero;
			}

			
		}
		
		
		

		} while (numero != 0);
		if (numeroMaximo == Integer.MIN_VALUE) {
			
			System.out.println("No se ingreso datos");
			
		} else {
			System.out.println("El numero Maxmo es de: " + numeroMaximo +" y el numero minimo es de:  "+ numeroMinimo);


		}

		
		
		input.close();
	}

}
