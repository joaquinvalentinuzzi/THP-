package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;
/*7. Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y 
el valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno
y la cantidad de metros de alambre para cercarlo completamente a tres alturas distintas.*/
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
