package ar.edu.ort.as.thp.tarea;

/*
28. Realizá un programa que a partir de un número entero cant ingresado por el usuario permita cargar por teclado cant números enteros.
La computadora debe mostrar cuál fue el mayor número y en qué posición apareció.
*/

import java.util.Scanner;

public class Ejercicio28 {
	private static Scanner input = new Scanner(System.in);	

	public static void main(String[] args) {
		int cant, i=0, numeroMaximo = Integer.MIN_VALUE, numero, posicion = 0;
		
		System.out.println("Ingrese la cantidad de numeros enteros");
		cant = Integer.parseInt(input.nextLine());
		
		do {
			System.out.println("Ingrese un numero entero");
			numero = Integer.parseInt(input.nextLine());	
			
			i++;
			
			if (numero > numeroMaximo) {
				posicion = i;
				
				numeroMaximo = numero;
				
			}
			
			
		} while (i < cant);

		System.out.println("El numero Maxio es "+ numeroMaximo + " y se encuentra en la posicion " + posicion);
	}

}
