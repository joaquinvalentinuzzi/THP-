package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio18 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b;

		System.out.println("ingrese el primer numero");
		a = Integer.parseInt(input.nextLine());

		System.out.println("ingrese el segundo numero");
		b = Integer.parseInt(input.nextLine());

		// El 0 es divisor universal!

		if (a != b) {
			if (a > b) {
				if (a % b == 0) {
					System.out.println(a + " es divisor de " + b);

				} else {
					System.out.println(a + " NO es divisor de " + b);

				}

			} else {
				if (b % a == 0) {
					System.out.println(b + " es divisor de " + a);

				} else {
					System.out.println(b + " 5NO es divisor de " + a);

				}

			}

		} else {
			System.out.println("Los numeros son iguales, por lo que son divisibles!");

		}
	}

}
