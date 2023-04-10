package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio20 {
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1, num2;
		char operacion;
		double resultado=0;

		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese la expresion que desea ( + . - . * , /)");
		operacion = input.nextLine().charAt(0);
		System.out.println("Ingrese el segundo numero");
		num2 = Integer.parseInt(input.nextLine());

		

		switch (operacion) {
		case '+':
			resultado = num1 + num2;
			System.out.println(resultado);

			break;
		case '-':
			resultado = num1 - num2;
			System.out.println(resultado);

			break;
		case '*':
			resultado = num1 * num2;
			System.out.println(resultado);


			break;
		case '/':
			if (num2 !=0) {
				resultado = num1 / num2;
				System.out.println(resultado);

			}else {
				System.out.println("MATH ERROR");
			}

			break;

		default:
			break;
		}

		//System.out.println(resultado);
	}

}
