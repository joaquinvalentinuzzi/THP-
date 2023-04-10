package ar.edu.ort.as.thp.tarea;
/*
23. Realizá un programa que permita ingresar un número entero n. Debe mostrar los primeros 
10 múltiplos de n (desde 1 x n). 

*/


import java.util.Scanner;

public class Ejercicio23 {
	private static Scanner input = new Scanner(System.in);
   final static int CANTIDAD_MULTIPLOS = 10;

	public static void main(String[] args) {
		int i,numero;
		double resultado;
		
		System.out.println("Ingrese un numero");
		numero = Integer.parseInt(input.nextLine());
		
		for (i = 1; i <= CANTIDAD_MULTIPLOS; i++) {
			resultado = i * numero;
			
			System.out.println(resultado);
			
			
		}

	}

}
