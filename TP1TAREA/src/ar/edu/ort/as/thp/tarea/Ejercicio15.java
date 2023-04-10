package ar.edu.ort.as.thp.tarea;

/*
15. Para entrar a la montaña rusa Miedo a las alturas, algo más chica y tranquila que la anterior,
alcanza con que se cumpla solamente una de las siguientes condiciones: ser mayor de 6 años o medir más de 1,50 metros. 
Realizá el mismo procedimiento que con el ejercicio anterior pero con los nuevos requisitos. [EC] 
Nombre Edad Altura  ¿Entra al juego? (V/F) 
Juan     5   1.45
María    7   1.23
Luis     8   1.51
Ana      9   1.39

*/

import java.util.Scanner;

public class Ejercicio15 {
	static final Scanner input = new Scanner(System.in);
	static final int EDAD_REQUERIDA = 7;
	static final double ALTURA_REQUERIDA = 1.50;
	public static void main(String[] args) {


		String nombre;
		int edad;
		double altura;

		System.out.println("Ingrese su nombre");
		nombre = input.nextLine();

		System.out.println("Ingrese su edad");
		edad = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese su altura");
		altura = Double.parseDouble(input.nextLine());

		if ((edad > EDAD_REQUERIDA) && (altura > ALTURA_REQUERIDA)) {
			
			System.out.println(nombre + " Puede subirse al juego");

		} else {
			System.out.println(nombre + " NO PUEDE subirse al juego");

		}

	}

}
