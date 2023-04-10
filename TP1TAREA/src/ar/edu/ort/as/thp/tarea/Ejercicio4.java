package ar.edu.ort.as.thp.tarea;

import java.util.Scanner;

public class Ejercicio4 {
	static final Scanner input = new Scanner(System.in);
	static final int DIAS_HABILES_LABORALES = 5;
	

	public static void ValorSalario (String[] args) {
		
		double valorHora ,cantHoraDia ,horasSabado,horasTotales,horasDiasHabiles, salSem ;
		
		
		System.out.println("Ingrese el valor de la hora");
		valorHora  = Double.parseDouble(input.nextLine());	
		

		System.out.println("Ingrese la cantidad de horas que trabaja por dia");
		cantHoraDia  = Double.parseDouble(input.nextLine());	
		
		horasSabado = cantHoraDia / 2;
		horasDiasHabiles = cantHoraDia * DIAS_HABILES_LABORALES ;
		horasTotales = horasDiasHabiles + horasSabado;
		salSem = horasTotales * valorHora;
		
		System.out.println("El salario semanal es de :" + salSem);
		
		input.close();

	}

}
