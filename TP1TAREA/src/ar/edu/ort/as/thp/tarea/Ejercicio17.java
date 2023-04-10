package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio17 {
	private static  Scanner input = new Scanner(System.in);
	static final int EDAD_JUBILACION_MUJERES = 60;
	static final int EDAD_JUBILACION_HOMBRES = 65;
	static final int EDAD_MINIMO = 1;
	static final int EDAD_MAXIMO = 120;
	
	public static void main(String[] args) {
		char genero;
		int edad;
		
		System.out.println("Ingresa su edad");
		edad = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese su genero: ('F' para Mujeres , 'M' si es para hombres)");
		genero =Character.toUpperCase(input.nextLine().charAt(0)); //ASI CUALQUIER COSA ESTA EN MAYUSCULA
		
		
		
		if (((genero == 'F') || (genero == 'M')) && ((edad>EDAD_MINIMO) && (edad < EDAD_MAXIMO))) {
			
			if (genero == 'F') {
				if (edad >= EDAD_JUBILACION_MUJERES) {
					System.out.println("Se puede Jubilar");
				} else {
					System.out.println("No tiene la edad suficiente para jubilarse");

				}
				
			} else {
				if (edad >= EDAD_JUBILACION_HOMBRES) {
					System.out.println("Se puede Jubilar");
					
				} else {
					System.out.println("No tiene la edad suficiente para jubilarse");

				}

			}
			
		} else {
			System.out.println("Valores erroneo intente nuevamente");

		}

		input.close();
	}

}
