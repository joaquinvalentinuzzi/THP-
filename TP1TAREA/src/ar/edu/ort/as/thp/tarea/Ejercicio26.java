package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio26 {
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		double numero, i = 0, resultado1 ;
		

		System.out.println("Ingrese un numero");
		numero = Integer.parseInt(input.nextLine());
		
		do {
			resultado1 = 3 * i;
			if (resultado1 % 5 !=0) {
				System.out.println(resultado1);
			}
			
			i++;
		} while (i <= numero);

	}

}
