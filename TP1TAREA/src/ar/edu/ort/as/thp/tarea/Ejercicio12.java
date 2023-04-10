package ar.edu.ort.as.thp.tarea;
/*
12. Realizá un programa que permita ingresar dos números enteros e indique cuál de ellos es el 
mayor.
*/
import java.util.Scanner;

public class Ejercicio12 {
	static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
    int num1, num2;
    
    System.out.println("Ingrese el primer numero");
    num1 = Integer.parseInt(input.nextLine());
    
    System.out.println("Ingrese el segundo numero");
    num2 = Integer.parseInt(input.nextLine());
    
   if (num1 != num2 ) {
	   if (num1 > num2 ) {
		System.out.println(num1 + " es mayor que " + num2);
	} else {
		System.out.println(num2 + " es mayor que " + num1);

	}
	
} else {
	System.out.println("Los numeros son iguales");

}
    
   input.close();
    
	}

}
