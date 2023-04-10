package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio29 {
	private static Scanner input = new Scanner(System.in);	
	final static int NOTA_MINIMA = 0;
	final static int NOTA_MAXIMA = 10;

	public static void main(String[] args) {
      int nota;
      
      System.out.println("Ingrese una nota entre 0 y 10");
      nota = Integer.parseInt(input.nextLine());
      
      while (nota < NOTA_MINIMA || nota > NOTA_MAXIMA) {
     System.out.println("Error: la nota maxima no entra en los parametros solicitados");
		
     System.out.println("Por valor, Ingrese una nota entre 0 y 10");
     nota = Integer.parseInt(input.nextLine());
     
	}
      
      System.out.println("La nota del alumno es de : " + nota);
      
	}

}
