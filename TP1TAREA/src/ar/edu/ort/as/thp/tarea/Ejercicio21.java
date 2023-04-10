package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio21 {
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;

		System.out.println("Ingrese el numero del dia( DEL 1 AL 7)");
		numero = Integer.parseInt(input.nextLine());

		switch (numero) {
		case 1:
			System.out.println("Domingo");

			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;

		case 4:
			System.out.println("Miercoles");
			break;

		case 5:
			System.out.println("Jueves");
			break;

		case 6:
			System.out.println("Viernes");
			break;

		case 7:
			System.out.println("Sabado");

			break;

		default:
			System.out.println("ERROR Numero fuera del rango");
			break;
		}
		input.close();
	}

}
