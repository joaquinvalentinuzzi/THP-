package ar.edu.ort.as.thp.tarea;
/*
27. Realizá un programa que permita ingresar 5 edades. Calcular y mostrar el promedio de todas 
las edades ingresadas y cuántas edades fueron valores impares mayores que 18.
*/
import java.util.Scanner;

public class Ejercicio27 {
	private static Scanner input = new Scanner(System.in);	
	final static int EDAD_COMPARADA = 18;
	final static int EDAD_MINIMA = 0;
	final static int EDAD_MAXIMA = 120;
	final static int CANTIDAD_EDADES = 5;
	

	public static void main(String[] args) {
		int edad, i=0, contadorEdadMayoresImpares=0,total = 0;
		double promedio;
		
		
		do {
			

		do {
			System.out.println("Ingrese una edad");
			edad = Integer.parseInt(input.nextLine());
			
		} while (edad < EDAD_MINIMA || edad > EDAD_MAXIMA);
		
		
		total = total + edad;
		i++;
		promedio = total / i;     
		
		if ((edad > EDAD_COMPARADA) && (edad  % 2 !=0)) {
			
			contadorEdadMayoresImpares = contadorEdadMayoresImpares+1;
			
		}
		
		
		
		} while (i < CANTIDAD_EDADES);
		
		System.out.println("El promedio fue de :"+ promedio + " y la cantidad de edades impares mayores de 18 fueron : "+ contadorEdadMayoresImpares);
	}

}
