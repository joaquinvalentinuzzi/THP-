package ar.edu.ort.as.thp.tarea;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio24 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1,num2,i;
		
		System.out.println("Ingrese el primer numero");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese un segundo numero igual o mayor al anterior");
		num2 = Integer.parseInt(input.nextLine());

		
		while (num1 > num2) {
			System.out.println("ERROR, intentelo nuevamente, por favor,Ingrese el primer numero");
			num1 = Integer.parseInt(input.nextLine());
			
			System.out.println("Ingrese un segundo numero igual o mayor al anterior");
			num2 = Integer.parseInt(input.nextLine());

		}
		
		System.out.println("INCLUYENDO");
		
		for (i = num1; i<=num2; i++) {
			System.out.println(i);
			
		}
		
		System.out.println("EXCLUYENDO");

		for (i = num1 + 1; i<num2; i++) {
			System.out.println(i);
			
		}
	
	input.close();
	}
	
	

}
