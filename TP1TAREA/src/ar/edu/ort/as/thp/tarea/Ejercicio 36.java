package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;
/*36. Realizá un programa que permita ingresar números mientras el 
 * promedio entre todos los ingresados sea menor a 20. 
 * Al terminar el ingreso indicar la cantidad de valores leídos.
 * */
public class Ejercicio36 {


	final static Scanner input = new Scanner(System.in);
	final static int PROMEDIO_MAXIMO = 20;
	
	public static void main(String[] args) {

		int i = 0, numero;
		double promedio = 0.0;
		
		
		do {
			System.out.println("Ingrese un numero");
			numero = Integer.parseInt(input.nextLine());
			
			i++;
			
			promedio = (double) numero / i;
			
			
			
		} while (promedio <= PROMEDIO_MAXIMO);
		
		System.out.println("la cantidad de valores leidos fueron de: " + i );
	input.close();	
	}
	

}
