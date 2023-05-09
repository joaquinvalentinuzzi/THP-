package ar.edu.ort.as.thp.tarea;


import java.util.Scanner;

/*34. Realizá un programa que permita ingresar la estatura
 *  (en metros con decimales) de cada jugador de un equipo de baloncesto.
 *   La carga finalizará al ingresar cero. 
 *   Calcular y mostrar la estatura promedio del equipo.
 * */

public class Ejercicio34 {

	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double estaturaJugador = 0, promedio, estaturaTotal = 0;
		int i = 0;

		do {
			System.out.println("Ingrese la estatura");
			estaturaJugador = Double.parseDouble(input.nextLine());

			if (estaturaJugador != 0) {

				estaturaTotal += estaturaJugador;

				i++;

			}

		} while (estaturaJugador != 0);

		promedio = estaturaTotal / i;

		System.out.println("El promedio de estatura del equipo es de " + promedio);

		input.close();

	}

}|
