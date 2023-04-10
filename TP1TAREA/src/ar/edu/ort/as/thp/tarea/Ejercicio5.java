package ar.edu.ort.as.thp.tarea;
/*5. Realizá un programa que permita ingresar valores del mismo tipo para las variables num1
y num2. Una vez cargadas, mostrar ambas variables por pantalla, intercambiá sus valores 
(que lo cargado en num1 quede en num2, y viceversa) y volvé a mostrarlas actualizadas. [EC]*/
import java.util.Scanner;

public class Ejercicio5 {
	static final Scanner input = new Scanner(System.in);

	public static void numeroInvertido(String[] args) {
		
		double num1, num2, aux;
		
		System.out.println("Ingrese el primer numero");
		num1  = Double.parseDouble(input.nextLine());	
		
		System.out.println("Ingrese el segundo numero");
		num2  = Double.parseDouble(input.nextLine());	
		
		System.out.println("El valor de num1 es de :" + num1 + " y num2 es de: "+ num2);

		aux = num1;
		num1= num2;
		num2= aux;
		
		
		System.out.println("INVERTIDO : El valor de num1 es de :" + num1 + " y num2 es de: "+ num2);

		
		
	}

}
