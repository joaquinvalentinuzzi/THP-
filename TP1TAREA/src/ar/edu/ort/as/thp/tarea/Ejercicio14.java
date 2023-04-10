package ar.edu.ort.as.thp.tarea;


/*
14. Para entrar a la montaña rusa Infierno en las alturas se requiere tener al menos 7 años y medir más de 1,50 metros.
Completá el siguiente cuadro a mano según los requisitos y luego escribí el programa que permita, ejecutándolo cada vez 
para cada niño y según las edades y estaturas ingresadas por el usuario, obtener los mismos resultados para los siguientes 
datos: 
Nombre Edad Altura  ¿Entra al juego? (V/F) 
Juan     5   1.45
María    7   1.23
Luis     8   1.51
Ana      9   1.39
 
 
 

*/


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
