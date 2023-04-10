package ar.edu.ort.as.thp.tarea;

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
