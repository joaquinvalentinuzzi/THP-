package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio30 {
	private static Scanner input = new Scanner(System.in);	

	public static void main(String[] args) {
char operacion;
int numero1 , numero2;
double resultado = 0;



do {
	System.out.println("ingrese una operacion : '+,'-','*','/' o 'F' para Finalizar");
	operacion = input.nextLine().charAt(0);

} while (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/' && operacion != 'F');



while (operacion != 'F') {
	System.out.println("ingrese el primer numero");
	numero1= Integer.parseInt(input.nextLine());
	
	System.out.println("ingrese el segundo numero");
	numero2= Integer.parseInt(input.nextLine());
	
	
	switch (operacion) {
	case '+' :
		resultado = numero1 + numero2;
		System.out.println("el resultado es: " + resultado);

		break;
	case '-' :
		resultado = numero1 - numero2;
		System.out.println("el resultado es: " + resultado);

		break;
	case '*' :
		resultado = numero1 * numero2;
		System.out.println("el resultado es: " + resultado);

		break;
	case '/' :
		if (numero2 != 0) {
			resultado = (double) numero1 / numero2;
			System.out.println("el resultado es: " + resultado);

		}else {
			System.out.println("MATH ERROR: No se puede dividir por cero");
		}
		
		break;
	}
	
	
	do {
		System.out.println("ingrese una operacion : '+,'-','*','/' o 'F' para Finalizar");
		operacion = Character.toUpperCase(input.nextLine().charAt(0));

		
	} while (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/' && operacion != 'F');
	
	
}

System.out.println("-----FIN----");

input.close();

	}

}
