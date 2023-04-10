package ar.edu.ort.as.thp.tarea;



/*
22. Realizá un programa que muestre todos los números enteros del 1 al 5, y luego los mismos 
números pero en orden inverso.
*/
import java.util.Scanner;

public class Ejercicio22 {
	private static Scanner input = new Scanner(System.in);

   final static int LIMITE_SUPERIOR = 5;
   final static int LIMITE_INFERIOR = 1;
   
	public static void main(String[] args) {
		int i;
		
		
		
		for (i = LIMITE_INFERIOR; i <=LIMITE_SUPERIOR ; i++) {
			System.out.println(i);
			
		}

		for (i = LIMITE_SUPERIOR; i >=LIMITE_INFERIOR ; i--) {
			System.out.println(i);
			
		}

		input.close();
	}

}
