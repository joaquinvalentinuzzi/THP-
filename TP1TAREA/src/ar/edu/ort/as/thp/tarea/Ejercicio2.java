package ar.edu.ort.as.thp.tarea;

/*2. Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos 
para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio.*/
import java.util.Scanner;

public class Ejercicio2 {
	final static Scanner input = new Scanner(System.in);
	static final int CANT_NOTAS = 3;

	public static void main(String[] args) {
		
		double nota1,nota2,nota3,promedio;
		
		
		System.out.println("Ingrese la primera nota");
		nota1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la segunda nota");
		nota2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la tercera nota");
		nota3 = Integer.parseInt(input.nextLine());
		
		
		promedio = (nota1 + nota2 + nota3)/CANT_NOTAS;
		
		System.out.println("el promedio del alumno es de : "+ promedio);
		
		input.close();

	}

}
