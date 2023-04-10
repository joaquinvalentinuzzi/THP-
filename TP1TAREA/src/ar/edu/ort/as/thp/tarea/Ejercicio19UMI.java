package ar.edu.ort.as.thp.tarea;
/*
18. Realizá un programa que permita al usuario ingresar dos números enteros. 
La computadora debe indicar si el mayor es divisible por el menor.
(Un número entero a es divisible por un número entero b cuando el resto de la división entre aybes 0
*/


import java.util.Scanner;

public class Ejercicio19UMI {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		boolean esDeUnSoloDigito = false, esImpar = false , estaEnAmbosGrupos = false, noEstaEnNingunGrupo = false;
		int numero;
		
		System.out.println("Ingrese un n�mero entero:");
		 numero = Integer.parseInt(input.nextLine());

		if (numero > -10 && numero < 10) {
			esDeUnSoloDigito = true;
		}

		if (numero % 2 != 0) {
			esImpar = true;
		}

		if (esDeUnSoloDigito && esImpar) {
			estaEnAmbosGrupos = true;
		} else if (!esDeUnSoloDigito && !esImpar) {
			noEstaEnNingunGrupo = true;
		}

		//System.out.println("Resultados del n�mero ingresado: " + numero);
		//System.out.println("esDeUnSoloDigito = " + esDeUnSoloDigito);
		System.out.println("esImpar = " + esImpar);
		System.out.println("estaEnAmbos = " + estaEnAmbosGrupos);
		System.out.println("noEstaEnNinguno = " + noEstaEnNingunGrupo);
	}
	

}
