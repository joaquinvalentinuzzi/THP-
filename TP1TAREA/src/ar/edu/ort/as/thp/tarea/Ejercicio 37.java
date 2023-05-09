package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;
/*37. Realizá un programa que permita al usuario ingresar hasta 12 valores, de a uno por vez, que representan los sueldos 
 * mensuales que percibió un empleado durante un año calendario. Si durante la carga de los sueldos mensuales se detecta un valor negativo,
 *  esto indica que aún no se ha cobrado el mes en curso, y en ese caso se debe dejar de ingresar datos.
 *  Al finalizar mostrar el monto percibido por el empleado hasta ese momento (total o parcial).
 * 
 * */
public class Ejercicio37 {
	final static Scanner input = new Scanner(System.in);
	final static int SUELDO_SIN_PAGAR = 0;
	final static int CANT_TOTAL_SUELDO_MENSUALES = 12;

	public static void main(String[] args) {

		int mes = 1, sueldoMes, sueldoTotal = 0;

		System.out.println("Ingrese el sueldo del "+ (mes +1)  +"° mes");
		sueldoMes = Integer.parseInt(input.nextLine());

		while (sueldoMes > SUELDO_SIN_PAGAR && mes <= CANT_TOTAL_SUELDO_MENSUALES) {

			do {
				sueldoTotal += sueldoMes;

				mes++;

				System.out.println("Ingrese el sueldo del " + mes + "° mes");
				sueldoMes = Integer.parseInt(input.nextLine());

			} while (sueldoMes > SUELDO_SIN_PAGAR && mes <= CANT_TOTAL_SUELDO_MENSUALES);
		}

		if (sueldoMes > SUELDO_SIN_PAGAR) {
			System.out.println("Se le pago " + mes + " meses , la suma total es de: " + sueldoTotal);
		} else {

			System.out.println("Se le debe pagar el ultimo mes, el sueldo total es de " + sueldoTotal);
		}
	
	input.close();
	}
	

}
