package ar.edu.ort.as.thp.tarea;

/*1. Realizá un programa que permita que el usuario ingrese su nombre. El programa debe emitir 
una salida con un mensaje de bienvenida que incluya el nombre ingresado. [EC] */

import java.util.Scanner;

public class Ejercicio1 {
final static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		String nombre;
		
		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();
		
		System.out.println("Bienvenido "+ nombre);
	}

}
