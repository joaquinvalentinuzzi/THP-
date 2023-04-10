package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio8 {
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2, resultado;
		
		System.out.println("Ingresar primer numero");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingresar segundo numero");
		num2 = Integer.parseInt(input.nextLine());
		
		
		resultado = num1 + num2;
		System.out.println("Suma: " + resultado);
		
		resultado = num1 - num2;
		System.out.println("resta: " + resultado);
		
		resultado = num1 * num2;
		System.out.println("multiplicacion: " + resultado);
		
	if (num2 != 0) {
		resultado = num1 / num2;
		System.out.println("Division: " + resultado);

		
	} else {
		System.out.println("No se puede dividir por cero");

	}

	}

}
