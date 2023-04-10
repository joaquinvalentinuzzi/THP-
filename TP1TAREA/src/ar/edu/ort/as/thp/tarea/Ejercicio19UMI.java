package ar.edu.ort.as.thp.tarea;
/*
19. Existen dos reglas que identifican dos conjuntos de valores: 
a. El número es de un solo dígito. 
b. El número es impar. 
Trabajo Práctico N° 1 
A partir de estas reglas, realizá un programa que permita ingresar un número entero.
 Debe asignar el valor que corresponda a las variables booleanas esDeUnSoloDigito, esImpar,
 estaEnAmbosGrupos y noEstaEnNingunGrupo el valor Verdadero o Falso, según corresponda, 
para indicar si el valor número ingresado pertenece o no a cada conjunto. 
Al terminar el programa debe informar el número cargado y las cuatros variables lógicas.
Definí un lote de prueba de varios números y probá el algoritmo, escribiendo los resultados tal como se hizo en los
ejercicios anteriores. 

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
