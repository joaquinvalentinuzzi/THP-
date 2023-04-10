package ar.edu.ort.as.thp.tarea;
/*
17. Realizá un programa que permita ingresar una edad (entre 1 y 120 años) y un género
('F' para mujeres, 'M' para hombres). En caso de haber ingresado valores erróneos (edad fuera de rango o género inválido),
informar tal situación y terminar el programa. Si los datos están bien ingresados el programa debe indicar, sabiendo que las mujeres
se jubilan con 60 años o más y los hombres con 65 años o más, 
si la persona está en edad de jubilarse
*/
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
