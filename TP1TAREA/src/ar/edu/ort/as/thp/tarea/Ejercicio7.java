package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio7 {
	static final Scanner input = new Scanner(System.in);
	static final int ALTURAS = 3;
	

	public static void main(String[] args) {
		double ancho, largo,valorMetroCuadrado, valorTotal, metroAlambre, metrosCaudrados;
		
		System.out.println("Ingrese el ancho");
		ancho = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese el largo");
		largo = Double.parseDouble(input.nextLine());
				
		System.out.println("Ingrese el valor por Metro cuadrado");
		valorMetroCuadrado = Double.parseDouble(input.nextLine());
		
		metrosCaudrados= ancho +  largo;
		
		valorTotal = valorMetroCuadrado * metrosCaudrados;
		
		metroAlambre = metrosCaudrados * ALTURAS;
		
		
		System.out.println("El valor de terreno es de : " +  valorTotal + " y la cantidad de alambre que se necesita es de :" +metroAlambre );

	}

}
