package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio14 {
	static final Scanner input = new Scanner(System.in);
	static final int EDAD_REQUERIDA = 6;
	static final double ALTURA_REQUERIDA = 1.50;

	public static void main(String[] args) {
		String nombre;
		int edad;
		double altura;

		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();

		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese su altura");
		altura = Double.parseDouble(input.nextLine());

		if ((edad > EDAD_REQUERIDA) || (altura > ALTURA_REQUERIDA)) {
			
			System.out.println(nombre + " Puede subirse al juego");

		} else {
			System.out.println(nombre + " NO PUEDE subirse al juego");

		}

	}

}
