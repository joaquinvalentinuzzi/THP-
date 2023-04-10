package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio11 {
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num;
		
		System.out.println("Ingrese un numero");
		num = Integer.parseInt(input.nextLine());
		
		if (num % 2 == 0) {
			System.out.println("Es par");
			
		} else {
			System.out.println("Es impar");

		}

	}

}
