package ar.edu.ort.as.thp.tarea;

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
