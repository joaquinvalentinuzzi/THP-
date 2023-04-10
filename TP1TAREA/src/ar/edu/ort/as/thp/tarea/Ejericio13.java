package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejericio13 {
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2, num3;

		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese el segundo numero");
		num2 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese el tercer numero");
		num3 = Integer.parseInt(input.nextLine());

		if (num1 != num2) {
			if (num1 > num2) {
				if (num1 > num3) {
					System.out.println("El numero 1 es mayor con: " + num1);

				} else {
					System.out.println("El numero 3 es mayor con: " + num3);

				}
			} else {
				if (num2 > num3) {
					System.out.println("El numero 2 es mayor con: " + num2);
				} else {
					System.out.println("El numero 3 es mayor con: " + num3);

				}

			}

		} else {
			if (num1 != num3) {
				if (num1 > num3) {
					System.out.println("El numero 1 es mayor con: " + num1);
				} else {
					System.out.println("El numero 3 es mayor con: " + num3);

				}

			} else {
				if (num2 != num3) {
					if (num2 > num3) {

						System.out.println("El numero 1  y 2 es mayor con: " + num2);

					} else {
						System.out.println("El numero 3 es mayor con: " + num3);

					}

				} else {
					System.out.println("SON IGUALES");

				}

			}

		}

	}

}
