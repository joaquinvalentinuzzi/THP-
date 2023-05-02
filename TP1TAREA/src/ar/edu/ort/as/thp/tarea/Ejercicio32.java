package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

/*
 * 32. Realizá un programa que permita validar la nota de un examen de la misma manera que el 
ejercicio 29 pero con las siguientes nuevas directivas: 
Las notas 1 y 3 no usan nunca. 
La nota O se reserva para los ausentes 
En resumen, las notas válidas pueden ser un 2 o un valor entre 4 y 10.
 * */




public class Ejercicio32 {

	
	final static Scanner input = new Scanner(System.in);
	final static int NOTA_MINIMA = 0;
	final static int NOTA_MAXIMA = 10;

	public static void main(String[] args) {
      int nota;
      
      System.out.println("Ingrese una nota ya sea 2 o entre 4 y 10");
      nota = Integer.parseInt(input.nextLine());
      
      while (nota < NOTA_MINIMA || nota == 0 || nota == 1 || nota == 3 || nota > NOTA_MAXIMA) {
     System.out.println("Error: la nota maxima no entra en los parametros solicitados");
		
     System.out.println("Por valor, Ingrese una nota entre 0 y 10");
     nota = Integer.parseInt(input.nextLine());
     
	}
      
      System.out.println("La nota del alumno es de : " + nota);
      
	}

}
