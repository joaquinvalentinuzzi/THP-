package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio9 {
	static final Scanner input = new Scanner(System.in);
	static final int ANGULOS_TOTALES = 180;

	public static void main(String[] args) {

	double angulo1,angulo2,anguloFaltante;
	
	
	
	System.out.println("Ingrese el primer angulo");
	angulo1 = Integer.parseInt(input.nextLine());
	
	System.out.println("Ingrese el segundo angulo");
	angulo2 = Integer.parseInt(input.nextLine());
	
	if ((angulo1 + angulo2) < ANGULOS_TOTALES) {
		if ((angulo1 + angulo2) >0) {
			anguloFaltante =  ANGULOS_TOTALES - (angulo1 + angulo2);
			System.out.println("El angulo faltante es de: " + anguloFaltante);
		} else {
			System.out.println("No existe");

		}
		
	} else {
		System.out.println("LA SUMA DE LOS ANGULOS DEBEN DAR 180");

	}
	
	
	
	}

}
