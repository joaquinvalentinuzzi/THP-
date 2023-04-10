package ar.edu.ort.as.thp.tarea;

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
